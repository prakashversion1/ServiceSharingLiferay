package com.test.portlets.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.test.portlets.model.ManageOrganization;

/**
 * The persistence interface for the manage organization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManageOrganizationPersistenceImpl
 * @see ManageOrganizationUtil
 * @generated
 */
public interface ManageOrganizationPersistence extends BasePersistence<ManageOrganization> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link ManageOrganizationUtil} to access the manage organization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the manage organization in the entity cache if it is enabled.
    *
    * @param manageOrganization the manage organization
    */
    public void cacheResult(
        com.test.portlets.model.ManageOrganization manageOrganization);

    /**
    * Caches the manage organizations in the entity cache if it is enabled.
    *
    * @param manageOrganizations the manage organizations
    */
    public void cacheResult(
        java.util.List<com.test.portlets.model.ManageOrganization> manageOrganizations);

    /**
    * Creates a new manage organization with the primary key. Does not add the manage organization to the database.
    *
    * @param sbId the primary key for the new manage organization
    * @return the new manage organization
    */
    public com.test.portlets.model.ManageOrganization create(long sbId);

    /**
    * Removes the manage organization with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param sbId the primary key of the manage organization
    * @return the manage organization that was removed
    * @throws com.test.portlets.NoSuchManageOrganizationException if a manage organization with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.portlets.model.ManageOrganization remove(long sbId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.portlets.NoSuchManageOrganizationException;

    public com.test.portlets.model.ManageOrganization updateImpl(
        com.test.portlets.model.ManageOrganization manageOrganization,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the manage organization with the primary key or throws a {@link com.test.portlets.NoSuchManageOrganizationException} if it could not be found.
    *
    * @param sbId the primary key of the manage organization
    * @return the manage organization
    * @throws com.test.portlets.NoSuchManageOrganizationException if a manage organization with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.portlets.model.ManageOrganization findByPrimaryKey(
        long sbId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.portlets.NoSuchManageOrganizationException;

    /**
    * Returns the manage organization with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param sbId the primary key of the manage organization
    * @return the manage organization, or <code>null</code> if a manage organization with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.portlets.model.ManageOrganization fetchByPrimaryKey(
        long sbId) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the manage organizations.
    *
    * @return the manage organizations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.portlets.model.ManageOrganization> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.test.portlets.model.ManageOrganization> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the manage organizations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of manage organizations
    * @param end the upper bound of the range of manage organizations (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of manage organizations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.portlets.model.ManageOrganization> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the manage organizations from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of manage organizations.
    *
    * @return the number of manage organizations
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
