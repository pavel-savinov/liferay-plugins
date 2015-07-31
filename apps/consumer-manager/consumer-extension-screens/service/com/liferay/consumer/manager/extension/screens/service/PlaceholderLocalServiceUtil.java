package com.liferay.consumer.manager.extension.screens.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Placeholder. This utility wraps
 * {@link com.liferay.consumer.manager.extension.screens.service.impl.PlaceholderLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PlaceholderLocalService
 * @see com.liferay.consumer.manager.extension.screens.service.base.PlaceholderLocalServiceBaseImpl
 * @see com.liferay.consumer.manager.extension.screens.service.impl.PlaceholderLocalServiceImpl
 * @generated
 */
public class PlaceholderLocalServiceUtil {
    private static PlaceholderLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.consumer.manager.extension.screens.service.impl.PlaceholderLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the placeholder to the database. Also notifies the appropriate model listeners.
    *
    * @param placeholder the placeholder
    * @return the placeholder that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder addPlaceholder(
        com.liferay.consumer.manager.extension.screens.model.Placeholder placeholder)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addPlaceholder(placeholder);
    }

    /**
    * Creates a new placeholder with the primary key. Does not add the placeholder to the database.
    *
    * @param placeholderId the primary key for the new placeholder
    * @return the new placeholder
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder createPlaceholder(
        long placeholderId) {
        return getService().createPlaceholder(placeholderId);
    }

    /**
    * Deletes the placeholder with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param placeholderId the primary key of the placeholder
    * @return the placeholder that was removed
    * @throws PortalException if a placeholder with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder deletePlaceholder(
        long placeholderId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePlaceholder(placeholderId);
    }

    /**
    * Deletes the placeholder from the database. Also notifies the appropriate model listeners.
    *
    * @param placeholder the placeholder
    * @return the placeholder that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder deletePlaceholder(
        com.liferay.consumer.manager.extension.screens.model.Placeholder placeholder)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePlaceholder(placeholder);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.liferay.consumer.manager.extension.screens.model.Placeholder fetchPlaceholder(
        long placeholderId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchPlaceholder(placeholderId);
    }

    /**
    * Returns the placeholder with the matching UUID and company.
    *
    * @param uuid the placeholder's UUID
    * @param companyId the primary key of the company
    * @return the matching placeholder, or <code>null</code> if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder fetchPlaceholderByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchPlaceholderByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the placeholder with the primary key.
    *
    * @param placeholderId the primary key of the placeholder
    * @return the placeholder
    * @throws PortalException if a placeholder with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder getPlaceholder(
        long placeholderId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPlaceholder(placeholderId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder getPlaceholderByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPlaceholderByUuidAndCompanyId(uuid, companyId);
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
    public static java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> getPlaceholders(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPlaceholders(start, end);
    }

    /**
    * Returns the number of placeholders.
    *
    * @return the number of placeholders
    * @throws SystemException if a system exception occurred
    */
    public static int getPlaceholdersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPlaceholdersCount();
    }

    /**
    * Updates the placeholder in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param placeholder the placeholder
    * @return the placeholder that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder updatePlaceholder(
        com.liferay.consumer.manager.extension.screens.model.Placeholder placeholder)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updatePlaceholder(placeholder);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static com.liferay.consumer.manager.extension.screens.model.Placeholder addPlaceholder(
        long consumerId, java.lang.String key, java.lang.String name,
        java.lang.String description,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addPlaceholder(consumerId, key, name, description,
            serviceContext);
    }

    public static void deletePlaceholders(long consumerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().deletePlaceholders(consumerId);
    }

    public static java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> getPlaceholders(
        long consumerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPlaceholders(consumerId);
    }

    public static int getPlaceholdersCount(long consumerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPlaceholdersCount(consumerId);
    }

    public static void clearService() {
        _service = null;
    }

    public static PlaceholderLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    PlaceholderLocalService.class.getName());

            if (invokableLocalService instanceof PlaceholderLocalService) {
                _service = (PlaceholderLocalService) invokableLocalService;
            } else {
                _service = new PlaceholderLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(PlaceholderLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(PlaceholderLocalService service) {
    }
}
