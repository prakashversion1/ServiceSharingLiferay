package com.test.portlets.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.test.portlets.model.Employee;
import com.test.portlets.service.EmployeeLocalServiceUtil;

/**
 * The extended model base implementation for the Employee service. Represents a row in the &quot;Employee_Employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmployeeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeImpl
 * @see com.test.portlets.model.Employee
 * @generated
 */
public abstract class EmployeeBaseImpl extends EmployeeModelImpl
    implements Employee {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a employee model instance should use the {@link Employee} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            EmployeeLocalServiceUtil.addEmployee(this);
        } else {
            EmployeeLocalServiceUtil.updateEmployee(this);
        }
    }
}