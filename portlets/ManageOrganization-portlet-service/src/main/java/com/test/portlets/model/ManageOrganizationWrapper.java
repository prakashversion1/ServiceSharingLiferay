package com.test.portlets.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ManageOrganization}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       ManageOrganization
 * @generated
 */
public class ManageOrganizationWrapper implements ManageOrganization,
    ModelWrapper<ManageOrganization> {
    private ManageOrganization _manageOrganization;

    public ManageOrganizationWrapper(ManageOrganization manageOrganization) {
        _manageOrganization = manageOrganization;
    }

    public Class<?> getModelClass() {
        return ManageOrganization.class;
    }

    public String getModelClassName() {
        return ManageOrganization.class.getName();
    }

    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("sbId", getSbId());
        attributes.put("sbName", getSbName());

        return attributes;
    }

    public void setModelAttributes(Map<String, Object> attributes) {
        Long sbId = (Long) attributes.get("sbId");

        if (sbId != null) {
            setSbId(sbId);
        }

        String sbName = (String) attributes.get("sbName");

        if (sbName != null) {
            setSbName(sbName);
        }
    }

    /**
    * Returns the primary key of this manage organization.
    *
    * @return the primary key of this manage organization
    */
    public long getPrimaryKey() {
        return _manageOrganization.getPrimaryKey();
    }

    /**
    * Sets the primary key of this manage organization.
    *
    * @param primaryKey the primary key of this manage organization
    */
    public void setPrimaryKey(long primaryKey) {
        _manageOrganization.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the sb ID of this manage organization.
    *
    * @return the sb ID of this manage organization
    */
    public long getSbId() {
        return _manageOrganization.getSbId();
    }

    /**
    * Sets the sb ID of this manage organization.
    *
    * @param sbId the sb ID of this manage organization
    */
    public void setSbId(long sbId) {
        _manageOrganization.setSbId(sbId);
    }

    /**
    * Returns the sb name of this manage organization.
    *
    * @return the sb name of this manage organization
    */
    public java.lang.String getSbName() {
        return _manageOrganization.getSbName();
    }

    /**
    * Sets the sb name of this manage organization.
    *
    * @param sbName the sb name of this manage organization
    */
    public void setSbName(java.lang.String sbName) {
        _manageOrganization.setSbName(sbName);
    }

    public boolean isNew() {
        return _manageOrganization.isNew();
    }

    public void setNew(boolean n) {
        _manageOrganization.setNew(n);
    }

    public boolean isCachedModel() {
        return _manageOrganization.isCachedModel();
    }

    public void setCachedModel(boolean cachedModel) {
        _manageOrganization.setCachedModel(cachedModel);
    }

    public boolean isEscapedModel() {
        return _manageOrganization.isEscapedModel();
    }

    public java.io.Serializable getPrimaryKeyObj() {
        return _manageOrganization.getPrimaryKeyObj();
    }

    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _manageOrganization.setPrimaryKeyObj(primaryKeyObj);
    }

    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _manageOrganization.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _manageOrganization.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new ManageOrganizationWrapper((ManageOrganization) _manageOrganization.clone());
    }

    public int compareTo(ManageOrganization manageOrganization) {
        return _manageOrganization.compareTo(manageOrganization);
    }

    @Override
    public int hashCode() {
        return _manageOrganization.hashCode();
    }

    public com.liferay.portal.model.CacheModel<ManageOrganization> toCacheModel() {
        return _manageOrganization.toCacheModel();
    }

    public ManageOrganization toEscapedModel() {
        return new ManageOrganizationWrapper(_manageOrganization.toEscapedModel());
    }

    public ManageOrganization toUnescapedModel() {
        return new ManageOrganizationWrapper(_manageOrganization.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _manageOrganization.toString();
    }

    public java.lang.String toXmlString() {
        return _manageOrganization.toXmlString();
    }

    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _manageOrganization.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ManageOrganizationWrapper)) {
            return false;
        }

        ManageOrganizationWrapper manageOrganizationWrapper = (ManageOrganizationWrapper) obj;

        if (Validator.equals(_manageOrganization,
                    manageOrganizationWrapper._manageOrganization)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated Renamed to {@link #getWrappedModel}
     */
    public ManageOrganization getWrappedManageOrganization() {
        return _manageOrganization;
    }

    public ManageOrganization getWrappedModel() {
        return _manageOrganization;
    }

    public void resetOriginalValues() {
        _manageOrganization.resetOriginalValues();
    }
}
