package com.liferay.consumer.manager.extension.screens.service.impl;

import com.liferay.consumer.manager.extension.screens.model.Placeholder;
import com.liferay.consumer.manager.extension.screens.service.base.PlaceholderServiceBaseImpl;
import com.liferay.consumer.manager.service.permission.ConsumerPermission;
import com.liferay.consumer.manager.util.ActionKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The implementation of the placeholder remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.consumer.manager.extension.screens.service.PlaceholderService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.consumer.manager.extension.screens.service.base.PlaceholderServiceBaseImpl
 * @see com.liferay.consumer.manager.extension.screens.service.PlaceholderServiceUtil
 */
public class PlaceholderServiceImpl extends PlaceholderServiceBaseImpl {

    @Override
    public Placeholder addPlaceholder(
            long consumerId, String key, String name, String description,
            ServiceContext serviceContext)
        throws PortalException, SystemException {

        ConsumerPermission.check(
            getPermissionChecker(), consumerId, ActionKeys.UPDATE);

        return placeholderLocalService.addPlaceholder(
            consumerId, key, name, description,serviceContext);
    }

    @Override
    public void deletePlaceholders(long consumerId)
        throws PortalException, SystemException {

        ConsumerPermission.check(
            getPermissionChecker(), consumerId, ActionKeys.UPDATE);

        placeholderLocalService.deletePlaceholders(consumerId);
    }

    @Override
    public List<Placeholder> getPlaceholders(long consumerId)
        throws PortalException, SystemException {

        ConsumerPermission.check(
            getPermissionChecker(), consumerId, ActionKeys.VIEW_CONSUMERS);

        return placeholderLocalService.getPlaceholders(consumerId);
    }

}
