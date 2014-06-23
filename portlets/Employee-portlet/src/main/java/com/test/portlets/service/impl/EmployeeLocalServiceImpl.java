package com.test.portlets.service.impl;

import java.util.List;

import javax.net.ssl.SSLException;
import javax.portlet.PortletException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.test.portlets.NoSuchEmployeeException;
import com.test.portlets.model.Employee;
import com.test.portlets.service.base.EmployeeLocalServiceBaseImpl;

/**
 * The implementation of the employee local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.test.portlets.service.EmployeeLocalService} interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Brian Wing Shun Chan
 * @see com.test.portlets.service.base.EmployeeLocalServiceBaseImpl
 * @see com.test.portlets.service.EmployeeLocalServiceUtil
 */
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.test.portlets.service.EmployeeLocalServiceUtil} to access the
	 * employee local service.
	 */

	public Employee addEmployee(Employee employee) throws SystemException {
		Employee newEmployee = employeePersistence.create(counterLocalService
				.increment(Employee.class.getName()));
		newEmployee.setEmployeeGender(employee.getEmployeeGender());
		newEmployee.setEmployeeName(employee.getEmployeeName());
		return employeePersistence.update(newEmployee, false);
	}

	public Employee updateEmployee(Employee employee, long empId)
			throws SystemException, NoSuchEmployeeException {
		Employee oldEmployee = (Employee) employeePersistence
				.findByPrimaryKey(empId);
		oldEmployee.setEmployeeGender(employee.getEmployeeGender());
		oldEmployee.setEmployeeName(employee.getEmployeeName());
		return employeePersistence.update(oldEmployee, false);
	}

	public List<Employee> listAllEmployees() throws SystemException {
		return employeePersistence.findAll();
	}

	public List<Employee> findEployeeBySBID(Long sbId) throws SystemException {
		return employeePersistence.findBySBID(sbId);
	}

	public boolean removeEmployee(long empId) throws SystemException,
			PortalException {
		employeePersistence.remove(empId);
		return true;
	}
}
