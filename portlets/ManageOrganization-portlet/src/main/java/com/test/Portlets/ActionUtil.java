package com.test.Portlets;

import javax.portlet.ActionRequest;

import com.test.portlets.model.ManageOrganization;
import com.test.portlets.model.impl.ManageOrganizationImpl;

public class ActionUtil {

	public static ManageOrganization getOrganizationInstance(
			ActionRequest request) {
		ManageOrganization organization = new ManageOrganizationImpl();
		organization.setSbName(request.getParameter("sbName"));
		return organization;
	}
}
