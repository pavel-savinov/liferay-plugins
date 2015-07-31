package com.liferay.consumer.manager.extension.screens.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Placeholder. This utility wraps
 * {@link com.liferay.consumer.manager.extension.screens.service.impl.PlaceholderServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see PlaceholderService
 * @see com.liferay.consumer.manager.extension.screens.service.base.PlaceholderServiceBaseImpl
 * @see com.liferay.consumer.manager.extension.screens.service.impl.PlaceholderServiceImpl
 * @generated
 */
public class PlaceholderServiceUtil {
    private static PlaceholderService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.consumer.manager.extension.screens.service.impl.PlaceholderServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

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
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPlaceholders(consumerId);
    }

    public static void clearService() {
        _service = null;
    }

    public static PlaceholderService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    PlaceholderService.class.getName());

            if (invokableService instanceof PlaceholderService) {
                _service = (PlaceholderService) invokableService;
            } else {
                _service = new PlaceholderServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(PlaceholderServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(PlaceholderService service) {
    }
}
