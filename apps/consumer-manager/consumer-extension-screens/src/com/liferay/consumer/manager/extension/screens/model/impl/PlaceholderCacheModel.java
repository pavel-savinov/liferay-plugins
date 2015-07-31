package com.liferay.consumer.manager.extension.screens.model.impl;

import com.liferay.consumer.manager.extension.screens.model.Placeholder;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Placeholder in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Placeholder
 * @generated
 */
public class PlaceholderCacheModel implements CacheModel<Placeholder>,
    Externalizable {
    public String uuid;
    public long placeholderId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String key;
    public String name;
    public String description;
    public long consumerId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(23);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", placeholderId=");
        sb.append(placeholderId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", key=");
        sb.append(key);
        sb.append(", name=");
        sb.append(name);
        sb.append(", description=");
        sb.append(description);
        sb.append(", consumerId=");
        sb.append(consumerId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Placeholder toEntityModel() {
        PlaceholderImpl placeholderImpl = new PlaceholderImpl();

        if (uuid == null) {
            placeholderImpl.setUuid(StringPool.BLANK);
        } else {
            placeholderImpl.setUuid(uuid);
        }

        placeholderImpl.setPlaceholderId(placeholderId);
        placeholderImpl.setCompanyId(companyId);
        placeholderImpl.setUserId(userId);

        if (userName == null) {
            placeholderImpl.setUserName(StringPool.BLANK);
        } else {
            placeholderImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            placeholderImpl.setCreateDate(null);
        } else {
            placeholderImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            placeholderImpl.setModifiedDate(null);
        } else {
            placeholderImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (key == null) {
            placeholderImpl.setKey(StringPool.BLANK);
        } else {
            placeholderImpl.setKey(key);
        }

        if (name == null) {
            placeholderImpl.setName(StringPool.BLANK);
        } else {
            placeholderImpl.setName(name);
        }

        if (description == null) {
            placeholderImpl.setDescription(StringPool.BLANK);
        } else {
            placeholderImpl.setDescription(description);
        }

        placeholderImpl.setConsumerId(consumerId);

        placeholderImpl.resetOriginalValues();

        return placeholderImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        placeholderId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        key = objectInput.readUTF();
        name = objectInput.readUTF();
        description = objectInput.readUTF();
        consumerId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(placeholderId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (key == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(key);
        }

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (description == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(description);
        }

        objectOutput.writeLong(consumerId);
    }
}
