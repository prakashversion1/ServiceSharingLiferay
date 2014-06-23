package com.test.portlets.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.test.portlets.model.ManageOrganization;
import com.test.portlets.service.base.ManageOrganizationLocalServiceBaseImpl;

/**
 * The implementation of the manage organization local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.test.portlets.service.ManageOrganizationLocalService} interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Brian Wing Shun Chan
 * @see com.test.portlets.service.base.ManageOrganizationLocalServiceBaseImpl
 * @see com.test.portlets.service.ManageOrganizationLocalServiceUtil
 */
public class ManageOrganizationLocalServiceImpl extends
		ManageOrganizationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.test.portlets.service.ManageOrganizationLocalServiceUtil} to access
	 * the manage organization local service.
	 */
	public ManageOrganization createNewOrganization(ManageOrganization organization)
			throws SystemException {
		System.out.println("Inside  organization method :: CREATED");
		ManageOrganization newOrganization = manageOrganizationPersistence
				.create(counterLocalService.increment(ManageOrganization.class
						.getName()));
		newOrganization.setSbName(organization.getSbName());
		System.out.println("Id of the organization : "
				+ newOrganization.getSbId());
		return manageOrganizationPersistence.update(newOrganization, false);
	}

	public List<ManageOrganization> listAllOrganization()
			throws SystemException {
		return manageOrganizationPersistence.findAll();
	}
}
