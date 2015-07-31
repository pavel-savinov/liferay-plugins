package com.liferay.consumer.manager.extension.screens.service.persistence;

import com.liferay.consumer.manager.extension.screens.model.Placeholder;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the placeholder service. This utility wraps {@link PlaceholderPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlaceholderPersistence
 * @see PlaceholderPersistenceImpl
 * @generated
 */
public class PlaceholderUtil {
    private static PlaceholderPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Placeholder placeholder) {
        getPersistence().clearCache(placeholder);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Placeholder> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Placeholder> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Placeholder> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Placeholder update(Placeholder placeholder)
        throws SystemException {
        return getPersistence().update(placeholder);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Placeholder update(Placeholder placeholder,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(placeholder, serviceContext);
    }

    /**
    * Returns all the placeholders where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching placeholders
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

    /**
    * Returns a range of all the placeholders where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.extension.screens.model.impl.PlaceholderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of placeholders
    * @param end the upper bound of the range of placeholders (not inclusive)
    * @return the range of matching placeholders
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
    * Returns an ordered range of all the placeholders where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.extension.screens.model.impl.PlaceholderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of placeholders
    * @param end the upper bound of the range of placeholders (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching placeholders
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first placeholder in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching placeholder
    * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first placeholder in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching placeholder, or <code>null</code> if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last placeholder in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching placeholder
    * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last placeholder in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching placeholder, or <code>null</code> if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the placeholders before and after the current placeholder in the ordered set where uuid = &#63;.
    *
    * @param placeholderId the primary key of the current placeholder
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next placeholder
    * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a placeholder with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder[] findByUuid_PrevAndNext(
        long placeholderId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_PrevAndNext(placeholderId, uuid,
            orderByComparator);
    }

    /**
    * Removes all the placeholders where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of placeholders where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching placeholders
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns all the placeholders where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching placeholders
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId);
    }

    /**
    * Returns a range of all the placeholders where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.extension.screens.model.impl.PlaceholderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of placeholders
    * @param end the upper bound of the range of placeholders (not inclusive)
    * @return the range of matching placeholders
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId, start, end);
    }

    /**
    * Returns an ordered range of all the placeholders where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.extension.screens.model.impl.PlaceholderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of placeholders
    * @param end the upper bound of the range of placeholders (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching placeholders
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
    }

    /**
    * Returns the first placeholder in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching placeholder
    * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the first placeholder in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching placeholder, or <code>null</code> if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last placeholder in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching placeholder
    * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last placeholder in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching placeholder, or <code>null</code> if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the placeholders before and after the current placeholder in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param placeholderId the primary key of the current placeholder
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next placeholder
    * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a placeholder with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder[] findByUuid_C_PrevAndNext(
        long placeholderId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_PrevAndNext(placeholderId, uuid, companyId,
            orderByComparator);
    }

    /**
    * Removes all the placeholders where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid_C(uuid, companyId);
    }

    /**
    * Returns the number of placeholders where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching placeholders
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid_C(uuid, companyId);
    }

    /**
    * Returns all the placeholders where consumerId = &#63;.
    *
    * @param consumerId the consumer ID
    * @return the matching placeholders
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findByConsumerId(
        long consumerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByConsumerId(consumerId);
    }

    /**
    * Returns a range of all the placeholders where consumerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.extension.screens.model.impl.PlaceholderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param consumerId the consumer ID
    * @param start the lower bound of the range of placeholders
    * @param end the upper bound of the range of placeholders (not inclusive)
    * @return the range of matching placeholders
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findByConsumerId(
        long consumerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByConsumerId(consumerId, start, end);
    }

    /**
    * Returns an ordered range of all the placeholders where consumerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.extension.screens.model.impl.PlaceholderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param consumerId the consumer ID
    * @param start the lower bound of the range of placeholders
    * @param end the upper bound of the range of placeholders (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching placeholders
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findByConsumerId(
        long consumerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByConsumerId(consumerId, start, end, orderByComparator);
    }

    /**
    * Returns the first placeholder in the ordered set where consumerId = &#63;.
    *
    * @param consumerId the consumer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching placeholder
    * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder findByConsumerId_First(
        long consumerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByConsumerId_First(consumerId, orderByComparator);
    }

    /**
    * Returns the first placeholder in the ordered set where consumerId = &#63;.
    *
    * @param consumerId the consumer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching placeholder, or <code>null</code> if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder fetchByConsumerId_First(
        long consumerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByConsumerId_First(consumerId, orderByComparator);
    }

    /**
    * Returns the last placeholder in the ordered set where consumerId = &#63;.
    *
    * @param consumerId the consumer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching placeholder
    * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder findByConsumerId_Last(
        long consumerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByConsumerId_Last(consumerId, orderByComparator);
    }

    /**
    * Returns the last placeholder in the ordered set where consumerId = &#63;.
    *
    * @param consumerId the consumer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching placeholder, or <code>null</code> if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder fetchByConsumerId_Last(
        long consumerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByConsumerId_Last(consumerId, orderByComparator);
    }

    /**
    * Returns the placeholders before and after the current placeholder in the ordered set where consumerId = &#63;.
    *
    * @param placeholderId the primary key of the current placeholder
    * @param consumerId the consumer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next placeholder
    * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a placeholder with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder[] findByConsumerId_PrevAndNext(
        long placeholderId, long consumerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByConsumerId_PrevAndNext(placeholderId, consumerId,
            orderByComparator);
    }

    /**
    * Removes all the placeholders where consumerId = &#63; from the database.
    *
    * @param consumerId the consumer ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByConsumerId(long consumerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByConsumerId(consumerId);
    }

    /**
    * Returns the number of placeholders where consumerId = &#63;.
    *
    * @param consumerId the consumer ID
    * @return the number of matching placeholders
    * @throws SystemException if a system exception occurred
    */
    public static int countByConsumerId(long consumerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByConsumerId(consumerId);
    }

    /**
    * Returns the placeholder where key = &#63; or throws a {@link com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException} if it could not be found.
    *
    * @param key the key
    * @return the matching placeholder
    * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder findByKey(
        java.lang.String key)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByKey(key);
    }

    /**
    * Returns the placeholder where key = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param key the key
    * @return the matching placeholder, or <code>null</code> if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder fetchByKey(
        java.lang.String key)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByKey(key);
    }

    /**
    * Returns the placeholder where key = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param key the key
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching placeholder, or <code>null</code> if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder fetchByKey(
        java.lang.String key, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByKey(key, retrieveFromCache);
    }

    /**
    * Removes the placeholder where key = &#63; from the database.
    *
    * @param key the key
    * @return the placeholder that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder removeByKey(
        java.lang.String key)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByKey(key);
    }

    /**
    * Returns the number of placeholders where key = &#63;.
    *
    * @param key the key
    * @return the number of matching placeholders
    * @throws SystemException if a system exception occurred
    */
    public static int countByKey(java.lang.String key)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByKey(key);
    }

    /**
    * Caches the placeholder in the entity cache if it is enabled.
    *
    * @param placeholder the placeholder
    */
    public static void cacheResult(
        com.liferay.consumer.manager.extension.screens.model.Placeholder placeholder) {
        getPersistence().cacheResult(placeholder);
    }

    /**
    * Caches the placeholders in the entity cache if it is enabled.
    *
    * @param placeholders the placeholders
    */
    public static void cacheResult(
        java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> placeholders) {
        getPersistence().cacheResult(placeholders);
    }

    /**
    * Creates a new placeholder with the primary key. Does not add the placeholder to the database.
    *
    * @param placeholderId the primary key for the new placeholder
    * @return the new placeholder
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder create(
        long placeholderId) {
        return getPersistence().create(placeholderId);
    }

    /**
    * Removes the placeholder with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param placeholderId the primary key of the placeholder
    * @return the placeholder that was removed
    * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a placeholder with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder remove(
        long placeholderId)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(placeholderId);
    }

    public static com.liferay.consumer.manager.extension.screens.model.Placeholder updateImpl(
        com.liferay.consumer.manager.extension.screens.model.Placeholder placeholder)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(placeholder);
    }

    /**
    * Returns the placeholder with the primary key or throws a {@link com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException} if it could not be found.
    *
    * @param placeholderId the primary key of the placeholder
    * @return the placeholder
    * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a placeholder with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder findByPrimaryKey(
        long placeholderId)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(placeholderId);
    }

    /**
    * Returns the placeholder with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param placeholderId the primary key of the placeholder
    * @return the placeholder, or <code>null</code> if a placeholder with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.consumer.manager.extension.screens.model.Placeholder fetchByPrimaryKey(
        long placeholderId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(placeholderId);
    }

    /**
    * Returns all the placeholders.
    *
    * @return the placeholders
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the placeholders.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.extension.screens.model.impl.PlaceholderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of placeholders
    * @param end the upper bound of the range of placeholders (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of placeholders
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the placeholders from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of placeholders.
    *
    * @return the number of placeholders
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PlaceholderPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PlaceholderPersistence) PortletBeanLocatorUtil.locate(com.liferay.consumer.manager.extension.screens.service.ClpSerializer.getServletContextName(),
                    PlaceholderPersistence.class.getName());

            ReferenceRegistry.registerReference(PlaceholderUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PlaceholderPersistence persistence) {
    }
}
