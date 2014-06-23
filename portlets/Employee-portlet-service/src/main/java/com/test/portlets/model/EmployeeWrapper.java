package com.test.portlets.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       Employee
 * @generated
 */
public class EmployeeWrapper implements Employee, ModelWrapper<Employee> {
    private Employee _employee;

    public EmployeeWrapper(Employee employee) {
        _employee = employee;
    }

    public Class<?> getModelClass() {
        return Employee.class;
    }

    public String getModelClassName() {
        return Employee.class.getName();
    }

    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employeeId", getEmployeeId());
        attributes.put("employeeName", getEmployeeName());
        attributes.put("employeeGender", getEmployeeGender());
        attributes.put("sbId", getSbId());

        return attributes;
    }

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

    /**
    * Returns the primary key of this employee.
    *
    * @return the primary key of this employee
    */
    public long getPrimaryKey() {
        return _employee.getPrimaryKey();
    }

    /**
    * Sets the primary key of this employee.
    *
    * @param primaryKey the primary key of this employee
    */
    public void setPrimaryKey(long primaryKey) {
        _employee.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the employee ID of this employee.
    *
    * @return the employee ID of this employee
    */
    public long getEmployeeId() {
        return _employee.getEmployeeId();
    }

    /**
    * Sets the employee ID of this employee.
    *
    * @param employeeId the employee ID of this employee
    */
    public void setEmployeeId(long employeeId) {
        _employee.setEmployeeId(employeeId);
    }

    /**
    * Returns the employee name of this employee.
    *
    * @return the employee name of this employee
    */
    public java.lang.String getEmployeeName() {
        return _employee.getEmployeeName();
    }

    /**
    * Sets the employee name of this employee.
    *
    * @param employeeName the employee name of this employee
    */
    public void setEmployeeName(java.lang.String employeeName) {
        _employee.setEmployeeName(employeeName);
    }

    /**
    * Returns the employee gender of this employee.
    *
    * @return the employee gender of this employee
    */
    public java.lang.String getEmployeeGender() {
        return _employee.getEmployeeGender();
    }

    /**
    * Sets the employee gender of this employee.
    *
    * @param employeeGender the employee gender of this employee
    */
    public void setEmployeeGender(java.lang.String employeeGender) {
        _employee.setEmployeeGender(employeeGender);
    }

    /**
    * Returns the sb ID of this employee.
    *
    * @return the sb ID of this employee
    */
    public long getSbId() {
        return _employee.getSbId();
    }

    /**
    * Sets the sb ID of this employee.
    *
    * @param sbId the sb ID of this employee
    */
    public void setSbId(long sbId) {
        _employee.setSbId(sbId);
    }

    public boolean isNew() {
        return _employee.isNew();
    }

    public void setNew(boolean n) {
        _employee.setNew(n);
    }

    public boolean isCachedModel() {
        return _employee.isCachedModel();
    }

    public void setCachedModel(boolean cachedModel) {
        _employee.setCachedModel(cachedModel);
    }

    public boolean isEscapedModel() {
        return _employee.isEscapedModel();
    }

    public java.io.Serializable getPrimaryKeyObj() {
        return _employee.getPrimaryKeyObj();
    }

    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _employee.setPrimaryKeyObj(primaryKeyObj);
    }

    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _employee.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _employee.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EmployeeWrapper((Employee) _employee.clone());
    }

    public int compareTo(Employee employee) {
        return _employee.compareTo(employee);
    }

    @Override
    public int hashCode() {
        return _employee.hashCode();
    }

    public com.liferay.portal.model.CacheModel<Employee> toCacheModel() {
        return _employee.toCacheModel();
    }

    public Employee toEscapedModel() {
        return new EmployeeWrapper(_employee.toEscapedModel());
    }

    public Employee toUnescapedModel() {
        return new EmployeeWrapper(_employee.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _employee.toString();
    }

    public java.lang.String toXmlString() {
        return _employee.toXmlString();
    }

    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _employee.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmployeeWrapper)) {
            return false;
        }

        EmployeeWrapper employeeWrapper = (EmployeeWrapper) obj;

        if (Validator.equals(_employee, employeeWrapper._employee)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated Renamed to {@link #getWrappedModel}
     */
    public Employee getWrappedEmployee() {
        return _employee;
    }

    public Employee getWrappedModel() {
        return _employee;
    }

    public void resetOriginalValues() {
        _employee.resetOriginalValues();
    }
}
