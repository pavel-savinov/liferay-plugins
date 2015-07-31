package com.liferay.consumer.manager.extension.screens.service.persistence;

import com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException;
import com.liferay.consumer.manager.extension.screens.model.Placeholder;
import com.liferay.consumer.manager.extension.screens.model.impl.PlaceholderImpl;
import com.liferay.consumer.manager.extension.screens.model.impl.PlaceholderModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the placeholder service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlaceholderPersistence
 * @see PlaceholderUtil
 * @generated
 */
public class PlaceholderPersistenceImpl extends BasePersistenceImpl<Placeholder>
    implements PlaceholderPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PlaceholderUtil} to access the placeholder persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PlaceholderImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PlaceholderModelImpl.ENTITY_CACHE_ENABLED,
            PlaceholderModelImpl.FINDER_CACHE_ENABLED, PlaceholderImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PlaceholderModelImpl.ENTITY_CACHE_ENABLED,
            PlaceholderModelImpl.FINDER_CACHE_ENABLED, PlaceholderImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PlaceholderModelImpl.ENTITY_CACHE_ENABLED,
            PlaceholderModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(PlaceholderModelImpl.ENTITY_CACHE_ENABLED,
            PlaceholderModelImpl.FINDER_CACHE_ENABLED, PlaceholderImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(PlaceholderModelImpl.ENTITY_CACHE_ENABLED,
            PlaceholderModelImpl.FINDER_CACHE_ENABLED, PlaceholderImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
            new String[] { String.class.getName() },
            PlaceholderModelImpl.UUID_COLUMN_BITMASK |
            PlaceholderModelImpl.NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(PlaceholderModelImpl.ENTITY_CACHE_ENABLED,
            PlaceholderModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_UUID_UUID_1 = "placeholder.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "placeholder.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(placeholder.uuid IS NULL OR placeholder.uuid = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(PlaceholderModelImpl.ENTITY_CACHE_ENABLED,
            PlaceholderModelImpl.FINDER_CACHE_ENABLED, PlaceholderImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
            new String[] {
                String.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
        new FinderPath(PlaceholderModelImpl.ENTITY_CACHE_ENABLED,
            PlaceholderModelImpl.FINDER_CACHE_ENABLED, PlaceholderImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() },
            PlaceholderModelImpl.UUID_COLUMN_BITMASK |
            PlaceholderModelImpl.COMPANYID_COLUMN_BITMASK |
            PlaceholderModelImpl.NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(PlaceholderModelImpl.ENTITY_CACHE_ENABLED,
            PlaceholderModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "placeholder.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "placeholder.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(placeholder.uuid IS NULL OR placeholder.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "placeholder.companyId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONSUMERID =
        new FinderPath(PlaceholderModelImpl.ENTITY_CACHE_ENABLED,
            PlaceholderModelImpl.FINDER_CACHE_ENABLED, PlaceholderImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByConsumerId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONSUMERID =
        new FinderPath(PlaceholderModelImpl.ENTITY_CACHE_ENABLED,
            PlaceholderModelImpl.FINDER_CACHE_ENABLED, PlaceholderImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByConsumerId",
            new String[] { Long.class.getName() },
            PlaceholderModelImpl.CONSUMERID_COLUMN_BITMASK |
            PlaceholderModelImpl.NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CONSUMERID = new FinderPath(PlaceholderModelImpl.ENTITY_CACHE_ENABLED,
            PlaceholderModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByConsumerId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_CONSUMERID_CONSUMERID_2 = "placeholder.consumerId = ?";
    public static final FinderPath FINDER_PATH_FETCH_BY_KEY = new FinderPath(PlaceholderModelImpl.ENTITY_CACHE_ENABLED,
            PlaceholderModelImpl.FINDER_CACHE_ENABLED, PlaceholderImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByKey",
            new String[] { String.class.getName() },
            PlaceholderModelImpl.KEY_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_KEY = new FinderPath(PlaceholderModelImpl.ENTITY_CACHE_ENABLED,
            PlaceholderModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByKey",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_KEY_KEY_1 = "placeholder.key IS NULL";
    private static final String _FINDER_COLUMN_KEY_KEY_2 = "placeholder.key = ?";
    private static final String _FINDER_COLUMN_KEY_KEY_3 = "(placeholder.key IS NULL OR placeholder.key = '')";
    private static final String _SQL_SELECT_PLACEHOLDER = "SELECT placeholder FROM Placeholder placeholder";
    private static final String _SQL_SELECT_PLACEHOLDER_WHERE = "SELECT placeholder FROM Placeholder placeholder WHERE ";
    private static final String _SQL_COUNT_PLACEHOLDER = "SELECT COUNT(placeholder) FROM Placeholder placeholder";
    private static final String _SQL_COUNT_PLACEHOLDER_WHERE = "SELECT COUNT(placeholder) FROM Placeholder placeholder WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "placeholder.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Placeholder exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Placeholder exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PlaceholderPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "uuid", "key"
            });
    private static Placeholder _nullPlaceholder = new PlaceholderImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Placeholder> toCacheModel() {
                return _nullPlaceholderCacheModel;
            }
        };

    private static CacheModel<Placeholder> _nullPlaceholderCacheModel = new CacheModel<Placeholder>() {
            @Override
            public Placeholder toEntityModel() {
                return _nullPlaceholder;
            }
        };

    public PlaceholderPersistenceImpl() {
        setModelClass(Placeholder.class);
    }

    /**
     * Returns all the placeholders where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching placeholders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Placeholder> findByUuid(String uuid) throws SystemException {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Placeholder> findByUuid(String uuid, int start, int end)
        throws SystemException {
        return findByUuid(uuid, start, end, null);
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
    @Override
    public List<Placeholder> findByUuid(String uuid, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid, start, end, orderByComparator };
        }

        List<Placeholder> list = (List<Placeholder>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Placeholder placeholder : list) {
                if (!Validator.equals(uuid, placeholder.getUuid())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_PLACEHOLDER_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PlaceholderModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                if (!pagination) {
                    list = (List<Placeholder>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Placeholder>(list);
                } else {
                    list = (List<Placeholder>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Placeholder findByUuid_First(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchPlaceholderException, SystemException {
        Placeholder placeholder = fetchByUuid_First(uuid, orderByComparator);

        if (placeholder != null) {
            return placeholder;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPlaceholderException(msg.toString());
    }

    /**
     * Returns the first placeholder in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching placeholder, or <code>null</code> if a matching placeholder could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Placeholder fetchByUuid_First(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        List<Placeholder> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Placeholder findByUuid_Last(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchPlaceholderException, SystemException {
        Placeholder placeholder = fetchByUuid_Last(uuid, orderByComparator);

        if (placeholder != null) {
            return placeholder;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPlaceholderException(msg.toString());
    }

    /**
     * Returns the last placeholder in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching placeholder, or <code>null</code> if a matching placeholder could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Placeholder fetchByUuid_Last(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<Placeholder> list = findByUuid(uuid, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Placeholder[] findByUuid_PrevAndNext(long placeholderId,
        String uuid, OrderByComparator orderByComparator)
        throws NoSuchPlaceholderException, SystemException {
        Placeholder placeholder = findByPrimaryKey(placeholderId);

        Session session = null;

        try {
            session = openSession();

            Placeholder[] array = new PlaceholderImpl[3];

            array[0] = getByUuid_PrevAndNext(session, placeholder, uuid,
                    orderByComparator, true);

            array[1] = placeholder;

            array[2] = getByUuid_PrevAndNext(session, placeholder, uuid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Placeholder getByUuid_PrevAndNext(Session session,
        Placeholder placeholder, String uuid,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PLACEHOLDER_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_UUID_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(PlaceholderModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(placeholder);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Placeholder> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the placeholders where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid(String uuid) throws SystemException {
        for (Placeholder placeholder : findByUuid(uuid, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(placeholder);
        }
    }

    /**
     * Returns the number of placeholders where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching placeholders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid(String uuid) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

        Object[] finderArgs = new Object[] { uuid };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PLACEHOLDER_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the placeholders where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the matching placeholders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Placeholder> findByUuid_C(String uuid, long companyId)
        throws SystemException {
        return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Placeholder> findByUuid_C(String uuid, long companyId,
        int start, int end) throws SystemException {
        return findByUuid_C(uuid, companyId, start, end, null);
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
    @Override
    public List<Placeholder> findByUuid_C(String uuid, long companyId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] { uuid, companyId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] {
                    uuid, companyId,
                    
                    start, end, orderByComparator
                };
        }

        List<Placeholder> list = (List<Placeholder>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Placeholder placeholder : list) {
                if (!Validator.equals(uuid, placeholder.getUuid()) ||
                        (companyId != placeholder.getCompanyId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_PLACEHOLDER_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PlaceholderModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                if (!pagination) {
                    list = (List<Placeholder>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Placeholder>(list);
                } else {
                    list = (List<Placeholder>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Placeholder findByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchPlaceholderException, SystemException {
        Placeholder placeholder = fetchByUuid_C_First(uuid, companyId,
                orderByComparator);

        if (placeholder != null) {
            return placeholder;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPlaceholderException(msg.toString());
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
    @Override
    public Placeholder fetchByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Placeholder> list = findByUuid_C(uuid, companyId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Placeholder findByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchPlaceholderException, SystemException {
        Placeholder placeholder = fetchByUuid_C_Last(uuid, companyId,
                orderByComparator);

        if (placeholder != null) {
            return placeholder;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPlaceholderException(msg.toString());
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
    @Override
    public Placeholder fetchByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid_C(uuid, companyId);

        if (count == 0) {
            return null;
        }

        List<Placeholder> list = findByUuid_C(uuid, companyId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Placeholder[] findByUuid_C_PrevAndNext(long placeholderId,
        String uuid, long companyId, OrderByComparator orderByComparator)
        throws NoSuchPlaceholderException, SystemException {
        Placeholder placeholder = findByPrimaryKey(placeholderId);

        Session session = null;

        try {
            session = openSession();

            Placeholder[] array = new PlaceholderImpl[3];

            array[0] = getByUuid_C_PrevAndNext(session, placeholder, uuid,
                    companyId, orderByComparator, true);

            array[1] = placeholder;

            array[2] = getByUuid_C_PrevAndNext(session, placeholder, uuid,
                    companyId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Placeholder getByUuid_C_PrevAndNext(Session session,
        Placeholder placeholder, String uuid, long companyId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PLACEHOLDER_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_C_UUID_2);
        }

        query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(PlaceholderModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(placeholder);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Placeholder> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the placeholders where uuid = &#63; and companyId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid_C(String uuid, long companyId)
        throws SystemException {
        for (Placeholder placeholder : findByUuid_C(uuid, companyId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(placeholder);
        }
    }

    /**
     * Returns the number of placeholders where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the number of matching placeholders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid_C(String uuid, long companyId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

        Object[] finderArgs = new Object[] { uuid, companyId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_PLACEHOLDER_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the placeholders where consumerId = &#63;.
     *
     * @param consumerId the consumer ID
     * @return the matching placeholders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Placeholder> findByConsumerId(long consumerId)
        throws SystemException {
        return findByConsumerId(consumerId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Placeholder> findByConsumerId(long consumerId, int start,
        int end) throws SystemException {
        return findByConsumerId(consumerId, start, end, null);
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
    @Override
    public List<Placeholder> findByConsumerId(long consumerId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONSUMERID;
            finderArgs = new Object[] { consumerId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CONSUMERID;
            finderArgs = new Object[] { consumerId, start, end, orderByComparator };
        }

        List<Placeholder> list = (List<Placeholder>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Placeholder placeholder : list) {
                if ((consumerId != placeholder.getConsumerId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_PLACEHOLDER_WHERE);

            query.append(_FINDER_COLUMN_CONSUMERID_CONSUMERID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PlaceholderModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(consumerId);

                if (!pagination) {
                    list = (List<Placeholder>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Placeholder>(list);
                } else {
                    list = (List<Placeholder>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Placeholder findByConsumerId_First(long consumerId,
        OrderByComparator orderByComparator)
        throws NoSuchPlaceholderException, SystemException {
        Placeholder placeholder = fetchByConsumerId_First(consumerId,
                orderByComparator);

        if (placeholder != null) {
            return placeholder;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("consumerId=");
        msg.append(consumerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPlaceholderException(msg.toString());
    }

    /**
     * Returns the first placeholder in the ordered set where consumerId = &#63;.
     *
     * @param consumerId the consumer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching placeholder, or <code>null</code> if a matching placeholder could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Placeholder fetchByConsumerId_First(long consumerId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Placeholder> list = findByConsumerId(consumerId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Placeholder findByConsumerId_Last(long consumerId,
        OrderByComparator orderByComparator)
        throws NoSuchPlaceholderException, SystemException {
        Placeholder placeholder = fetchByConsumerId_Last(consumerId,
                orderByComparator);

        if (placeholder != null) {
            return placeholder;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("consumerId=");
        msg.append(consumerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPlaceholderException(msg.toString());
    }

    /**
     * Returns the last placeholder in the ordered set where consumerId = &#63;.
     *
     * @param consumerId the consumer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching placeholder, or <code>null</code> if a matching placeholder could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Placeholder fetchByConsumerId_Last(long consumerId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByConsumerId(consumerId);

        if (count == 0) {
            return null;
        }

        List<Placeholder> list = findByConsumerId(consumerId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Placeholder[] findByConsumerId_PrevAndNext(long placeholderId,
        long consumerId, OrderByComparator orderByComparator)
        throws NoSuchPlaceholderException, SystemException {
        Placeholder placeholder = findByPrimaryKey(placeholderId);

        Session session = null;

        try {
            session = openSession();

            Placeholder[] array = new PlaceholderImpl[3];

            array[0] = getByConsumerId_PrevAndNext(session, placeholder,
                    consumerId, orderByComparator, true);

            array[1] = placeholder;

            array[2] = getByConsumerId_PrevAndNext(session, placeholder,
                    consumerId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Placeholder getByConsumerId_PrevAndNext(Session session,
        Placeholder placeholder, long consumerId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PLACEHOLDER_WHERE);

        query.append(_FINDER_COLUMN_CONSUMERID_CONSUMERID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(PlaceholderModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(consumerId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(placeholder);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Placeholder> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the placeholders where consumerId = &#63; from the database.
     *
     * @param consumerId the consumer ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByConsumerId(long consumerId) throws SystemException {
        for (Placeholder placeholder : findByConsumerId(consumerId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(placeholder);
        }
    }

    /**
     * Returns the number of placeholders where consumerId = &#63;.
     *
     * @param consumerId the consumer ID
     * @return the number of matching placeholders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByConsumerId(long consumerId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CONSUMERID;

        Object[] finderArgs = new Object[] { consumerId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PLACEHOLDER_WHERE);

            query.append(_FINDER_COLUMN_CONSUMERID_CONSUMERID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(consumerId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the placeholder where key = &#63; or throws a {@link com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException} if it could not be found.
     *
     * @param key the key
     * @return the matching placeholder
     * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a matching placeholder could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Placeholder findByKey(String key)
        throws NoSuchPlaceholderException, SystemException {
        Placeholder placeholder = fetchByKey(key);

        if (placeholder == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("key=");
            msg.append(key);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchPlaceholderException(msg.toString());
        }

        return placeholder;
    }

    /**
     * Returns the placeholder where key = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param key the key
     * @return the matching placeholder, or <code>null</code> if a matching placeholder could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Placeholder fetchByKey(String key) throws SystemException {
        return fetchByKey(key, true);
    }

    /**
     * Returns the placeholder where key = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param key the key
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching placeholder, or <code>null</code> if a matching placeholder could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Placeholder fetchByKey(String key, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { key };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_KEY,
                    finderArgs, this);
        }

        if (result instanceof Placeholder) {
            Placeholder placeholder = (Placeholder) result;

            if (!Validator.equals(key, placeholder.getKey())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_PLACEHOLDER_WHERE);

            boolean bindKey = false;

            if (key == null) {
                query.append(_FINDER_COLUMN_KEY_KEY_1);
            } else if (key.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_KEY_KEY_3);
            } else {
                bindKey = true;

                query.append(_FINDER_COLUMN_KEY_KEY_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindKey) {
                    qPos.add(key);
                }

                List<Placeholder> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KEY,
                        finderArgs, list);
                } else {
                    Placeholder placeholder = list.get(0);

                    result = placeholder;

                    cacheResult(placeholder);

                    if ((placeholder.getKey() == null) ||
                            !placeholder.getKey().equals(key)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KEY,
                            finderArgs, placeholder);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_KEY,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Placeholder) result;
        }
    }

    /**
     * Removes the placeholder where key = &#63; from the database.
     *
     * @param key the key
     * @return the placeholder that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Placeholder removeByKey(String key)
        throws NoSuchPlaceholderException, SystemException {
        Placeholder placeholder = findByKey(key);

        return remove(placeholder);
    }

    /**
     * Returns the number of placeholders where key = &#63;.
     *
     * @param key the key
     * @return the number of matching placeholders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByKey(String key) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_KEY;

        Object[] finderArgs = new Object[] { key };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PLACEHOLDER_WHERE);

            boolean bindKey = false;

            if (key == null) {
                query.append(_FINDER_COLUMN_KEY_KEY_1);
            } else if (key.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_KEY_KEY_3);
            } else {
                bindKey = true;

                query.append(_FINDER_COLUMN_KEY_KEY_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindKey) {
                    qPos.add(key);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the placeholder in the entity cache if it is enabled.
     *
     * @param placeholder the placeholder
     */
    @Override
    public void cacheResult(Placeholder placeholder) {
        EntityCacheUtil.putResult(PlaceholderModelImpl.ENTITY_CACHE_ENABLED,
            PlaceholderImpl.class, placeholder.getPrimaryKey(), placeholder);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KEY,
            new Object[] { placeholder.getKey() }, placeholder);

        placeholder.resetOriginalValues();
    }

    /**
     * Caches the placeholders in the entity cache if it is enabled.
     *
     * @param placeholders the placeholders
     */
    @Override
    public void cacheResult(List<Placeholder> placeholders) {
        for (Placeholder placeholder : placeholders) {
            if (EntityCacheUtil.getResult(
                        PlaceholderModelImpl.ENTITY_CACHE_ENABLED,
                        PlaceholderImpl.class, placeholder.getPrimaryKey()) == null) {
                cacheResult(placeholder);
            } else {
                placeholder.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all placeholders.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PlaceholderImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PlaceholderImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the placeholder.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Placeholder placeholder) {
        EntityCacheUtil.removeResult(PlaceholderModelImpl.ENTITY_CACHE_ENABLED,
            PlaceholderImpl.class, placeholder.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(placeholder);
    }

    @Override
    public void clearCache(List<Placeholder> placeholders) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Placeholder placeholder : placeholders) {
            EntityCacheUtil.removeResult(PlaceholderModelImpl.ENTITY_CACHE_ENABLED,
                PlaceholderImpl.class, placeholder.getPrimaryKey());

            clearUniqueFindersCache(placeholder);
        }
    }

    protected void cacheUniqueFindersCache(Placeholder placeholder) {
        if (placeholder.isNew()) {
            Object[] args = new Object[] { placeholder.getKey() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_KEY, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KEY, args,
                placeholder);
        } else {
            PlaceholderModelImpl placeholderModelImpl = (PlaceholderModelImpl) placeholder;

            if ((placeholderModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_KEY.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { placeholder.getKey() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_KEY, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KEY, args,
                    placeholder);
            }
        }
    }

    protected void clearUniqueFindersCache(Placeholder placeholder) {
        PlaceholderModelImpl placeholderModelImpl = (PlaceholderModelImpl) placeholder;

        Object[] args = new Object[] { placeholder.getKey() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_KEY, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_KEY, args);

        if ((placeholderModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_KEY.getColumnBitmask()) != 0) {
            args = new Object[] { placeholderModelImpl.getOriginalKey() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_KEY, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_KEY, args);
        }
    }

    /**
     * Creates a new placeholder with the primary key. Does not add the placeholder to the database.
     *
     * @param placeholderId the primary key for the new placeholder
     * @return the new placeholder
     */
    @Override
    public Placeholder create(long placeholderId) {
        Placeholder placeholder = new PlaceholderImpl();

        placeholder.setNew(true);
        placeholder.setPrimaryKey(placeholderId);

        String uuid = PortalUUIDUtil.generate();

        placeholder.setUuid(uuid);

        return placeholder;
    }

    /**
     * Removes the placeholder with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param placeholderId the primary key of the placeholder
     * @return the placeholder that was removed
     * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a placeholder with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Placeholder remove(long placeholderId)
        throws NoSuchPlaceholderException, SystemException {
        return remove((Serializable) placeholderId);
    }

    /**
     * Removes the placeholder with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the placeholder
     * @return the placeholder that was removed
     * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a placeholder with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Placeholder remove(Serializable primaryKey)
        throws NoSuchPlaceholderException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Placeholder placeholder = (Placeholder) session.get(PlaceholderImpl.class,
                    primaryKey);

            if (placeholder == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPlaceholderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(placeholder);
        } catch (NoSuchPlaceholderException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Placeholder removeImpl(Placeholder placeholder)
        throws SystemException {
        placeholder = toUnwrappedModel(placeholder);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(placeholder)) {
                placeholder = (Placeholder) session.get(PlaceholderImpl.class,
                        placeholder.getPrimaryKeyObj());
            }

            if (placeholder != null) {
                session.delete(placeholder);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (placeholder != null) {
            clearCache(placeholder);
        }

        return placeholder;
    }

    @Override
    public Placeholder updateImpl(
        com.liferay.consumer.manager.extension.screens.model.Placeholder placeholder)
        throws SystemException {
        placeholder = toUnwrappedModel(placeholder);

        boolean isNew = placeholder.isNew();

        PlaceholderModelImpl placeholderModelImpl = (PlaceholderModelImpl) placeholder;

        if (Validator.isNull(placeholder.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            placeholder.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (placeholder.isNew()) {
                session.save(placeholder);

                placeholder.setNew(false);
            } else {
                session.merge(placeholder);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PlaceholderModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((placeholderModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        placeholderModelImpl.getOriginalUuid()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);

                args = new Object[] { placeholderModelImpl.getUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);
            }

            if ((placeholderModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        placeholderModelImpl.getOriginalUuid(),
                        placeholderModelImpl.getOriginalCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);

                args = new Object[] {
                        placeholderModelImpl.getUuid(),
                        placeholderModelImpl.getCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);
            }

            if ((placeholderModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONSUMERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        placeholderModelImpl.getOriginalConsumerId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONSUMERID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONSUMERID,
                    args);

                args = new Object[] { placeholderModelImpl.getConsumerId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONSUMERID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONSUMERID,
                    args);
            }
        }

        EntityCacheUtil.putResult(PlaceholderModelImpl.ENTITY_CACHE_ENABLED,
            PlaceholderImpl.class, placeholder.getPrimaryKey(), placeholder);

        clearUniqueFindersCache(placeholder);
        cacheUniqueFindersCache(placeholder);

        return placeholder;
    }

    protected Placeholder toUnwrappedModel(Placeholder placeholder) {
        if (placeholder instanceof PlaceholderImpl) {
            return placeholder;
        }

        PlaceholderImpl placeholderImpl = new PlaceholderImpl();

        placeholderImpl.setNew(placeholder.isNew());
        placeholderImpl.setPrimaryKey(placeholder.getPrimaryKey());

        placeholderImpl.setUuid(placeholder.getUuid());
        placeholderImpl.setPlaceholderId(placeholder.getPlaceholderId());
        placeholderImpl.setCompanyId(placeholder.getCompanyId());
        placeholderImpl.setUserId(placeholder.getUserId());
        placeholderImpl.setUserName(placeholder.getUserName());
        placeholderImpl.setCreateDate(placeholder.getCreateDate());
        placeholderImpl.setModifiedDate(placeholder.getModifiedDate());
        placeholderImpl.setKey(placeholder.getKey());
        placeholderImpl.setName(placeholder.getName());
        placeholderImpl.setDescription(placeholder.getDescription());
        placeholderImpl.setConsumerId(placeholder.getConsumerId());

        return placeholderImpl;
    }

    /**
     * Returns the placeholder with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the placeholder
     * @return the placeholder
     * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a placeholder with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Placeholder findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPlaceholderException, SystemException {
        Placeholder placeholder = fetchByPrimaryKey(primaryKey);

        if (placeholder == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPlaceholderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return placeholder;
    }

    /**
     * Returns the placeholder with the primary key or throws a {@link com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException} if it could not be found.
     *
     * @param placeholderId the primary key of the placeholder
     * @return the placeholder
     * @throws com.liferay.consumer.manager.extension.screens.NoSuchPlaceholderException if a placeholder with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Placeholder findByPrimaryKey(long placeholderId)
        throws NoSuchPlaceholderException, SystemException {
        return findByPrimaryKey((Serializable) placeholderId);
    }

    /**
     * Returns the placeholder with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the placeholder
     * @return the placeholder, or <code>null</code> if a placeholder with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Placeholder fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Placeholder placeholder = (Placeholder) EntityCacheUtil.getResult(PlaceholderModelImpl.ENTITY_CACHE_ENABLED,
                PlaceholderImpl.class, primaryKey);

        if (placeholder == _nullPlaceholder) {
            return null;
        }

        if (placeholder == null) {
            Session session = null;

            try {
                session = openSession();

                placeholder = (Placeholder) session.get(PlaceholderImpl.class,
                        primaryKey);

                if (placeholder != null) {
                    cacheResult(placeholder);
                } else {
                    EntityCacheUtil.putResult(PlaceholderModelImpl.ENTITY_CACHE_ENABLED,
                        PlaceholderImpl.class, primaryKey, _nullPlaceholder);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PlaceholderModelImpl.ENTITY_CACHE_ENABLED,
                    PlaceholderImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return placeholder;
    }

    /**
     * Returns the placeholder with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param placeholderId the primary key of the placeholder
     * @return the placeholder, or <code>null</code> if a placeholder with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Placeholder fetchByPrimaryKey(long placeholderId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) placeholderId);
    }

    /**
     * Returns all the placeholders.
     *
     * @return the placeholders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Placeholder> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Placeholder> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Placeholder> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Placeholder> list = (List<Placeholder>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PLACEHOLDER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PLACEHOLDER;

                if (pagination) {
                    sql = sql.concat(PlaceholderModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Placeholder>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Placeholder>(list);
                } else {
                    list = (List<Placeholder>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the placeholders from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Placeholder placeholder : findAll()) {
            remove(placeholder);
        }
    }

    /**
     * Returns the number of placeholders.
     *
     * @return the number of placeholders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_PLACEHOLDER);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the placeholder persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.liferay.consumer.manager.extension.screens.model.Placeholder")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Placeholder>> listenersList = new ArrayList<ModelListener<Placeholder>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Placeholder>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PlaceholderImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
