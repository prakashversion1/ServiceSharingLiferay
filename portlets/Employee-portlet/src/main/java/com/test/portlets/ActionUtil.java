package com.test.portlets;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.test.portlets.model.Employee;
import com.test.portlets.model.impl.EmployeeImpl;

public class ActionUtil {

	public static Employee getEmployeeFromRequest(ActionRequest request)
			throws PortalException, SystemException {
		Employee emp = new EmployeeImpl();
		emp.setEmployeeGender(request.getParameter("empGender"));
		emp.setEmployeeName(request.getParameter("empName"));
		emp.setSbId(ParamUtil.getLong(request, "empId"));
		return emp;
	}
}
