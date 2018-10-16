package com.veleia.happyschool.persistence;

import java.util.Date;
import java.util.List;

public interface TemperatureDao extends Dao<Integer, Temperature> {

    List<Temperature> findTemperaturesSubmittedSince(Date date);
}
