package com.veleia.hs.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public enum PersistenceManager {
    INSTANCE;

    private final EntityManagerFactory entityManagerFactory;

    private PersistenceManager() {
        entityManagerFactory = Persistence.createEntityManagerFactory("Happy_School_PU");
    }

    public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    public void close() {
        entityManagerFactory.close();
    }
}
