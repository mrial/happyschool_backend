package com.veleia.hs.services.facade;

import com.veleia.hs.services.aplication.TemperatureApp;
import com.veleia.hs.services.dto.TemperatureDto;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 */
@Path("temperature")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TemperatureFacade {

    @GET
    @Path("/read")
    @Produces(MediaType.TEXT_PLAIN)
    public String read()
    {
        TemperatureApp.create(null);
        return "hola";
    }
    
    
    /**
     * sample: http://localhost:8080/trunk/rest/temperature/create
     */
    @POST
    @Path("/create")
    @Produces(MediaType.TEXT_PLAIN)
    public void create(TemperatureDto entity) {
        TemperatureApp.create(entity);
    }
}
