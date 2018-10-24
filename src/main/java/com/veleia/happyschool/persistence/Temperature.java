package com.veleia.happyschool.persistence;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Popo
 */
//@Entity
//@Table(name = "temperature")
@XmlRootElement
public class Temperature implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "temperature_id")
//    private Integer temperatureId;
//    @Basic(optional = false)
//    @Column(name = "created")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date created;
//    @Basic(optional = false)
//    @Column(name = "sensor_id")
//    private short sensorId;
//    @Basic(optional = false)
//    @Column(name = "temperature")
//    private long temperature;
//
//    public Temperature() {
//    }
//
//    public Temperature(Integer temperatureId) {
//        this.temperatureId = temperatureId;
//    }
//
//    public Temperature(Integer temperatureId, Date created, short sensorId, long temperature) {
//        this.temperatureId = temperatureId;
//        this.created = created;
//        this.sensorId = sensorId;
//        this.temperature = temperature;
//    }
//
//    public Integer getTemperatureId() {
//        return temperatureId;
//    }
//
//    public void setTemperatureId(Integer temperatureId) {
//        this.temperatureId = temperatureId;
//    }
//
//    public Date getCreated() {
//        return created;
//    }
//
//    public void setCreated(Date created) {
//        this.created = created;
//    }
//
//    public short getSensorId() {
//        return sensorId;
//    }
//
//    public void setSensorId(short sensorId) {
//        this.sensorId = sensorId;
//    }
//
//    public long getTemperature() {
//        return temperature;
//    }
//
//    public void setTemperature(long temperature) {
//        this.temperature = temperature;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (temperatureId != null ? temperatureId.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Temperature)) {
//            return false;
//        }
//        Temperature other = (Temperature) object;
//        if ((this.temperatureId == null && other.temperatureId != null) || (this.temperatureId != null && !this.temperatureId.equals(other.temperatureId))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "javaapplication1.Temperature[ temperatureId=" + temperatureId + " ]";
//    }
    
}

