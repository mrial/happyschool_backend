package com.veleia.happyschool.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JdbiTemperatureDao extends JdbiDao<Integer, Temperature> implements TemperatureDao {

    @Override
    public List<Temperature> findTemperaturesSubmittedSince(Date date) {
        List<Temperature> listTemperatures = new ArrayList<Temperature>(0);
        
        return listTemperatures;
    }
}
