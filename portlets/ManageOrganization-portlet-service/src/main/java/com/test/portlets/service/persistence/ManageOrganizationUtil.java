package com.test.portlets.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.test.portlets.model.ManageOrganization;

import java.util.List;

/**
 * The persistence utility for the manage organization service. This utility wraps {@link ManageOrganizationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManageOrganizationPersistence
 * @see ManageOrganizationPersistenceImpl
 * @generated
 */
public class ManageOrganizationUtil {
    private static ManageOrganizationPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(ManageOrganization manageOrganization) {
        getPersistence().clearCache(manageOrganization);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<ManageOrganization> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<ManageOrganization> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<ManageOrganization> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
     */
    public static ManageOrganization update(
        ManageOrganization manageOrganization, boolean merge)
        throws SystemException {
        return getPersistence().update(manageOrganization, merge);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
     */
    public static ManageOrganization update(
        ManageOrganization manageOrganization, boolean merge,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(manageOrganization, merge, serviceContext);
    }

    /**
    * Caches the manage organization in the entity cache if it is enabled.
    *
    * @param manageOrganization the manage organization
    */
    public static void cacheResult(
        com.test.portlets.model.ManageOrganization manageOrganization) {
        getPersistence().cacheResult(manageOrganization);
    }

    /**
    * Caches the manage organizations in the entity cache if it is enabled.
    *
    * @param manageOrganizations the manage organizations
    */
    public static void cacheResult(
        java.util.List<com.test.portlets.model.ManageOrganization> manageOrganizations) {
        getPersistence().cacheResult(manageOrganizations);
    }

    /**
    * Creates a new manage organization with the primary key. Does not add the manage organization to the database.
    *
    * @param sbId the primary key for the new manage organization
    * @return the new manage organization
    */
    public static com.test.portlets.model.ManageOrganization create(long sbId) {
        return getPersistence().create(sbId);
    }

    /**
    * Removes the manage organization with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param sbId the primary key of the manage organization
    * @return the manage organization that was removed
    * @throws com.test.portlets.NoSuchManageOrganizationException if a manage organization with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.test.portlets.model.ManageOrganization remove(long sbId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.portlets.NoSuchManageOrganizationException {
        return getPersistence().remove(sbId);
    }

    public static com.test.portlets.model.ManageOrganization updateImpl(
        com.test.portlets.model.ManageOrganization manageOrganization,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(manageOrganization, merge);
    }

    /**
    * Returns the manage organization with the primary key or throws a {@link com.test.portlets.NoSuchManageOrganizationException} if it could not be found.
    *
    * @param sbId the primary key of the manage organization
    * @return the manage organization
    * @throws com.test.portlets.NoSuchManageOrganizationException if a manage organization with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.test.portlets.model.ManageOrganization findByPrimaryKey(
        long sbId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.portlets.NoSuchManageOrganizationException {
        return getPersistence().findByPrimaryKey(sbId);
    }

    /**
    * Returns the manage organization with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param sbId the primary key of the manage organization
    * @return the manage organization, or <code>null</code> if a manage organization with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.test.portlets.model.ManageOrganization fetchByPrimaryKey(
        long sbId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(sbId);
    }

    /**
    * Returns all the manage organizations.
    *
    * @return the manage organizations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.test.portlets.model.ManageOrganization> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.test.portlets.model.ManageOrganization> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.test.portlets.model.ManageOrganization> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the manage organizations from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of manage organizations.
    *
    * @return the number of manage organizations
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static ManageOrganizationPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (ManageOrganizationPersistence) PortletBeanLocatorUtil.locate(com.test.portlets.service.ClpSerializer.getServletContextName(),
                    ManageOrganizationPersistence.class.getName());

            ReferenceRegistry.registerReference(ManageOrganizationUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated
     */
    public void setPersistence(ManageOrganizationPersistence persistence) {
    }
}
