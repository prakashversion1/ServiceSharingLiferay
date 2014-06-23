package com.test.portlets.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.test.portlets.model.ManageOrganization;

import java.io.Serializable;

/**
 * The cache model class for representing ManageOrganization in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ManageOrganization
 * @generated
 */
public class ManageOrganizationCacheModel implements CacheModel<ManageOrganization>,
    Serializable {
    public long sbId;
    public String sbName;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{sbId=");
        sb.append(sbId);
        sb.append(", sbName=");
        sb.append(sbName);
        sb.append("}");

        return sb.toString();
    }

    public ManageOrganization toEntityModel() {
        ManageOrganizationImpl manageOrganizationImpl = new ManageOrganizationImpl();

        manageOrganizationImpl.setSbId(sbId);

        if (sbName == null) {
            manageOrganizationImpl.setSbName(StringPool.BLANK);
        } else {
            manageOrganizationImpl.setSbName(sbName);
        }

        manageOrganizationImpl.resetOriginalValues();

        return manageOrganizationImpl;
    }
}
