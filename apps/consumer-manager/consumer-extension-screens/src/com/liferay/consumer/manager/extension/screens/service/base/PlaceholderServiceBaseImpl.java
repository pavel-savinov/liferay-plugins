package com.liferay.consumer.manager.extension.screens.service.base;

import com.liferay.consumer.manager.extension.screens.model.Placeholder;
import com.liferay.consumer.manager.extension.screens.service.PlaceholderService;
import com.liferay.consumer.manager.extension.screens.service.persistence.PlaceholderPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the placeholder remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.consumer.manager.extension.screens.service.impl.PlaceholderServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.consumer.manager.extension.screens.service.impl.PlaceholderServiceImpl
 * @see com.liferay.consumer.manager.extension.screens.service.PlaceholderServiceUtil
 * @generated
 */
public abstract class PlaceholderServiceBaseImpl extends BaseServiceImpl
    implements PlaceholderService, IdentifiableBean {
    @BeanReference(type = com.liferay.consumer.manager.extension.screens.service.PlaceholderLocalService.class)
    protected com.liferay.consumer.manager.extension.screens.service.PlaceholderLocalService placeholderLocalService;
    @BeanReference(type = com.liferay.consumer.manager.extension.screens.service.PlaceholderService.class)
    protected com.liferay.consumer.manager.extension.screens.service.PlaceholderService placeholderService;
    @BeanReference(type = PlaceholderPersistence.class)
    protected PlaceholderPersistence placeholderPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private PlaceholderServiceClpInvoker _clpInvoker = new PlaceholderServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.liferay.consumer.manager.extension.screens.service.PlaceholderServiceUtil} to access the placeholder remote service.
     */

    /**
     * Returns the placeholder local service.
     *
     * @return the placeholder local service
     */
    public com.liferay.consumer.manager.extension.screens.service.PlaceholderLocalService getPlaceholderLocalService() {
        return placeholderLocalService;
    }

    /**
     * Sets the placeholder local service.
     *
     * @param placeholderLocalService the placeholder local service
     */
    public void setPlaceholderLocalService(
        com.liferay.consumer.manager.extension.screens.service.PlaceholderLocalService placeholderLocalService) {
        this.placeholderLocalService = placeholderLocalService;
    }

    /**
     * Returns the placeholder remote service.
     *
     * @return the placeholder remote service
     */
    public com.liferay.consumer.manager.extension.screens.service.PlaceholderService getPlaceholderService() {
        return placeholderService;
    }

    /**
     * Sets the placeholder remote service.
     *
     * @param placeholderService the placeholder remote service
     */
    public void setPlaceholderService(
        com.liferay.consumer.manager.extension.screens.service.PlaceholderService placeholderService) {
        this.placeholderService = placeholderService;
    }

    /**
     * Returns the placeholder persistence.
     *
     * @return the placeholder persistence
     */
    public PlaceholderPersistence getPlaceholderPersistence() {
        return placeholderPersistence;
    }

    /**
     * Sets the placeholder persistence.
     *
     * @param placeholderPersistence the placeholder persistence
     */
    public void setPlaceholderPersistence(
        PlaceholderPersistence placeholderPersistence) {
        this.placeholderPersistence = placeholderPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();
    }

    public void destroy() {
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Placeholder.class;
    }

    protected String getModelClassName() {
        return Placeholder.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = placeholderPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
