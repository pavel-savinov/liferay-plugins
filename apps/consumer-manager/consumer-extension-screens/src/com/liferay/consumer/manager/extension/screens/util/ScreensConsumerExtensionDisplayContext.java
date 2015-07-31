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

package com.liferay.consumer.manager.extension.screens.util;

import com.liferay.consumer.manager.extension.screens.model.Placeholder;
import com.liferay.consumer.manager.extension.screens.service.PlaceholderLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.ArrayList;
import java.util.List;

public class ScreensConsumerExtensionDisplayContext {

    public List<Placeholder> getResults() throws SystemException {
        return PlaceholderLocalServiceUtil.getPlaceholders(
            QueryUtil.ALL_POS, QueryUtil.ALL_POS);
    }

    public List<Placeholder> getResults(long consumerId)
        throws SystemException {

        if (consumerId <= 0) {
            return new ArrayList<Placeholder>();
        }

        return PlaceholderLocalServiceUtil.getPlaceholders(consumerId);
    }

    public int getTotal() throws SystemException {
        return PlaceholderLocalServiceUtil.getPlaceholdersCount();
    }

    public int getTotal(long consumerId) throws SystemException {

        if (consumerId <= 0) {
            return 0;
        }

        return PlaceholderLocalServiceUtil.getPlaceholdersCount(consumerId);
    }
}
