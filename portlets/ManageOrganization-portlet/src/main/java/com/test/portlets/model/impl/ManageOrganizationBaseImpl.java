package com.test.portlets.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.test.portlets.model.ManageOrganization;
import com.test.portlets.service.ManageOrganizationLocalServiceUtil;

/**
 * The extended model base implementation for the ManageOrganization service. Represents a row in the &quot;ManageOrganization_ManageOrganization&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ManageOrganizationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManageOrganizationImpl
 * @see com.test.portlets.model.ManageOrganization
 * @generated
 */
public abstract class ManageOrganizationBaseImpl
    extends ManageOrganizationModelImpl implements ManageOrganization {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a manage organization model instance should use the {@link ManageOrganization} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            ManageOrganizationLocalServiceUtil.addManageOrganization(this);
        } else {
            ManageOrganizationLocalServiceUtil.updateManageOrganization(this);
        }
    }
}
