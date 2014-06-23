package com.test.portlets.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.test.portlets.service.ClpSerializer;
import com.test.portlets.service.EmployeeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class EmployeeClp extends BaseModelImpl<Employee> implements Employee {
    private long _employeeId;
    private String _employeeName;
    private String _employeeGender;
    private long _sbId;
    private BaseModel<?> _employeeRemoteModel;

    public EmployeeClp() {
    }

    public Class<?> getModelClass() {
        return Employee.class;
    }

    public String getModelClassName() {
        return Employee.class.getName();
    }

    public long getPrimaryKey() {
        return _employeeId;
    }

    public void setPrimaryKey(long primaryKey) {
        setEmployeeId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_employeeId);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employeeId", getEmployeeId());
        attributes.put("employeeName", getEmployeeName());
        attributes.put("employeeGender", getEmployeeGender());
        attributes.put("sbId", getSbId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long employeeId = (Long) attributes.get("employeeId");

        if (employeeId != null) {
            setEmployeeId(employeeId);
        }

        String employeeName = (String) attributes.get("employeeName");

        if (employeeName != null) {
            setEmployeeName(employeeName);
        }

        String employeeGender = (String) attributes.get("employeeGender");

        if (employeeGender != null) {
            setEmployeeGender(employeeGender);
        }

        Long sbId = (Long) attributes.get("sbId");

        if (sbId != null) {
            setSbId(sbId);
        }
    }

    public long getEmployeeId() {
        return _employeeId;
    }

    public void setEmployeeId(long employeeId) {
        _employeeId = employeeId;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployeeId", long.class);

                method.invoke(_employeeRemoteModel, employeeId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public String getEmployeeName() {
        return _employeeName;
    }

    public void setEmployeeName(String employeeName) {
        _employeeName = employeeName;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployeeName", String.class);

                method.invoke(_employeeRemoteModel, employeeName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public String getEmployeeGender() {
        return _employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        _employeeGender = employeeGender;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployeeGender",
                        String.class);

                method.invoke(_employeeRemoteModel, employeeGender);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public long getSbId() {
        return _sbId;
    }

    public void setSbId(long sbId) {
        _sbId = sbId;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setSbId", long.class);

                method.invoke(_employeeRemoteModel, sbId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEmployeeRemoteModel() {
        return _employeeRemoteModel;
    }

    public void setEmployeeRemoteModel(BaseModel<?> employeeRemoteModel) {
        _employeeRemoteModel = employeeRemoteModel;
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

        Class<?> remoteModelClass = _employeeRemoteModel.getClass();

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

        Object returnValue = method.invoke(_employeeRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    public void persist() throws SystemException {
        if (this.isNew()) {
            EmployeeLocalServiceUtil.addEmployee(this);
        } else {
            EmployeeLocalServiceUtil.updateEmployee(this);
        }
    }

    @Override
    public Employee toEscapedModel() {
        return (Employee) ProxyUtil.newProxyInstance(Employee.class.getClassLoader(),
            new Class[] { Employee.class }, new AutoEscapeBeanHandler(this));
    }

    public Employee toUnescapedModel() {
        return this;
    }

    @Override
    public Object clone() {
        EmployeeClp clone = new EmployeeClp();

        clone.setEmployeeId(getEmployeeId());
        clone.setEmployeeName(getEmployeeName());
        clone.setEmployeeGender(getEmployeeGender());
        clone.setSbId(getSbId());

        return clone;
    }

    public int compareTo(Employee employee) {
        int value = 0;

        if (getEmployeeId() < employee.getEmployeeId()) {
            value = -1;
        } else if (getEmployeeId() > employee.getEmployeeId()) {
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

        if (!(obj instanceof EmployeeClp)) {
            return false;
        }

        EmployeeClp employee = (EmployeeClp) obj;

        long primaryKey = employee.getPrimaryKey();

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
        StringBundler sb = new StringBundler(9);

        sb.append("{employeeId=");
        sb.append(getEmployeeId());
        sb.append(", employeeName=");
        sb.append(getEmployeeName());
        sb.append(", employeeGender=");
        sb.append(getEmployeeGender());
        sb.append(", sbId=");
        sb.append(getSbId());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.test.portlets.model.Employee");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>employeeId</column-name><column-value><![CDATA[");
        sb.append(getEmployeeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employeeName</column-name><column-value><![CDATA[");
        sb.append(getEmployeeName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employeeGender</column-name><column-value><![CDATA[");
        sb.append(getEmployeeGender());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sbId</column-name><column-value><![CDATA[");
        sb.append(getSbId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
