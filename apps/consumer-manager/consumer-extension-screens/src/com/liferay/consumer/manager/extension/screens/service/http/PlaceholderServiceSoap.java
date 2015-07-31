package com.liferay.consumer.manager.extension.screens.service.http;

import com.liferay.consumer.manager.extension.screens.service.PlaceholderServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.consumer.manager.extension.screens.service.PlaceholderServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.consumer.manager.extension.screens.model.PlaceholderSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.consumer.manager.extension.screens.model.Placeholder}, that is translated to a
 * {@link com.liferay.consumer.manager.extension.screens.model.PlaceholderSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlaceholderServiceHttp
 * @see com.liferay.consumer.manager.extension.screens.model.PlaceholderSoap
 * @see com.liferay.consumer.manager.extension.screens.service.PlaceholderServiceUtil
 * @generated
 */
public class PlaceholderServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(PlaceholderServiceSoap.class);

    public static com.liferay.consumer.manager.extension.screens.model.PlaceholderSoap addPlaceholder(
        long consumerId, java.lang.String key, java.lang.String name,
        java.lang.String description,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws RemoteException {
        try {
            com.liferay.consumer.manager.extension.screens.model.Placeholder returnValue =
                PlaceholderServiceUtil.addPlaceholder(consumerId, key, name,
                    description, serviceContext);

            return com.liferay.consumer.manager.extension.screens.model.PlaceholderSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void deletePlaceholders(long consumerId)
        throws RemoteException {
        try {
            PlaceholderServiceUtil.deletePlaceholders(consumerId);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.consumer.manager.extension.screens.model.PlaceholderSoap[] getPlaceholders(
        long consumerId) throws RemoteException {
        try {
            java.util.List<com.liferay.consumer.manager.extension.screens.model.Placeholder> returnValue =
                PlaceholderServiceUtil.getPlaceholders(consumerId);

            return com.liferay.consumer.manager.extension.screens.model.PlaceholderSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}
