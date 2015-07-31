package com.liferay.consumer.manager.extension.screens.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PlaceholderLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PlaceholderLocalService
 * @generated
 */
public class PlaceholderLocalServiceWrapper implements PlaceholderLocalService,
    ServiceWrapper<PlaceholderLocalService> {
    private PlaceholderLocalService _placeholderLocalService;

    public PlaceholderLocalServiceWrapper(
        PlaceholderLocalService placeholderLocalService) {
        _placeholderLocalService = placeholderLocalService;
    }

    /**
    * Adds the placeholder to the database. Also notifies the appropriate model listeners.
    *
    * @param placeholder the placeholder
    * @return the placeholder that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.consumer.manager.extension.screens.model.Placeholder addPlaceholder(
        com.liferay.consumer.manager.extension.screens.model.Placeholder placeholder)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _placeholderLocalService.addPlaceholder(placeholder);
    }

    /**
    * Creates a new placeholder with the primary key. Does not add the placeholder to the database.
    *
    * @param placeholderId the primary key for the new placeholder
    * @return the new placeholder
    */
    @Override
    public com.liferay.consumer.manager.extension.screens.model.Placeholder createPlaceholder(
        long placeholderId) {
        return _placeholderLocalService.createPlaceholder(placeholderId);
    }

    /**
    * Deletes the placeholder with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param placeholderId the primary key of the placeholder
    * @return the placeholder that was removed
    * @throws PortalException if a placeholder with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.consumer.manager.extension.screens.model.Placeholder deletePlaceholder(
        long placeholderId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _placeholderLocalService.deletePlaceholder(placeholderId);
    }

    /**
    * Deletes the placeholder from the database. Also notifies the appropriate model listeners.
    *
    * @param placeholder the placeholder
    * @return the placeholder that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.consumer.manager.extension.screens.model.Placeholder deletePlaceholder(
        com.liferay.consumer.manager.extension.screens.model.Placeholder placeholder)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _placeholderLocalService.deletePlaceholder(placeholder);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _placeholderLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _placeholderLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.extension.screens.model.impl.PlaceholderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _placeholderLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.extension.screens.model.impl.PlaceholderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _placeholderLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _placeholderLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _placeholderLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.liferay.consumer.manager.extension.screens.model.Placeholder fetchPlaceholder(
        long placeholderId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _placeholderLocalService.fetchPlaceholder(placeholderId);
    }

    /**
    * Returns the placeholder with the matching UUID and company.
    *
    * @param uuid the placeholder's UUID
    * @param companyId the primary key of the company
    * @return the matching placeholder, or <code>null</code> if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.consumer.manager.extension.screens.model.Placeholder fetchPlaceholderByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _placeholderLocalService.fetchPlaceholderByUuidAndCompanyId(uuid,
            companyId);
    }

    /**
    * Returns the placeholder with the primary key.
    *
    * @param placeholderId the primary key of the placeholder
    * @return the placeholder
    * @throws PortalException if a placeholder with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.consumer.manager.extension.screens.model.Placeholder getPlaceholder(
        long placeholderId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _placeholderLocalService.getPlaceholder(placeholderId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _placeholderLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the placeholder with the matching UUID and company.
    *
    * @param uuid the placeholder's UUID
    * @param companyId the primary key of the company
    * @return the matching placeholder
    * @throws PortalException if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.consumer.manager.extension.screens.model.Placeholder getPlaceholderByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _placeholderLocalService.getPlaceholderByUuidAndCompanyId(uuid,
            companyId);
    }

    /**
    * Returns a range of all the placeholders.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.extension.screens.model.impl.PlaceholderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of placeholders
    * @param end the upper bound of the range of placeholders (not inclusive)
    * @return the range of placeholders
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> getPlaceholders(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _placeholderLocalService.getPlaceholders(start, end);
    }

    /**
    * Returns the number of placeholders.
    *
    * @return the number of placeholders
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPlaceholdersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _placeholderLocalService.getPlaceholdersCount();
    }

    /**
    * Updates the placeholder in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param placeholder the placeholder
    * @return the placeholder that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.consumer.manager.extension.screens.model.Placeholder updatePlaceholder(
        com.liferay.consumer.manager.extension.screens.model.Placeholder placeholder)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _placeholderLocalService.updatePlaceholder(placeholder);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _placeholderLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _placeholderLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _placeholderLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public com.liferay.consumer.manager.extension.screens.model.Placeholder addPlaceholder(
        long consumerId, java.lang.String key, java.lang.String name,
        java.lang.String description,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _placeholderLocalService.addPlaceholder(consumerId, key, name,
            description, serviceContext);
    }

    @Override
    public void deletePlaceholders(long consumerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _placeholderLocalService.deletePlaceholders(consumerId);
    }

    @Override
    public java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> getPlaceholders(
        long consumerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _placeholderLocalService.getPlaceholders(consumerId);
    }

    @Override
    public int getPlaceholdersCount(long consumerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _placeholderLocalService.getPlaceholdersCount(consumerId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PlaceholderLocalService getWrappedPlaceholderLocalService() {
        return _placeholderLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPlaceholderLocalService(
        PlaceholderLocalService placeholderLocalService) {
        _placeholderLocalService = placeholderLocalService;
    }

    @Override
    public PlaceholderLocalService getWrappedService() {
        return _placeholderLocalService;
    }

    @Override
    public void setWrappedService(
        PlaceholderLocalService placeholderLocalService) {
        _placeholderLocalService = placeholderLocalService;
    }
}
