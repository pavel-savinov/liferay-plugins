package com.liferay.screens.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.LocaleUtil;

import com.liferay.screens.service.ScreensAssetEntryServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.screens.service.ScreensAssetEntryServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
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
 * @author José Manuel Navarro
 * @see ScreensAssetEntryServiceHttp
 * @see com.liferay.screens.service.ScreensAssetEntryServiceUtil
 * @generated
 */
public class ScreensAssetEntryServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(ScreensAssetEntryServiceSoap.class);

    public static java.lang.String getAssetEntries(
        com.liferay.portlet.asset.service.persistence.AssetEntryQuery assetEntryQuery,
        String locale) throws RemoteException {
        try {
            com.liferay.portal.kernel.json.JSONArray returnValue = ScreensAssetEntryServiceUtil.getAssetEntries(assetEntryQuery,
                    LocaleUtil.fromLanguageId(locale));

            return returnValue.toString();
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}
