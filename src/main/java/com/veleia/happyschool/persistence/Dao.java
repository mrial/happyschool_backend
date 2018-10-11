package com.veleia.hs.persistence;

/**
 * Generic DAO interface with the methods to share
 *
 * @param <K> the type to use as the key
 * @param <E> the type of the entity
 */
public interface Dao<K, E> {

    void persist(E entity);

    void remove(E entity);

    E findById(K id);
}
