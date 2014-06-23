package com.test.portlets.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link ManageOrganizationLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       ManageOrganizationLocalService
 * @generated
 */
public class ManageOrganizationLocalServiceWrapper
    implements ManageOrganizationLocalService,
        ServiceWrapper<ManageOrganizationLocalService> {
    private ManageOrganizationLocalService _manageOrganizationLocalService;

    public ManageOrganizationLocalServiceWrapper(
        ManageOrganizationLocalService manageOrganizationLocalService) {
        _manageOrganizationLocalService = manageOrganizationLocalService;
    }

    /**
    * Adds the manage organization to the database. Also notifies the appropriate model listeners.
    *
    * @param manageOrganization the manage organization
    * @return the manage organization that was added
    * @throws SystemException if a system exception occurred
    */
    public com.test.portlets.model.ManageOrganization addManageOrganization(
        com.test.portlets.model.ManageOrganization manageOrganization)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _manageOrganizationLocalService.addManageOrganization(manageOrganization);
    }

    /**
    * Creates a new manage organization with the primary key. Does not add the manage organization to the database.
    *
    * @param sbId the primary key for the new manage organization
    * @return the new manage organization
    */
    public com.test.portlets.model.ManageOrganization createManageOrganization(
        long sbId) {
        return _manageOrganizationLocalService.createManageOrganization(sbId);
    }

    /**
    * Deletes the manage organization with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param sbId the primary key of the manage organization
    * @return the manage organization that was removed
    * @throws PortalException if a manage organization with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.portlets.model.ManageOrganization deleteManageOrganization(
        long sbId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _manageOrganizationLocalService.deleteManageOrganization(sbId);
    }

    /**
    * Deletes the manage organization from the database. Also notifies the appropriate model listeners.
    *
    * @param manageOrganization the manage organization
    * @return the manage organization that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.test.portlets.model.ManageOrganization deleteManageOrganization(
        com.test.portlets.model.ManageOrganization manageOrganization)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _manageOrganizationLocalService.deleteManageOrganization(manageOrganization);
    }

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _manageOrganizationLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _manageOrganizationLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _manageOrganizationLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _manageOrganizationLocalService.dynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _manageOrganizationLocalService.dynamicQueryCount(dynamicQuery);
    }

    public com.test.portlets.model.ManageOrganization fetchManageOrganization(
        long sbId) throws com.liferay.portal.kernel.exception.SystemException {
        return _manageOrganizationLocalService.fetchManageOrganization(sbId);
    }

    /**
    * Returns the manage organization with the primary key.
    *
    * @param sbId the primary key of the manage organization
    * @return the manage organization
    * @throws PortalException if a manage organization with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.portlets.model.ManageOrganization getManageOrganization(
        long sbId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _manageOrganizationLocalService.getManageOrganization(sbId);
    }

    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _manageOrganizationLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the manage organizations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of manage organizations
    * @param end the upper bound of the range of manage organizations (not inclusive)
    * @return the range of manage organizations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.portlets.model.ManageOrganization> getManageOrganizations(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _manageOrganizationLocalService.getManageOrganizations(start, end);
    }

    /**
    * Returns the number of manage organizations.
    *
    * @return the number of manage organizations
    * @throws SystemException if a system exception occurred
    */
    public int getManageOrganizationsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _manageOrganizationLocalService.getManageOrganizationsCount();
    }

    /**
    * Updates the manage organization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param manageOrganization the manage organization
    * @return the manage organization that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.test.portlets.model.ManageOrganization updateManageOrganization(
        com.test.portlets.model.ManageOrganization manageOrganization)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _manageOrganizationLocalService.updateManageOrganization(manageOrganization);
    }

    /**
    * Updates the manage organization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param manageOrganization the manage organization
    * @param merge whether to merge the manage organization with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the manage organization that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.test.portlets.model.ManageOrganization updateManageOrganization(
        com.test.portlets.model.ManageOrganization manageOrganization,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _manageOrganizationLocalService.updateManageOrganization(manageOrganization,
            merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _manageOrganizationLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _manageOrganizationLocalService.setBeanIdentifier(beanIdentifier);
    }

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _manageOrganizationLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    public com.test.portlets.model.ManageOrganization createNewOrganization(
        com.test.portlets.model.ManageOrganization organization)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _manageOrganizationLocalService.createNewOrganization(organization);
    }

    public java.util.List<com.test.portlets.model.ManageOrganization> listAllOrganization()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _manageOrganizationLocalService.listAllOrganization();
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public ManageOrganizationLocalService getWrappedManageOrganizationLocalService() {
        return _manageOrganizationLocalService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedManageOrganizationLocalService(
        ManageOrganizationLocalService manageOrganizationLocalService) {
        _manageOrganizationLocalService = manageOrganizationLocalService;
    }

    public ManageOrganizationLocalService getWrappedService() {
        return _manageOrganizationLocalService;
    }

    public void setWrappedService(
        ManageOrganizationLocalService manageOrganizationLocalService) {
        _manageOrganizationLocalService = manageOrganizationLocalService;
    }
}
