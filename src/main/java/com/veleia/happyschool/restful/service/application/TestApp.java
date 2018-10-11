package com.veleia.hs.services.aplication;

import com.veleia.hs.persistence.JpaTestDao;
import com.veleia.hs.persistence.Test;
import com.veleia.hs.services.dto.TestDto;

public class TestApp {

    /**
     *
     * @param testDto
     * @return
     */
    public static Test create(TestDto testDto) {
        final JpaTestDao jpaTestDao = new JpaTestDao();

        final Test test = jpaTestDao.createNewObject();

        jpaTestDao.persist(test);

        return test;
    }
}
