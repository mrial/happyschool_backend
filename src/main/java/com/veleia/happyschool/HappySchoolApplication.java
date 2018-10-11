package com.veleia.happyschool;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import com.veleia.happyschool.resources.HappySchoolResource;
import com.veleia.happyschool.health.TemplateHealthCheck;


public class HappySchoolApplication extends Application<HappySchoolConfiguration> {
    
    public static void main(String[] args) throws Exception {
        new HappySchoolApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<HappySchoolConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(HappySchoolConfiguration configuration, Environment environment) {
        final HappySchoolResource resource = new HappySchoolResource(configuration.getTemplate(), configuration.getDefaultName());
        
        environment.jersey().register(resource);
        
        final TemplateHealthCheck healthCheck = new TemplateHealthCheck(configuration.getTemplate());
        
        environment.healthChecks().register("template", healthCheck);
    }
}
