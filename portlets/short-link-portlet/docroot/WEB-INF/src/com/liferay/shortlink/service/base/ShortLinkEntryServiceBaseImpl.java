/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.shortlink.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import com.liferay.shortlink.model.ShortLinkEntry;
import com.liferay.shortlink.service.ShortLinkEntryService;
import com.liferay.shortlink.service.persistence.ShortLinkEntryPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the short link entry remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.shortlink.service.impl.ShortLinkEntryServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.shortlink.service.impl.ShortLinkEntryServiceImpl
 * @see com.liferay.shortlink.service.ShortLinkEntryServiceUtil
 * @generated
 */
public abstract class ShortLinkEntryServiceBaseImpl extends BaseServiceImpl
	implements ShortLinkEntryService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.shortlink.service.ShortLinkEntryServiceUtil} to access the short link entry remote service.
	 */

	/**
	 * Returns the short link entry local service.
	 *
	 * @return the short link entry local service
	 */
	public com.liferay.shortlink.service.ShortLinkEntryLocalService getShortLinkEntryLocalService() {
		return shortLinkEntryLocalService;
	}

	/**
	 * Sets the short link entry local service.
	 *
	 * @param shortLinkEntryLocalService the short link entry local service
	 */
	public void setShortLinkEntryLocalService(
		com.liferay.shortlink.service.ShortLinkEntryLocalService shortLinkEntryLocalService) {
		this.shortLinkEntryLocalService = shortLinkEntryLocalService;
	}

	/**
	 * Returns the short link entry remote service.
	 *
	 * @return the short link entry remote service
	 */
	public com.liferay.shortlink.service.ShortLinkEntryService getShortLinkEntryService() {
		return shortLinkEntryService;
	}

	/**
	 * Sets the short link entry remote service.
	 *
	 * @param shortLinkEntryService the short link entry remote service
	 */
	public void setShortLinkEntryService(
		com.liferay.shortlink.service.ShortLinkEntryService shortLinkEntryService) {
		this.shortLinkEntryService = shortLinkEntryService;
	}

	/**
	 * Returns the short link entry persistence.
	 *
	 * @return the short link entry persistence
	 */
	public ShortLinkEntryPersistence getShortLinkEntryPersistence() {
		return shortLinkEntryPersistence;
	}

	/**
	 * Sets the short link entry persistence.
	 *
	 * @param shortLinkEntryPersistence the short link entry persistence
	 */
	public void setShortLinkEntryPersistence(
		ShortLinkEntryPersistence shortLinkEntryPersistence) {
		this.shortLinkEntryPersistence = shortLinkEntryPersistence;
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
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return ShortLinkEntry.class;
	}

	protected String getModelClassName() {
		return ShortLinkEntry.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = shortLinkEntryPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.shortlink.service.ShortLinkEntryLocalService.class)
	protected com.liferay.shortlink.service.ShortLinkEntryLocalService shortLinkEntryLocalService;
	@BeanReference(type = com.liferay.shortlink.service.ShortLinkEntryService.class)
	protected com.liferay.shortlink.service.ShortLinkEntryService shortLinkEntryService;
	@BeanReference(type = ShortLinkEntryPersistence.class)
	protected ShortLinkEntryPersistence shortLinkEntryPersistence;
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
	private ShortLinkEntryServiceClpInvoker _clpInvoker = new ShortLinkEntryServiceClpInvoker();
}