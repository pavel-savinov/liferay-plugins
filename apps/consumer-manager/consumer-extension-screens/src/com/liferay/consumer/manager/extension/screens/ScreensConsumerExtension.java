/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.consumer.manager.extension.screens;

import com.liferay.consumer.manager.InvalidConsumerExtensionException;
import com.liferay.consumer.manager.api.model.BaseConsumerExtension;
import com.liferay.consumer.manager.api.model.ConsumerExtension;
import com.liferay.consumer.manager.extension.screens.model.Placeholder;
import com.liferay.consumer.manager.extension.screens.service.PlaceholderServiceUtil;
import com.liferay.consumer.manager.extension.screens.util.ScreensConsumerExtensionDisplayContext;
import com.liferay.consumer.manager.model.Consumer;
import com.liferay.consumer.manager.model.ConsumerExtensionInstance;
import com.liferay.consumer.manager.util.ConsumerManagerContextUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Brian Chan
 */
@Component(immediate = true, service = ConsumerExtension.class)
public class ScreensConsumerExtension
	extends BaseConsumerExtension {

	@Activate
	@Override
	public void activate() {
		super.activate();
	}

	@Deactivate
	@Override
	public void deActivate() {
		super.deActivate();
	}

	@Override
	public String getIcon() {
		return "icon-tablet";
	}

	@Override
	public String getSummary(
		ConsumerExtensionInstance extensionInstance, Locale locale) {

		return LanguageUtil.get(locale, extensionInstance.getTypeSettings());
	}

    @Override
    public String processConsumerExtension(
            PortletRequest request, PortletResponse response,
            Map<String, String> values)
        throws InvalidConsumerExtensionException {

        long consumerId = GetterUtil.getLong(values.get("consumerId"));

        try {
            ServiceContext serviceContext =
                ServiceContextFactory.getInstance(
                    Consumer.class.getName(), request);

            PlaceholderServiceUtil.deletePlaceholders(consumerId);

            String placeholdersJson = GetterUtil.getString(
                values.get("placeholdersJson"), null);

            JSONArray placeholderIds = JSONFactoryUtil.createJSONArray();

            if (placeholdersJson != null) {
                List<Map<String, Object>> placeholdersList =
                    (List<Map<String, Object>>) JSONFactoryUtil.
                        looseDeserialize(placeholdersJson);

                for(Map<String, Object> placeholderMap : placeholdersList) {
                    Placeholder placeholder =
                        PlaceholderServiceUtil.addPlaceholder(
                            consumerId, placeholderMap.get("key").toString(),
                            placeholderMap.get("nameCurrentValue").toString(),
                            placeholderMap.get("descriptionCurrentValue").
                                toString(),
                            serviceContext);

                    placeholderIds.put(placeholder.getPlaceholderId());
                }
            }

            JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
            jsonObject.put("placeholderIds", placeholderIds);

            return jsonObject.toString();
        }
        catch (Exception e) {
            _log.error(e, e);
        }

        return "";
    }

    @Override
	protected void populateContext(
		ConsumerExtensionInstance extensionInstance,
		Map<String, Object> context, Map<String, String> values) {

        ScreensConsumerExtensionDisplayContext displayContext =
            new ScreensConsumerExtensionDisplayContext();

        String placeholderTemplate = "";

        try {
            placeholderTemplate = ConsumerManagerContextUtil.parseTemplate(
                getClass(), _PLACEHOLDER_TEMPLATE, context);
        }
        catch (Exception e){
            _log.error(e, e);
        }

        long consumerId = -1;

        Object request = context.get("request");

        if ((request != null) && request instanceof HttpServletRequest) {
            consumerId = ParamUtil.getLong(
                (HttpServletRequest)request, "consumerId", -1);
        }

        if (consumerId > 0) {
            try {
                String placeholdersJson = JSONFactoryUtil.looseSerialize(
                    displayContext.getResults(consumerId));
                context.put(
                    "placeholdersJson", placeholdersJson);
            }
            catch (SystemException e) {
                _log.error(e, e);
            }
        }

        context.put("consumerId", consumerId);
        context.put("screensConsumerExtensionDisplayContext", displayContext);
        context.put("placeholderTemplate", placeholderTemplate);
	}

    private static final Log _log = LogFactoryUtil.getLog(
        ScreensConsumerExtension.class);

    private static final String _PLACEHOLDER_TEMPLATE =
        "templates/add_placeholder.ftl";
}