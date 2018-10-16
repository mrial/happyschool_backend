package com.veleia.happyschool.persistence;

import java.lang.reflect.ParameterizedType;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

public abstract class JdbiDao<K, E> implements Dao<K, E> {

    protected Class<E> entityClass;

    /**
     *
     */
    public JdbiDao() {
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

    }

    /**
     *
     * @param entity
     */
    @Override
    public void remove(E entity) {

    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public E findById(K id) {
        return this.createNewObject();
    }
}
