package com.veleia.hs.services.aplication;

import com.veleia.hs.persistence.JpaTemperatureDao;
import com.veleia.hs.persistence.entities.Temperature;
import com.veleia.hs.services.dto.TemperatureDto;

/**
 *
 */
public class TemperatureApp {

    /**
     *
     * @param temperatureDto
     * @return 
     */
    public static Temperature create(TemperatureDto temperatureDto) {
        final JpaTemperatureDao jpaTemperatureDao = new JpaTemperatureDao();

        final Temperature temperature = jpaTemperatureDao.createNewObject();

        jpaTemperatureDao.persist(temperature);
        
        return temperature;
    }
}
