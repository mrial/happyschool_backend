package com.veleia.happyschool.restful.resource;

import com.veleia.happyschool.restful.pojo.TemperatureDto;
import com.veleia.happyschool.restful.service.application.TemperatureApp;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jdbi.v3.core.Jdbi;

/**
 *
 */
@Path("temperature")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TemperatureResource {

    private final Jdbi jdbi;

    public TemperatureResource(final Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    @GET
    @Path("/read")
    @Produces(MediaType.TEXT_PLAIN)
    public String read() {
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
