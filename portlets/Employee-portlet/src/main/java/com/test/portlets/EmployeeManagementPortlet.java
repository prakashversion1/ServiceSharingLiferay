package com.test.portlets;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.test.portlets.model.Employee;
import com.test.portlets.service.EmployeeLocalServiceUtil;

public class EmployeeManagementPortlet extends MVCPortlet {
	private String loadEmployeeJSP = "/html/edit.jsp";
	private String showEmployeeJSP = "/html/show.jsp";

	public void addEmployee(ActionRequest request, ActionResponse response) {
		try {
			System.out.println("The user add request is being processed");
			Employee emp = ActionUtil.getEmployeeFromRequest(request);
			EmployeeLocalServiceUtil.addEmployee(emp);
			SessionMessages.add(request, "success");
		} catch (Exception ex) {
			System.out.println("There is a error adding user");
			SessionErrors.add(request, "error");
		}
	}

	public void loadEmployee(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException {
		Long empId = ParamUtil.getLong(request, "empId");
		System.out.println("Employee load request for employee with id : "
				+ empId);
		Employee emp = EmployeeLocalServiceUtil.getEmployee(empId);
		if (Validator.isNotNull(emp)) {
			request.setAttribute("employee", emp);
			response.setRenderParameter("jspPage", loadEmployeeJSP);
		} else {
			SessionErrors.add(request, "employee-not-found");
		}
	}

	public void updateEmployee(ActionRequest request, ActionResponse response) {
		Long empId = ParamUtil.getLong(request, "empId");
		System.out.println("Employee update request for employee with id : "
				+ empId);
		try {
			if (Validator.isNotNull(empId)) {
				Employee employee = ActionUtil.getEmployeeFromRequest(request);
				EmployeeLocalServiceUtil.updateEmployee(employee, empId);
				response.setRenderParameter("jspPage", showEmployeeJSP);
			}
		} catch (NoSuchEmployeeException e) {
			System.out.println("No User found for updating");
			e.printStackTrace();
		} catch (SystemException | PortalException  ex) {
			System.out.println("Exception Occured while Saving");
			ex.printStackTrace();
		}
	}

	public void deleteEmployee(ActionRequest request, ActionResponse response) {
		Long empId = ParamUtil.getLong(request, "empId");
		System.out.println("Employee delete request for employee with id : "
				+ empId);
		try {
			EmployeeLocalServiceUtil.removeEmployee(empId);
			SessionMessages.add(request, "Deletion Successfull");
		} catch (PortalException | SystemException e) {
			SessionErrors.add(request, "Detetion Error");
			e.printStackTrace();
		}
	}

}
