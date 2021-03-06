package com.veleia.happyschool.restful.resource;

import com.codahale.metrics.annotation.Timed;
import com.veleia.happyschool.restful.pojo.SayingDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Optional;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HappySchoolResource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;

    public HappySchoolResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public SayingDto sayHello(@QueryParam("name") Optional<String> name) {
        final String value = String.format(template, name.orElse(defaultName));
        
        return new SayingDto(counter.incrementAndGet(), value);
    }
}
