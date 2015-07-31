package com.liferay.consumer.manager.extension.screens.service.base;

import com.liferay.consumer.manager.extension.screens.service.PlaceholderServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PlaceholderServiceClpInvoker {
    private String _methodName18;
    private String[] _methodParameterTypes18;
    private String _methodName19;
    private String[] _methodParameterTypes19;
    private String _methodName24;
    private String[] _methodParameterTypes24;
    private String _methodName25;
    private String[] _methodParameterTypes25;
    private String _methodName26;
    private String[] _methodParameterTypes26;

    public PlaceholderServiceClpInvoker() {
        _methodName18 = "getBeanIdentifier";

        _methodParameterTypes18 = new String[] {  };

        _methodName19 = "setBeanIdentifier";

        _methodParameterTypes19 = new String[] { "java.lang.String" };

        _methodName24 = "addPlaceholder";

        _methodParameterTypes24 = new String[] {
                "long", "java.lang.String", "java.lang.String",
                "java.lang.String", "com.liferay.portal.service.ServiceContext"
            };

        _methodName25 = "deletePlaceholders";

        _methodParameterTypes25 = new String[] { "long" };

        _methodName26 = "getPlaceholders";

        _methodParameterTypes26 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName18.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
            return PlaceholderServiceUtil.getBeanIdentifier();
        }

        if (_methodName19.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
            PlaceholderServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName24.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
            return PlaceholderServiceUtil.addPlaceholder(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                (com.liferay.portal.service.ServiceContext) arguments[4]);
        }

        if (_methodName25.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
            PlaceholderServiceUtil.deletePlaceholders(((Long) arguments[0]).longValue());

            return null;
        }

        if (_methodName26.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes26, parameterTypes)) {
            return PlaceholderServiceUtil.getPlaceholders(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
