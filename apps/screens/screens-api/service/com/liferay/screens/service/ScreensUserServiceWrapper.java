package com.liferay.screens.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ScreensUserService}.
 *
 * @author José Manuel Navarro
 * @see ScreensUserService
 * @generated
 */
public class ScreensUserServiceWrapper implements ScreensUserService,
    ServiceWrapper<ScreensUserService> {
    private ScreensUserService _screensUserService;

    public ScreensUserServiceWrapper(ScreensUserService screensUserService) {
        _screensUserService = screensUserService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _screensUserService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _screensUserService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _screensUserService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public com.liferay.portal.model.User getCurrentUser()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _screensUserService.getCurrentUser();
    }

    @Override
    public boolean sendPasswordByEmailAddress(long companyId,
        java.lang.String emailAddress)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _screensUserService.sendPasswordByEmailAddress(companyId,
            emailAddress);
    }

    @Override
    public boolean sendPasswordByScreenName(long companyId,
        java.lang.String screenName)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _screensUserService.sendPasswordByScreenName(companyId,
            screenName);
    }

    @Override
    public boolean sendPasswordByUserId(long userId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _screensUserService.sendPasswordByUserId(userId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ScreensUserService getWrappedScreensUserService() {
        return _screensUserService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedScreensUserService(
        ScreensUserService screensUserService) {
        _screensUserService = screensUserService;
    }

    @Override
    public ScreensUserService getWrappedService() {
        return _screensUserService;
    }

    @Override
    public void setWrappedService(ScreensUserService screensUserService) {
        _screensUserService = screensUserService;
    }
}
