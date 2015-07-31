package com.liferay.consumer.manager.extension.screens.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Placeholder}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Placeholder
 * @generated
 */
public class PlaceholderWrapper implements Placeholder,
    ModelWrapper<Placeholder> {
    private Placeholder _placeholder;

    public PlaceholderWrapper(Placeholder placeholder) {
        _placeholder = placeholder;
    }

    @Override
    public Class<?> getModelClass() {
        return Placeholder.class;
    }

    @Override
    public String getModelClassName() {
        return Placeholder.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("placeholderId", getPlaceholderId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("key", getKey());
        attributes.put("name", getName());
        attributes.put("description", getDescription());
        attributes.put("consumerId", getConsumerId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long placeholderId = (Long) attributes.get("placeholderId");

        if (placeholderId != null) {
            setPlaceholderId(placeholderId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String key = (String) attributes.get("key");

        if (key != null) {
            setKey(key);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        Long consumerId = (Long) attributes.get("consumerId");

        if (consumerId != null) {
            setConsumerId(consumerId);
        }
    }

    /**
    * Returns the primary key of this placeholder.
    *
    * @return the primary key of this placeholder
    */
    @Override
    public long getPrimaryKey() {
        return _placeholder.getPrimaryKey();
    }

    /**
    * Sets the primary key of this placeholder.
    *
    * @param primaryKey the primary key of this placeholder
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _placeholder.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this placeholder.
    *
    * @return the uuid of this placeholder
    */
    @Override
    public java.lang.String getUuid() {
        return _placeholder.getUuid();
    }

    /**
    * Sets the uuid of this placeholder.
    *
    * @param uuid the uuid of this placeholder
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _placeholder.setUuid(uuid);
    }

    /**
    * Returns the placeholder ID of this placeholder.
    *
    * @return the placeholder ID of this placeholder
    */
    @Override
    public long getPlaceholderId() {
        return _placeholder.getPlaceholderId();
    }

    /**
    * Sets the placeholder ID of this placeholder.
    *
    * @param placeholderId the placeholder ID of this placeholder
    */
    @Override
    public void setPlaceholderId(long placeholderId) {
        _placeholder.setPlaceholderId(placeholderId);
    }

    /**
    * Returns the company ID of this placeholder.
    *
    * @return the company ID of this placeholder
    */
    @Override
    public long getCompanyId() {
        return _placeholder.getCompanyId();
    }

    /**
    * Sets the company ID of this placeholder.
    *
    * @param companyId the company ID of this placeholder
    */
    @Override
    public void setCompanyId(long companyId) {
        _placeholder.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this placeholder.
    *
    * @return the user ID of this placeholder
    */
    @Override
    public long getUserId() {
        return _placeholder.getUserId();
    }

    /**
    * Sets the user ID of this placeholder.
    *
    * @param userId the user ID of this placeholder
    */
    @Override
    public void setUserId(long userId) {
        _placeholder.setUserId(userId);
    }

    /**
    * Returns the user uuid of this placeholder.
    *
    * @return the user uuid of this placeholder
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _placeholder.getUserUuid();
    }

    /**
    * Sets the user uuid of this placeholder.
    *
    * @param userUuid the user uuid of this placeholder
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _placeholder.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this placeholder.
    *
    * @return the user name of this placeholder
    */
    @Override
    public java.lang.String getUserName() {
        return _placeholder.getUserName();
    }

    /**
    * Sets the user name of this placeholder.
    *
    * @param userName the user name of this placeholder
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _placeholder.setUserName(userName);
    }

    /**
    * Returns the create date of this placeholder.
    *
    * @return the create date of this placeholder
    */
    @Override
    public java.util.Date getCreateDate() {
        return _placeholder.getCreateDate();
    }

    /**
    * Sets the create date of this placeholder.
    *
    * @param createDate the create date of this placeholder
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _placeholder.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this placeholder.
    *
    * @return the modified date of this placeholder
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _placeholder.getModifiedDate();
    }

    /**
    * Sets the modified date of this placeholder.
    *
    * @param modifiedDate the modified date of this placeholder
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _placeholder.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the key of this placeholder.
    *
    * @return the key of this placeholder
    */
    @Override
    public java.lang.String getKey() {
        return _placeholder.getKey();
    }

    /**
    * Sets the key of this placeholder.
    *
    * @param key the key of this placeholder
    */
    @Override
    public void setKey(java.lang.String key) {
        _placeholder.setKey(key);
    }

    /**
    * Returns the name of this placeholder.
    *
    * @return the name of this placeholder
    */
    @Override
    public java.lang.String getName() {
        return _placeholder.getName();
    }

    /**
    * Returns the localized name of this placeholder in the language. Uses the default language if no localization exists for the requested language.
    *
    * @param locale the locale of the language
    * @return the localized name of this placeholder
    */
    @Override
    public java.lang.String getName(java.util.Locale locale) {
        return _placeholder.getName(locale);
    }

    /**
    * Returns the localized name of this placeholder in the language, optionally using the default language if no localization exists for the requested language.
    *
    * @param locale the local of the language
    * @param useDefault whether to use the default language if no localization exists for the requested language
    * @return the localized name of this placeholder. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
    */
    @Override
    public java.lang.String getName(java.util.Locale locale, boolean useDefault) {
        return _placeholder.getName(locale, useDefault);
    }

    /**
    * Returns the localized name of this placeholder in the language. Uses the default language if no localization exists for the requested language.
    *
    * @param languageId the ID of the language
    * @return the localized name of this placeholder
    */
    @Override
    public java.lang.String getName(java.lang.String languageId) {
        return _placeholder.getName(languageId);
    }

    /**
    * Returns the localized name of this placeholder in the language, optionally using the default language if no localization exists for the requested language.
    *
    * @param languageId the ID of the language
    * @param useDefault whether to use the default language if no localization exists for the requested language
    * @return the localized name of this placeholder
    */
    @Override
    public java.lang.String getName(java.lang.String languageId,
        boolean useDefault) {
        return _placeholder.getName(languageId, useDefault);
    }

    @Override
    public java.lang.String getNameCurrentLanguageId() {
        return _placeholder.getNameCurrentLanguageId();
    }

    @Override
    public java.lang.String getNameCurrentValue() {
        return _placeholder.getNameCurrentValue();
    }

    /**
    * Returns a map of the locales and localized names of this placeholder.
    *
    * @return the locales and localized names of this placeholder
    */
    @Override
    public java.util.Map<java.util.Locale, java.lang.String> getNameMap() {
        return _placeholder.getNameMap();
    }

    /**
    * Sets the name of this placeholder.
    *
    * @param name the name of this placeholder
    */
    @Override
    public void setName(java.lang.String name) {
        _placeholder.setName(name);
    }

    /**
    * Sets the localized name of this placeholder in the language.
    *
    * @param name the localized name of this placeholder
    * @param locale the locale of the language
    */
    @Override
    public void setName(java.lang.String name, java.util.Locale locale) {
        _placeholder.setName(name, locale);
    }

    /**
    * Sets the localized name of this placeholder in the language, and sets the default locale.
    *
    * @param name the localized name of this placeholder
    * @param locale the locale of the language
    * @param defaultLocale the default locale
    */
    @Override
    public void setName(java.lang.String name, java.util.Locale locale,
        java.util.Locale defaultLocale) {
        _placeholder.setName(name, locale, defaultLocale);
    }

    @Override
    public void setNameCurrentLanguageId(java.lang.String languageId) {
        _placeholder.setNameCurrentLanguageId(languageId);
    }

    /**
    * Sets the localized names of this placeholder from the map of locales and localized names.
    *
    * @param nameMap the locales and localized names of this placeholder
    */
    @Override
    public void setNameMap(
        java.util.Map<java.util.Locale, java.lang.String> nameMap) {
        _placeholder.setNameMap(nameMap);
    }

    /**
    * Sets the localized names of this placeholder from the map of locales and localized names, and sets the default locale.
    *
    * @param nameMap the locales and localized names of this placeholder
    * @param defaultLocale the default locale
    */
    @Override
    public void setNameMap(
        java.util.Map<java.util.Locale, java.lang.String> nameMap,
        java.util.Locale defaultLocale) {
        _placeholder.setNameMap(nameMap, defaultLocale);
    }

    /**
    * Returns the description of this placeholder.
    *
    * @return the description of this placeholder
    */
    @Override
    public java.lang.String getDescription() {
        return _placeholder.getDescription();
    }

    /**
    * Returns the localized description of this placeholder in the language. Uses the default language if no localization exists for the requested language.
    *
    * @param locale the locale of the language
    * @return the localized description of this placeholder
    */
    @Override
    public java.lang.String getDescription(java.util.Locale locale) {
        return _placeholder.getDescription(locale);
    }

    /**
    * Returns the localized description of this placeholder in the language, optionally using the default language if no localization exists for the requested language.
    *
    * @param locale the local of the language
    * @param useDefault whether to use the default language if no localization exists for the requested language
    * @return the localized description of this placeholder. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
    */
    @Override
    public java.lang.String getDescription(java.util.Locale locale,
        boolean useDefault) {
        return _placeholder.getDescription(locale, useDefault);
    }

    /**
    * Returns the localized description of this placeholder in the language. Uses the default language if no localization exists for the requested language.
    *
    * @param languageId the ID of the language
    * @return the localized description of this placeholder
    */
    @Override
    public java.lang.String getDescription(java.lang.String languageId) {
        return _placeholder.getDescription(languageId);
    }

    /**
    * Returns the localized description of this placeholder in the language, optionally using the default language if no localization exists for the requested language.
    *
    * @param languageId the ID of the language
    * @param useDefault whether to use the default language if no localization exists for the requested language
    * @return the localized description of this placeholder
    */
    @Override
    public java.lang.String getDescription(java.lang.String languageId,
        boolean useDefault) {
        return _placeholder.getDescription(languageId, useDefault);
    }

    @Override
    public java.lang.String getDescriptionCurrentLanguageId() {
        return _placeholder.getDescriptionCurrentLanguageId();
    }

    @Override
    public java.lang.String getDescriptionCurrentValue() {
        return _placeholder.getDescriptionCurrentValue();
    }

    /**
    * Returns a map of the locales and localized descriptions of this placeholder.
    *
    * @return the locales and localized descriptions of this placeholder
    */
    @Override
    public java.util.Map<java.util.Locale, java.lang.String> getDescriptionMap() {
        return _placeholder.getDescriptionMap();
    }

    /**
    * Sets the description of this placeholder.
    *
    * @param description the description of this placeholder
    */
    @Override
    public void setDescription(java.lang.String description) {
        _placeholder.setDescription(description);
    }

    /**
    * Sets the localized description of this placeholder in the language.
    *
    * @param description the localized description of this placeholder
    * @param locale the locale of the language
    */
    @Override
    public void setDescription(java.lang.String description,
        java.util.Locale locale) {
        _placeholder.setDescription(description, locale);
    }

    /**
    * Sets the localized description of this placeholder in the language, and sets the default locale.
    *
    * @param description the localized description of this placeholder
    * @param locale the locale of the language
    * @param defaultLocale the default locale
    */
    @Override
    public void setDescription(java.lang.String description,
        java.util.Locale locale, java.util.Locale defaultLocale) {
        _placeholder.setDescription(description, locale, defaultLocale);
    }

    @Override
    public void setDescriptionCurrentLanguageId(java.lang.String languageId) {
        _placeholder.setDescriptionCurrentLanguageId(languageId);
    }

    /**
    * Sets the localized descriptions of this placeholder from the map of locales and localized descriptions.
    *
    * @param descriptionMap the locales and localized descriptions of this placeholder
    */
    @Override
    public void setDescriptionMap(
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap) {
        _placeholder.setDescriptionMap(descriptionMap);
    }

    /**
    * Sets the localized descriptions of this placeholder from the map of locales and localized descriptions, and sets the default locale.
    *
    * @param descriptionMap the locales and localized descriptions of this placeholder
    * @param defaultLocale the default locale
    */
    @Override
    public void setDescriptionMap(
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
        java.util.Locale defaultLocale) {
        _placeholder.setDescriptionMap(descriptionMap, defaultLocale);
    }

    /**
    * Returns the consumer ID of this placeholder.
    *
    * @return the consumer ID of this placeholder
    */
    @Override
    public long getConsumerId() {
        return _placeholder.getConsumerId();
    }

    /**
    * Sets the consumer ID of this placeholder.
    *
    * @param consumerId the consumer ID of this placeholder
    */
    @Override
    public void setConsumerId(long consumerId) {
        _placeholder.setConsumerId(consumerId);
    }

    @Override
    public boolean isNew() {
        return _placeholder.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _placeholder.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _placeholder.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _placeholder.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _placeholder.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _placeholder.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _placeholder.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _placeholder.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _placeholder.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _placeholder.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _placeholder.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.String[] getAvailableLanguageIds() {
        return _placeholder.getAvailableLanguageIds();
    }

    @Override
    public java.lang.String getDefaultLanguageId() {
        return _placeholder.getDefaultLanguageId();
    }

    @Override
    public void prepareLocalizedFieldsForImport()
        throws com.liferay.portal.LocaleException {
        _placeholder.prepareLocalizedFieldsForImport();
    }

    @Override
    public void prepareLocalizedFieldsForImport(
        java.util.Locale defaultImportLocale)
        throws com.liferay.portal.LocaleException {
        _placeholder.prepareLocalizedFieldsForImport(defaultImportLocale);
    }

    @Override
    public java.lang.Object clone() {
        return new PlaceholderWrapper((Placeholder) _placeholder.clone());
    }

    @Override
    public int compareTo(
        com.liferay.consumer.manager.extension.screens.model.Placeholder placeholder) {
        return _placeholder.compareTo(placeholder);
    }

    @Override
    public int hashCode() {
        return _placeholder.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.liferay.consumer.manager.extension.screens.model.Placeholder> toCacheModel() {
        return _placeholder.toCacheModel();
    }

    @Override
    public com.liferay.consumer.manager.extension.screens.model.Placeholder toEscapedModel() {
        return new PlaceholderWrapper(_placeholder.toEscapedModel());
    }

    @Override
    public com.liferay.consumer.manager.extension.screens.model.Placeholder toUnescapedModel() {
        return new PlaceholderWrapper(_placeholder.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _placeholder.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _placeholder.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _placeholder.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PlaceholderWrapper)) {
            return false;
        }

        PlaceholderWrapper placeholderWrapper = (PlaceholderWrapper) obj;

        if (Validator.equals(_placeholder, placeholderWrapper._placeholder)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _placeholder.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Placeholder getWrappedPlaceholder() {
        return _placeholder;
    }

    @Override
    public Placeholder getWrappedModel() {
        return _placeholder;
    }

    @Override
    public void resetOriginalValues() {
        _placeholder.resetOriginalValues();
    }
}
