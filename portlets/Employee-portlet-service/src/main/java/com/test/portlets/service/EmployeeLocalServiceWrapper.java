package com.test.portlets.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link EmployeeLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       EmployeeLocalService
 * @generated
 */
public class EmployeeLocalServiceWrapper implements EmployeeLocalService,
    ServiceWrapper<EmployeeLocalService> {
    private EmployeeLocalService _employeeLocalService;

    public EmployeeLocalServiceWrapper(
        EmployeeLocalService employeeLocalService) {
        _employeeLocalService = employeeLocalService;
    }

    /**
    * Adds the employee to the database. Also notifies the appropriate model listeners.
    *
    * @param employee the employee
    * @return the employee that was added
    * @throws SystemException if a system exception occurred
    */
    public com.test.portlets.model.Employee addEmployee(
        com.test.portlets.model.Employee employee)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.addEmployee(employee);
    }

    /**
    * Creates a new employee with the primary key. Does not add the employee to the database.
    *
    * @param employeeId the primary key for the new employee
    * @return the new employee
    */
    public com.test.portlets.model.Employee createEmployee(long employeeId) {
        return _employeeLocalService.createEmployee(employeeId);
    }

    /**
    * Deletes the employee with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employeeId the primary key of the employee
    * @return the employee that was removed
    * @throws PortalException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.portlets.model.Employee deleteEmployee(long employeeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.deleteEmployee(employeeId);
    }

    /**
    * Deletes the employee from the database. Also notifies the appropriate model listeners.
    *
    * @param employee the employee
    * @return the employee that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.test.portlets.model.Employee deleteEmployee(
        com.test.portlets.model.Employee employee)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.deleteEmployee(employee);
    }

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _employeeLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.dynamicQueryCount(dynamicQuery);
    }

    public com.test.portlets.model.Employee fetchEmployee(long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.fetchEmployee(employeeId);
    }

    /**
    * Returns the employee with the primary key.
    *
    * @param employeeId the primary key of the employee
    * @return the employee
    * @throws PortalException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.portlets.model.Employee getEmployee(long employeeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.getEmployee(employeeId);
    }

    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the employees.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @return the range of employees
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.portlets.model.Employee> getEmployees(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.getEmployees(start, end);
    }

    /**
    * Returns the number of employees.
    *
    * @return the number of employees
    * @throws SystemException if a system exception occurred
    */
    public int getEmployeesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.getEmployeesCount();
    }

    /**
    * Updates the employee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param employee the employee
    * @return the employee that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.test.portlets.model.Employee updateEmployee(
        com.test.portlets.model.Employee employee)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.updateEmployee(employee);
    }

    /**
    * Updates the employee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param employee the employee
    * @param merge whether to merge the employee with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the employee that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.test.portlets.model.Employee updateEmployee(
        com.test.portlets.model.Employee employee, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.updateEmployee(employee, merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _employeeLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _employeeLocalService.setBeanIdentifier(beanIdentifier);
    }

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _employeeLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    public com.test.portlets.model.Employee updateEmployee(
        com.test.portlets.model.Employee employee, long empId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.portlets.NoSuchEmployeeException {
        return _employeeLocalService.updateEmployee(employee, empId);
    }

    public java.util.List<com.test.portlets.model.Employee> listAllEmployees()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.listAllEmployees();
    }

    public java.util.List<com.test.portlets.model.Employee> findEployeeBySBID(
        java.lang.Long sbId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.findEployeeBySBID(sbId);
    }

    public boolean removeEmployee(long empId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.removeEmployee(empId);
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public EmployeeLocalService getWrappedEmployeeLocalService() {
        return _employeeLocalService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedEmployeeLocalService(
        EmployeeLocalService employeeLocalService) {
        _employeeLocalService = employeeLocalService;
    }

    public EmployeeLocalService getWrappedService() {
        return _employeeLocalService;
    }

    public void setWrappedService(EmployeeLocalService employeeLocalService) {
        _employeeLocalService = employeeLocalService;
    }
}
