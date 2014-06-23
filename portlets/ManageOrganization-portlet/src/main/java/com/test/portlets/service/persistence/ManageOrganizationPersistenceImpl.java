package com.test.portlets.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.test.portlets.NoSuchManageOrganizationException;
import com.test.portlets.model.ManageOrganization;
import com.test.portlets.model.impl.ManageOrganizationImpl;
import com.test.portlets.model.impl.ManageOrganizationModelImpl;
import com.test.portlets.service.persistence.ManageOrganizationPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the manage organization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManageOrganizationPersistence
 * @see ManageOrganizationUtil
 * @generated
 */
public class ManageOrganizationPersistenceImpl extends BasePersistenceImpl<ManageOrganization>
    implements ManageOrganizationPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link ManageOrganizationUtil} to access the manage organization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = ManageOrganizationImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ManageOrganizationModelImpl.ENTITY_CACHE_ENABLED,
            ManageOrganizationModelImpl.FINDER_CACHE_ENABLED,
            ManageOrganizationImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ManageOrganizationModelImpl.ENTITY_CACHE_ENABLED,
            ManageOrganizationModelImpl.FINDER_CACHE_ENABLED,
            ManageOrganizationImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ManageOrganizationModelImpl.ENTITY_CACHE_ENABLED,
            ManageOrganizationModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_MANAGEORGANIZATION = "SELECT manageOrganization FROM ManageOrganization manageOrganization";
    private static final String _SQL_COUNT_MANAGEORGANIZATION = "SELECT COUNT(manageOrganization) FROM ManageOrganization manageOrganization";
    private static final String _ORDER_BY_ENTITY_ALIAS = "manageOrganization.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ManageOrganization exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(ManageOrganizationPersistenceImpl.class);
    private static ManageOrganization _nullManageOrganization = new ManageOrganizationImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<ManageOrganization> toCacheModel() {
                return _nullManageOrganizationCacheModel;
            }
        };

    private static CacheModel<ManageOrganization> _nullManageOrganizationCacheModel =
        new CacheModel<ManageOrganization>() {
            public ManageOrganization toEntityModel() {
                return _nullManageOrganization;
            }
        };

    @BeanReference(type = ManageOrganizationPersistence.class)
    protected ManageOrganizationPersistence manageOrganizationPersistence;
    @BeanReference(type = ResourcePersistence.class)
    protected ResourcePersistence resourcePersistence;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;

    /**
     * Caches the manage organization in the entity cache if it is enabled.
     *
     * @param manageOrganization the manage organization
     */
    public void cacheResult(ManageOrganization manageOrganization) {
        EntityCacheUtil.putResult(ManageOrganizationModelImpl.ENTITY_CACHE_ENABLED,
            ManageOrganizationImpl.class, manageOrganization.getPrimaryKey(),
            manageOrganization);

        manageOrganization.resetOriginalValues();
    }

    /**
     * Caches the manage organizations in the entity cache if it is enabled.
     *
     * @param manageOrganizations the manage organizations
     */
    public void cacheResult(List<ManageOrganization> manageOrganizations) {
        for (ManageOrganization manageOrganization : manageOrganizations) {
            if (EntityCacheUtil.getResult(
                        ManageOrganizationModelImpl.ENTITY_CACHE_ENABLED,
                        ManageOrganizationImpl.class,
                        manageOrganization.getPrimaryKey()) == null) {
                cacheResult(manageOrganization);
            } else {
                manageOrganization.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all manage organizations.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(ManageOrganizationImpl.class.getName());
        }

        EntityCacheUtil.clearCache(ManageOrganizationImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the manage organization.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(ManageOrganization manageOrganization) {
        EntityCacheUtil.removeResult(ManageOrganizationModelImpl.ENTITY_CACHE_ENABLED,
            ManageOrganizationImpl.class, manageOrganization.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<ManageOrganization> manageOrganizations) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (ManageOrganization manageOrganization : manageOrganizations) {
            EntityCacheUtil.removeResult(ManageOrganizationModelImpl.ENTITY_CACHE_ENABLED,
                ManageOrganizationImpl.class, manageOrganization.getPrimaryKey());
        }
    }

    /**
     * Creates a new manage organization with the primary key. Does not add the manage organization to the database.
     *
     * @param sbId the primary key for the new manage organization
     * @return the new manage organization
     */
    public ManageOrganization create(long sbId) {
        ManageOrganization manageOrganization = new ManageOrganizationImpl();

        manageOrganization.setNew(true);
        manageOrganization.setPrimaryKey(sbId);

        return manageOrganization;
    }

    /**
     * Removes the manage organization with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param sbId the primary key of the manage organization
     * @return the manage organization that was removed
     * @throws com.test.portlets.NoSuchManageOrganizationException if a manage organization with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public ManageOrganization remove(long sbId)
        throws NoSuchManageOrganizationException, SystemException {
        return remove(Long.valueOf(sbId));
    }

    /**
     * Removes the manage organization with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the manage organization
     * @return the manage organization that was removed
     * @throws com.test.portlets.NoSuchManageOrganizationException if a manage organization with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ManageOrganization remove(Serializable primaryKey)
        throws NoSuchManageOrganizationException, SystemException {
        Session session = null;

        try {
            session = openSession();

            ManageOrganization manageOrganization = (ManageOrganization) session.get(ManageOrganizationImpl.class,
                    primaryKey);

            if (manageOrganization == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchManageOrganizationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(manageOrganization);
        } catch (NoSuchManageOrganizationException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected ManageOrganization removeImpl(
        ManageOrganization manageOrganization) throws SystemException {
        manageOrganization = toUnwrappedModel(manageOrganization);

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.delete(session, manageOrganization);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        clearCache(manageOrganization);

        return manageOrganization;
    }

    @Override
    public ManageOrganization updateImpl(
        com.test.portlets.model.ManageOrganization manageOrganization,
        boolean merge) throws SystemException {
        manageOrganization = toUnwrappedModel(manageOrganization);

        boolean isNew = manageOrganization.isNew();

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.update(session, manageOrganization, merge);

            manageOrganization.setNew(false);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(ManageOrganizationModelImpl.ENTITY_CACHE_ENABLED,
            ManageOrganizationImpl.class, manageOrganization.getPrimaryKey(),
            manageOrganization);

        return manageOrganization;
    }

    protected ManageOrganization toUnwrappedModel(
        ManageOrganization manageOrganization) {
        if (manageOrganization instanceof ManageOrganizationImpl) {
            return manageOrganization;
        }

        ManageOrganizationImpl manageOrganizationImpl = new ManageOrganizationImpl();

        manageOrganizationImpl.setNew(manageOrganization.isNew());
        manageOrganizationImpl.setPrimaryKey(manageOrganization.getPrimaryKey());

        manageOrganizationImpl.setSbId(manageOrganization.getSbId());
        manageOrganizationImpl.setSbName(manageOrganization.getSbName());

        return manageOrganizationImpl;
    }

    /**
     * Returns the manage organization with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the manage organization
     * @return the manage organization
     * @throws com.liferay.portal.NoSuchModelException if a manage organization with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ManageOrganization findByPrimaryKey(Serializable primaryKey)
        throws NoSuchModelException, SystemException {
        return findByPrimaryKey(((Long) primaryKey).longValue());
    }

    /**
     * Returns the manage organization with the primary key or throws a {@link com.test.portlets.NoSuchManageOrganizationException} if it could not be found.
     *
     * @param sbId the primary key of the manage organization
     * @return the manage organization
     * @throws com.test.portlets.NoSuchManageOrganizationException if a manage organization with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public ManageOrganization findByPrimaryKey(long sbId)
        throws NoSuchManageOrganizationException, SystemException {
        ManageOrganization manageOrganization = fetchByPrimaryKey(sbId);

        if (manageOrganization == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + sbId);
            }

            throw new NoSuchManageOrganizationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                sbId);
        }

        return manageOrganization;
    }

    /**
     * Returns the manage organization with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the manage organization
     * @return the manage organization, or <code>null</code> if a manage organization with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ManageOrganization fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        return fetchByPrimaryKey(((Long) primaryKey).longValue());
    }

    /**
     * Returns the manage organization with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param sbId the primary key of the manage organization
     * @return the manage organization, or <code>null</code> if a manage organization with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public ManageOrganization fetchByPrimaryKey(long sbId)
        throws SystemException {
        ManageOrganization manageOrganization = (ManageOrganization) EntityCacheUtil.getResult(ManageOrganizationModelImpl.ENTITY_CACHE_ENABLED,
                ManageOrganizationImpl.class, sbId);

        if (manageOrganization == _nullManageOrganization) {
            return null;
        }

        if (manageOrganization == null) {
            Session session = null;

            boolean hasException = false;

            try {
                session = openSession();

                manageOrganization = (ManageOrganization) session.get(ManageOrganizationImpl.class,
                        Long.valueOf(sbId));
            } catch (Exception e) {
                hasException = true;

                throw processException(e);
            } finally {
                if (manageOrganization != null) {
                    cacheResult(manageOrganization);
                } else if (!hasException) {
                    EntityCacheUtil.putResult(ManageOrganizationModelImpl.ENTITY_CACHE_ENABLED,
                        ManageOrganizationImpl.class, sbId,
                        _nullManageOrganization);
                }

                closeSession(session);
            }
        }

        return manageOrganization;
    }

    /**
     * Returns all the manage organizations.
     *
     * @return the manage organizations
     * @throws SystemException if a system exception occurred
     */
    public List<ManageOrganization> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<ManageOrganization> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    public List<ManageOrganization> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = new Object[] { start, end, orderByComparator };

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<ManageOrganization> list = (List<ManageOrganization>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_MANAGEORGANIZATION);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_MANAGEORGANIZATION.concat(ManageOrganizationModelImpl.ORDER_BY_JPQL);
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (orderByComparator == null) {
                    list = (List<ManageOrganization>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);
                } else {
                    list = (List<ManageOrganization>) QueryUtil.list(q,
                            getDialect(), start, end);
                }
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(finderPath, finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(finderPath, finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the manage organizations from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    public void removeAll() throws SystemException {
        for (ManageOrganization manageOrganization : findAll()) {
            remove(manageOrganization);
        }
    }

    /**
     * Returns the number of manage organizations.
     *
     * @return the number of manage organizations
     * @throws SystemException if a system exception occurred
     */
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_MANAGEORGANIZATION);

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the manage organization persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.test.portlets.model.ManageOrganization")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<ManageOrganization>> listenersList = new ArrayList<ModelListener<ManageOrganization>>();

                for (String listenerClassName : listenerClassNames) {
                    Class<?> clazz = getClass();

                    listenersList.add((ModelListener<ManageOrganization>) InstanceFactory.newInstance(
                            clazz.getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(ManageOrganizationImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
