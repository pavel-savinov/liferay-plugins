package com.liferay.screens.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ScreensDDLRecordService}.
 *
 * @author José Manuel Navarro
 * @see ScreensDDLRecordService
 * @generated
 */
public class ScreensDDLRecordServiceWrapper implements ScreensDDLRecordService,
    ServiceWrapper<ScreensDDLRecordService> {
    private ScreensDDLRecordService _screensDDLRecordService;

    public ScreensDDLRecordServiceWrapper(
        ScreensDDLRecordService screensDDLRecordService) {
        _screensDDLRecordService = screensDDLRecordService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _screensDDLRecordService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _screensDDLRecordService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _screensDDLRecordService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public com.liferay.portal.kernel.json.JSONObject getDDLRecord(
        long ddlRecordId, java.util.Locale locale)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _screensDDLRecordService.getDDLRecord(ddlRecordId, locale);
    }

    @Override
    public com.liferay.portal.kernel.json.JSONArray getDDLRecords(
        long ddlRecordSetId, java.util.Locale locale, int start, int end)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _screensDDLRecordService.getDDLRecords(ddlRecordSetId, locale,
            start, end);
    }

    @Override
    public com.liferay.portal.kernel.json.JSONArray getDDLRecords(
        long ddlRecordSetId, long userId, java.util.Locale locale, int start,
        int end)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _screensDDLRecordService.getDDLRecords(ddlRecordSetId, userId,
            locale, start, end);
    }

    @Override
    public int getDDLRecordsCount(long ddlRecordSetId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _screensDDLRecordService.getDDLRecordsCount(ddlRecordSetId);
    }

    @Override
    public int getDDLRecordsCount(long ddlRecordSetId, long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _screensDDLRecordService.getDDLRecordsCount(ddlRecordSetId,
            userId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ScreensDDLRecordService getWrappedScreensDDLRecordService() {
        return _screensDDLRecordService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedScreensDDLRecordService(
        ScreensDDLRecordService screensDDLRecordService) {
        _screensDDLRecordService = screensDDLRecordService;
    }

    @Override
    public ScreensDDLRecordService getWrappedService() {
        return _screensDDLRecordService;
    }

    @Override
    public void setWrappedService(
        ScreensDDLRecordService screensDDLRecordService) {
        _screensDDLRecordService = screensDDLRecordService;
    }
}
