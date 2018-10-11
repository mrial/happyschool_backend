package com.veleia.hs.persistence;

import com.veleia.hs.persistence.entities.Temperature;
import java.util.Date;
import java.util.List;

public interface TemperatureDao extends Dao<Integer, Temperature> {

    List<Temperature> findTemperaturesSubmittedSince(Date date);
}
