package com.liferay.consumer.manager.extension.screens.service.persistence;

import com.liferay.consumer.manager.extension.screens.model.Placeholder;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the placeholder service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlaceholderPersistenceImpl
 * @see PlaceholderUtil
 * @generated
 */
public interface PlaceholderPersistence extends BasePersistence<Placeholder> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PlaceholderUtil} to access the placeholder persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the placeholders where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching placeholders
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first placeholder in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching placeholder
    * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.consumer.manager.extension.screens.model.Placeholder findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first placeholder in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching placeholder, or <code>null</code> if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.consumer.manager.extension.screens.model.Placeholder fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last placeholder in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching placeholder
    * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.consumer.manager.extension.screens.model.Placeholder findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last placeholder in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching placeholder, or <code>null</code> if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.consumer.manager.extension.screens.model.Placeholder fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.liferay.consumer.manager.extension.screens.model.Placeholder[] findByUuid_PrevAndNext(
        long placeholderId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the placeholders where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of placeholders where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching placeholders
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the placeholders where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching placeholders
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.liferay.consumer.manager.extension.screens.model.Placeholder findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first placeholder in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching placeholder, or <code>null</code> if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.consumer.manager.extension.screens.model.Placeholder fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.liferay.consumer.manager.extension.screens.model.Placeholder findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last placeholder in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching placeholder, or <code>null</code> if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.consumer.manager.extension.screens.model.Placeholder fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.liferay.consumer.manager.extension.screens.model.Placeholder[] findByUuid_C_PrevAndNext(
        long placeholderId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the placeholders where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of placeholders where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching placeholders
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the placeholders where consumerId = &#63;.
    *
    * @param consumerId the consumer ID
    * @return the matching placeholders
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findByConsumerId(
        long consumerId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findByConsumerId(
        long consumerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findByConsumerId(
        long consumerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first placeholder in the ordered set where consumerId = &#63;.
    *
    * @param consumerId the consumer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching placeholder
    * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.consumer.manager.extension.screens.model.Placeholder findByConsumerId_First(
        long consumerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first placeholder in the ordered set where consumerId = &#63;.
    *
    * @param consumerId the consumer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching placeholder, or <code>null</code> if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.consumer.manager.extension.screens.model.Placeholder fetchByConsumerId_First(
        long consumerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last placeholder in the ordered set where consumerId = &#63;.
    *
    * @param consumerId the consumer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching placeholder
    * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.consumer.manager.extension.screens.model.Placeholder findByConsumerId_Last(
        long consumerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last placeholder in the ordered set where consumerId = &#63;.
    *
    * @param consumerId the consumer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching placeholder, or <code>null</code> if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.consumer.manager.extension.screens.model.Placeholder fetchByConsumerId_Last(
        long consumerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.liferay.consumer.manager.extension.screens.model.Placeholder[] findByConsumerId_PrevAndNext(
        long placeholderId, long consumerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the placeholders where consumerId = &#63; from the database.
    *
    * @param consumerId the consumer ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByConsumerId(long consumerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of placeholders where consumerId = &#63;.
    *
    * @param consumerId the consumer ID
    * @return the number of matching placeholders
    * @throws SystemException if a system exception occurred
    */
    public int countByConsumerId(long consumerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the placeholder where key = &#63; or throws a {@link com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException} if it could not be found.
    *
    * @param key the key
    * @return the matching placeholder
    * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.consumer.manager.extension.screens.model.Placeholder findByKey(
        java.lang.String key)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the placeholder where key = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param key the key
    * @return the matching placeholder, or <code>null</code> if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.consumer.manager.extension.screens.model.Placeholder fetchByKey(
        java.lang.String key)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the placeholder where key = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param key the key
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching placeholder, or <code>null</code> if a matching placeholder could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.consumer.manager.extension.screens.model.Placeholder fetchByKey(
        java.lang.String key, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the placeholder where key = &#63; from the database.
    *
    * @param key the key
    * @return the placeholder that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.consumer.manager.extension.screens.model.Placeholder removeByKey(
        java.lang.String key)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of placeholders where key = &#63;.
    *
    * @param key the key
    * @return the number of matching placeholders
    * @throws SystemException if a system exception occurred
    */
    public int countByKey(java.lang.String key)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the placeholder in the entity cache if it is enabled.
    *
    * @param placeholder the placeholder
    */
    public void cacheResult(
        com.liferay.consumer.manager.extension.screens.model.Placeholder placeholder);

    /**
    * Caches the placeholders in the entity cache if it is enabled.
    *
    * @param placeholders the placeholders
    */
    public void cacheResult(
        java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> placeholders);

    /**
    * Creates a new placeholder with the primary key. Does not add the placeholder to the database.
    *
    * @param placeholderId the primary key for the new placeholder
    * @return the new placeholder
    */
    public com.liferay.consumer.manager.extension.screens.model.Placeholder create(
        long placeholderId);

    /**
    * Removes the placeholder with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param placeholderId the primary key of the placeholder
    * @return the placeholder that was removed
    * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a placeholder with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.consumer.manager.extension.screens.model.Placeholder remove(
        long placeholderId)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.consumer.manager.extension.screens.model.Placeholder updateImpl(
        com.liferay.consumer.manager.extension.screens.model.Placeholder placeholder)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the placeholder with the primary key or throws a {@link com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException} if it could not be found.
    *
    * @param placeholderId the primary key of the placeholder
    * @return the placeholder
    * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a placeholder with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.consumer.manager.extension.screens.model.Placeholder findByPrimaryKey(
        long placeholderId)
        throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the placeholder with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param placeholderId the primary key of the placeholder
    * @return the placeholder, or <code>null</code> if a placeholder with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.consumer.manager.extension.screens.model.Placeholder fetchByPrimaryKey(
        long placeholderId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the placeholders.
    *
    * @return the placeholders
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the placeholders from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of placeholders.
    *
    * @return the number of placeholders
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
