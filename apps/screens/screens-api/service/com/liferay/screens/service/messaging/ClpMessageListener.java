package com.liferay.screens.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.liferay.screens.service.ClpSerializer;
import com.liferay.screens.service.ScreensAssetEntryServiceUtil;
import com.liferay.screens.service.ScreensDDLRecordServiceUtil;
import com.liferay.screens.service.ScreensJournalArticleServiceUtil;
import com.liferay.screens.service.ScreensUserServiceUtil;


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
            ScreensAssetEntryServiceUtil.clearService();

            ScreensDDLRecordServiceUtil.clearService();

            ScreensJournalArticleServiceUtil.clearService();

            ScreensUserServiceUtil.clearService();
        }
    }
}
