package com.liferay.consumer.manager.extension.screens.service.impl;

import com.liferay.consumer.manager.extension.screens.model.Placeholder;
import com.liferay.consumer.manager.extension.screens.service.base.PlaceholderLocalServiceBaseImpl;
import com.liferay.consumer.manager.model.ConsumerExtensionInstance;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the placeholder local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.consumer.manager.extension.screens.service.PlaceholderLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.consumer.manager.extension.screens.service.base.PlaceholderLocalServiceBaseImpl
 * @see com.liferay.consumer.manager.extension.screens.service.PlaceholderLocalServiceUtil
 */
public class PlaceholderLocalServiceImpl extends PlaceholderLocalServiceBaseImpl {

    @Override
    public Placeholder addPlaceholder(
            long consumerId, String key, String name, String description,
            ServiceContext serviceContext)
        throws PortalException, SystemException {

        User user = UserLocalServiceUtil
            .getUser(serviceContext.getUserId());

        Date now = new Date();

        long placeholderId = CounterLocalServiceUtil.increment();

        Placeholder placeholder =
            placeholderPersistence.create(placeholderId);

        placeholder.setUuid(serviceContext.getUuid());
        placeholder.setCompanyId(user.getCompanyId());
        placeholder.setUserId(user.getUserId());
        placeholder.setUserName(user.getFullName());
        placeholder.setCreateDate(
            serviceContext.getCreateDate(now));
        placeholder.setModifiedDate(
            serviceContext.getModifiedDate(now));

        placeholder.setConsumerId(consumerId);
        placeholder.setKey(key);
        placeholder.setName(name);
        placeholder.setDescription(description);

        placeholderPersistence.update(placeholder);

        return placeholder;
    }
    @Override
    public void deletePlaceholders(long consumerId)
        throws PortalException, SystemException {

        List<Placeholder> placeholders =
            placeholderPersistence.findByConsumerId(consumerId);

        for (Placeholder placeholder : placeholders) {
            placeholderPersistence.remove(placeholder);
        }
    }

    @Override
    public List<Placeholder> getPlaceholders(long consumerId)
        throws SystemException {

        return placeholderPersistence.findByConsumerId(consumerId);
    }

    @Override
    public int getPlaceholdersCount(long consumerId)
        throws SystemException {

        return placeholderPersistence.countByConsumerId(consumerId);
    }
}
