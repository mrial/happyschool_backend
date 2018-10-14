package com.veleia.happyschool.persistence;

import java.lang.reflect.ParameterizedType;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class JpaDao<K, E> implements Dao<K, E> {

    protected Class<E> entityClass;

    /**
     *
     */
    public JpaDao() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();

        this.entityClass = (Class<E>) genericSuperclass.getActualTypeArguments()[1];
    }

    /**
     *
     * @return
     */
    public E createNewObject() {
        try {
            return entityClass.newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(JpaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     *
     * @param entity
     */
    @Override
    public void persist(E entity) {
        PersistenceManager.INSTANCE.getEntityManager().getTransaction().begin();

        PersistenceManager.INSTANCE.getEntityManager().persist(entity);

        PersistenceManager.INSTANCE.getEntityManager().getTransaction().commit();
    }

    /**
     *
     * @param entity
     */
    @Override
    public void remove(E entity) {
        PersistenceManager.INSTANCE.getEntityManager().remove(entity);
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public E findById(K id) {
        return PersistenceManager.INSTANCE.getEntityManager().find(entityClass, id);
    }
}
