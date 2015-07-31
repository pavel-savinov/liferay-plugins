package com.liferay.consumer.manager.extension.screens.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.consumer.manager.extension.screens.service.http.PlaceholderServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.consumer.manager.extension.screens.service.http.PlaceholderServiceSoap
 * @generated
 */
public class PlaceholderSoap implements Serializable {
    private String _uuid;
    private long _placeholderId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _key;
    private String _name;
    private String _description;
    private long _consumerId;

    public PlaceholderSoap() {
    }

    public static PlaceholderSoap toSoapModel(Placeholder model) {
        PlaceholderSoap soapModel = new PlaceholderSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setPlaceholderId(model.getPlaceholderId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setKey(model.getKey());
        soapModel.setName(model.getName());
        soapModel.setDescription(model.getDescription());
        soapModel.setConsumerId(model.getConsumerId());

        return soapModel;
    }

    public static PlaceholderSoap[] toSoapModels(Placeholder[] models) {
        PlaceholderSoap[] soapModels = new PlaceholderSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PlaceholderSoap[][] toSoapModels(Placeholder[][] models) {
        PlaceholderSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PlaceholderSoap[models.length][models[0].length];
        } else {
            soapModels = new PlaceholderSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PlaceholderSoap[] toSoapModels(List<Placeholder> models) {
        List<PlaceholderSoap> soapModels = new ArrayList<PlaceholderSoap>(models.size());

        for (Placeholder model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PlaceholderSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _placeholderId;
    }

    public void setPrimaryKey(long pk) {
        setPlaceholderId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getPlaceholderId() {
        return _placeholderId;
    }

    public void setPlaceholderId(long placeholderId) {
        _placeholderId = placeholderId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getKey() {
        return _key;
    }

    public void setKey(String key) {
        _key = key;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public long getConsumerId() {
        return _consumerId;
    }

    public void setConsumerId(long consumerId) {
        _consumerId = consumerId;
    }
}
