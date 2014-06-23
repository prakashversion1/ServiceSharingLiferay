package com.test.portlets.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.test.portlets.service.ClpSerializer;
import com.test.portlets.service.ManageOrganizationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class ManageOrganizationClp extends BaseModelImpl<ManageOrganization>
    implements ManageOrganization {
    private long _sbId;
    private String _sbName;
    private BaseModel<?> _manageOrganizationRemoteModel;

    public ManageOrganizationClp() {
    }

    public Class<?> getModelClass() {
        return ManageOrganization.class;
    }

    public String getModelClassName() {
        return ManageOrganization.class.getName();
    }

    public long getPrimaryKey() {
        return _sbId;
    }

    public void setPrimaryKey(long primaryKey) {
        setSbId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_sbId);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("sbId", getSbId());
        attributes.put("sbName", getSbName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long sbId = (Long) attributes.get("sbId");

        if (sbId != null) {
            setSbId(sbId);
        }

        String sbName = (String) attributes.get("sbName");

        if (sbName != null) {
            setSbName(sbName);
        }
    }

    public long getSbId() {
        return _sbId;
    }

    public void setSbId(long sbId) {
        _sbId = sbId;

        if (_manageOrganizationRemoteModel != null) {
            try {
                Class<?> clazz = _manageOrganizationRemoteModel.getClass();

                Method method = clazz.getMethod("setSbId", long.class);

                method.invoke(_manageOrganizationRemoteModel, sbId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public String getSbName() {
        return _sbName;
    }

    public void setSbName(String sbName) {
        _sbName = sbName;

        if (_manageOrganizationRemoteModel != null) {
            try {
                Class<?> clazz = _manageOrganizationRemoteModel.getClass();

                Method method = clazz.getMethod("setSbName", String.class);

                method.invoke(_manageOrganizationRemoteModel, sbName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getManageOrganizationRemoteModel() {
        return _manageOrganizationRemoteModel;
    }

    public void setManageOrganizationRemoteModel(
        BaseModel<?> manageOrganizationRemoteModel) {
        _manageOrganizationRemoteModel = manageOrganizationRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _manageOrganizationRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_manageOrganizationRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    public void persist() throws SystemException {
        if (this.isNew()) {
            ManageOrganizationLocalServiceUtil.addManageOrganization(this);
        } else {
            ManageOrganizationLocalServiceUtil.updateManageOrganization(this);
        }
    }

    @Override
    public ManageOrganization toEscapedModel() {
        return (ManageOrganization) ProxyUtil.newProxyInstance(ManageOrganization.class.getClassLoader(),
            new Class[] { ManageOrganization.class },
            new AutoEscapeBeanHandler(this));
    }

    public ManageOrganization toUnescapedModel() {
        return this;
    }

    @Override
    public Object clone() {
        ManageOrganizationClp clone = new ManageOrganizationClp();

        clone.setSbId(getSbId());
        clone.setSbName(getSbName());

        return clone;
    }

    public int compareTo(ManageOrganization manageOrganization) {
        int value = 0;

        if (getSbId() < manageOrganization.getSbId()) {
            value = -1;
        } else if (getSbId() > manageOrganization.getSbId()) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ManageOrganizationClp)) {
            return false;
        }

        ManageOrganizationClp manageOrganization = (ManageOrganizationClp) obj;

        long primaryKey = manageOrganization.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{sbId=");
        sb.append(getSbId());
        sb.append(", sbName=");
        sb.append(getSbName());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.test.portlets.model.ManageOrganization");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>sbId</column-name><column-value><![CDATA[");
        sb.append(getSbId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sbName</column-name><column-value><![CDATA[");
        sb.append(getSbName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
