package com.liferay.consumer.manager.extension.screens.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PlaceholderService}.
 *
 * @author Brian Wing Shun Chan
 * @see PlaceholderService
 * @generated
 */
public class PlaceholderServiceWrapper implements PlaceholderService,
    ServiceWrapper<PlaceholderService> {
    private PlaceholderService _placeholderService;

    public PlaceholderServiceWrapper(PlaceholderService placeholderService) {
        _placeholderService = placeholderService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _placeholderService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _placeholderService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _placeholderService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public com.liferay.consumer.manager.extension.screens.model.Placeholder addPlaceholder(
        long consumerId, java.lang.String key, java.lang.String name,
        java.lang.String description,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _placeholderService.addPlaceholder(consumerId, key, name,
            description, serviceContext);
    }

    @Override
    public void deletePlaceholders(long consumerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _placeholderService.deletePlaceholders(consumerId);
    }

    @Override
    public java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> getPlaceholders(
        long consumerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _placeholderService.getPlaceholders(consumerId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PlaceholderService getWrappedPlaceholderService() {
        return _placeholderService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPlaceholderService(
        PlaceholderService placeholderService) {
        _placeholderService = placeholderService;
    }

    @Override
    public PlaceholderService getWrappedService() {
        return _placeholderService;
    }

    @Override
    public void setWrappedService(PlaceholderService placeholderService) {
        _placeholderService = placeholderService;
    }
}
