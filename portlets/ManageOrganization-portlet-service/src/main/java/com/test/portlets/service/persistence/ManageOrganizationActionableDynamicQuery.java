package com.test.portlets.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.test.portlets.model.ManageOrganization;
import com.test.portlets.service.ManageOrganizationLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ManageOrganizationActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ManageOrganizationActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ManageOrganizationLocalServiceUtil.getService());
        setClass(ManageOrganization.class);

        setClassLoader(com.test.portlets.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("sbId");
    }
}
