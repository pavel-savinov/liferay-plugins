package com.liferay.consumer.manager.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ConsumerService}.
 *
 * @author Brian Wing Shun Chan
 * @see ConsumerService
 * @generated
 */
public class ConsumerServiceWrapper implements ConsumerService,
    ServiceWrapper<ConsumerService> {
    private ConsumerService _consumerService;

    public ConsumerServiceWrapper(ConsumerService consumerService) {
        _consumerService = consumerService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _consumerService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _consumerService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _consumerService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public com.liferay.consumer.manager.model.Consumer addConsumer(
        java.lang.String consumerKey,
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
        java.util.Map<java.util.Locale, java.lang.String> nameMap,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _consumerService.addConsumer(consumerKey, descriptionMap,
            nameMap, serviceContext);
    }

    @Override
    public com.liferay.consumer.manager.model.Consumer deleteConsumer(
        long consumerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _consumerService.deleteConsumer(consumerId);
    }

    @Override
    public com.liferay.consumer.manager.model.Consumer getConsumer(
        long companyId, java.lang.String consumerKey)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _consumerService.getConsumer(companyId, consumerKey);
    }

    @Override
    public java.util.List<com.liferay.consumer.manager.model.Consumer> getConsumers()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _consumerService.getConsumers();
    }

    @Override
    public java.util.List<com.liferay.consumer.manager.model.Consumer> getConsumers(
        long companyId, com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _consumerService.getConsumers(companyId, serviceContext);
    }

    @Override
    public com.liferay.consumer.manager.model.Consumer updateConsumer(
        long consumerId, java.lang.String consumerKey,
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
        java.util.Map<java.util.Locale, java.lang.String> nameMap,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _consumerService.updateConsumer(consumerId, consumerKey,
            descriptionMap, nameMap, serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ConsumerService getWrappedConsumerService() {
        return _consumerService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedConsumerService(ConsumerService consumerService) {
        _consumerService = consumerService;
    }

    @Override
    public ConsumerService getWrappedService() {
        return _consumerService;
    }

    @Override
    public void setWrappedService(ConsumerService consumerService) {
        _consumerService = consumerService;
    }
}
