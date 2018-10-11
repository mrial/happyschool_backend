package com.veleia.hs.persistence;

import com.veleia.hs.persistence.entities.Temperature;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;

public class JpaQuestionDao extends JpaDao<Integer, Temperature> implements TemperatureDao {

    @Override
    public List<Temperature> findTemperaturesSubmittedSince(Date date) {
        Query q = PersistenceManager.INSTANCE.getEntityManager().createQuery("SELECT e FROM " + entityClass.getName() + " e WHERE date >= :date_since");
        
        q.setParameter("date_since", date);
        
        return (List<Temperature>) q.getResultList();
    }
}
