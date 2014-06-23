package com.test.Portlets;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.test.portlets.model.Employee;
import com.test.portlets.model.ManageOrganization;
import com.test.portlets.service.EmployeeLocalServiceUtil;
import com.test.portlets.service.ManageOrganizationLocalServiceUtil;

public class ManageOrganizationPortlet extends MVCPortlet {

	public void saveOrganization(ActionRequest request, ActionResponse response) {
		try {
			ManageOrganization organization = ActionUtil
					.getOrganizationInstance(request);
			System.out.println("New Organization is being added");
			ManageOrganizationLocalServiceUtil
					.createNewOrganization(organization);
			SessionMessages.add(request, "success-add-organization");
		} catch (SystemException e) {
			System.out.println("Exception Occurred");
			e.printStackTrace();
			SessionErrors.add(request, "success-add-organization");
		}
	}

	public void getEmployeeBySBID(ActionRequest request, ActionResponse response)
			throws SystemException {
		System.out.println("Hello From get Employee");
		Long sbId = ParamUtil.getLong(request, "sbId");
		System.out.println("Request for search with SBID as : " + sbId);
		List<Employee> listOfEmployees = EmployeeLocalServiceUtil
				.findEployeeBySBID(sbId);
		System.out.println("The list of employee from search is : "
				+ listOfEmployees.size());
		JSONArray listofJSONEmp = JSONFactoryUtil.createJSONArray();
		for (Employee emp : listOfEmployees) {
			JSONObject json = JSONFactoryUtil.createJSONObject();
			json.put("empName", emp.getEmployeeName());
			json.put("empGender", emp.getEmployeeGender());
			json.put("empId", emp.getEmployeeId());
			listofJSONEmp.put(json);
		}
		try {
			writeJSON(request, response, listofJSONEmp);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error while converting to JSON");
		}
	}
}
