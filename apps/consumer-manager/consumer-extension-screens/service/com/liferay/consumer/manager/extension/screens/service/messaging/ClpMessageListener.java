package com.liferay.consumer.manager.extension.screens.service.messaging;

import com.liferay.consumer.manager.extension.screens.service.ClpSerializer;
import com.liferay.consumer.manager.extension.screens.service.PlaceholderLocalServiceUtil;
import com.liferay.consumer.manager.extension.screens.service.PlaceholderServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            PlaceholderLocalServiceUtil.clearService();

            PlaceholderServiceUtil.clearService();
        }
    }
}
