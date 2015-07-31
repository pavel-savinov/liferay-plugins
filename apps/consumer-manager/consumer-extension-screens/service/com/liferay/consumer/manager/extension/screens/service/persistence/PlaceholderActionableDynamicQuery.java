package com.liferay.consumer.manager.extension.screens.service.persistence;

import com.liferay.consumer.manager.extension.screens.model.Placeholder;
import com.liferay.consumer.manager.extension.screens.service.PlaceholderLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PlaceholderActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PlaceholderActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PlaceholderLocalServiceUtil.getService());
        setClass(Placeholder.class);

        setClassLoader(com.liferay.consumer.manager.extension.screens.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("placeholderId");
    }
}
