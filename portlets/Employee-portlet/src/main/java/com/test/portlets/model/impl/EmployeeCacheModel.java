package com.test.portlets.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.test.portlets.model.Employee;

import java.io.Serializable;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @generated
 */
public class EmployeeCacheModel implements CacheModel<Employee>, Serializable {
    public long employeeId;
    public String employeeName;
    public String employeeGender;
    public long sbId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{employeeId=");
        sb.append(employeeId);
        sb.append(", employeeName=");
        sb.append(employeeName);
        sb.append(", employeeGender=");
        sb.append(employeeGender);
        sb.append(", sbId=");
        sb.append(sbId);
        sb.append("}");

        return sb.toString();
    }

    public Employee toEntityModel() {
        EmployeeImpl employeeImpl = new EmployeeImpl();

        employeeImpl.setEmployeeId(employeeId);

        if (employeeName == null) {
            employeeImpl.setEmployeeName(StringPool.BLANK);
        } else {
            employeeImpl.setEmployeeName(employeeName);
        }

        if (employeeGender == null) {
            employeeImpl.setEmployeeGender(StringPool.BLANK);
        } else {
            employeeImpl.setEmployeeGender(employeeGender);
        }

        employeeImpl.setSbId(sbId);

        employeeImpl.resetOriginalValues();

        return employeeImpl;
    }
}
