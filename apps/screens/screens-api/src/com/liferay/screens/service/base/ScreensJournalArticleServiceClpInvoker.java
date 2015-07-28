package com.liferay.screens.service.base;

import com.liferay.screens.service.ScreensJournalArticleServiceUtil;

import java.util.Arrays;

/**
 * @author José Manuel Navarro
 * @generated
 */
public class ScreensJournalArticleServiceClpInvoker {
    private String _methodName30;
    private String[] _methodParameterTypes30;
    private String _methodName31;
    private String[] _methodParameterTypes31;
    private String _methodName34;
    private String[] _methodParameterTypes34;

    public ScreensJournalArticleServiceClpInvoker() {
        _methodName30 = "getBeanIdentifier";

        _methodParameterTypes30 = new String[] {  };

        _methodName31 = "setBeanIdentifier";

        _methodParameterTypes31 = new String[] { "java.lang.String" };

        _methodName34 = "getJournalArticle";

        _methodParameterTypes34 = new String[] { "int", "int", "java.util.Locale" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName30.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
            return ScreensJournalArticleServiceUtil.getBeanIdentifier();
        }

        if (_methodName31.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
            ScreensJournalArticleServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName34.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes34, parameterTypes)) {
            return ScreensJournalArticleServiceUtil.getJournalArticle(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue(),
                (java.util.Locale) arguments[2]);
        }

        throw new UnsupportedOperationException();
    }
}
