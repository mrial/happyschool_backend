package com.veleia.happyschool;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import com.veleia.happyschool.health.TemplateHealthCheck;
import com.veleia.happyschool.restful.resource.HappySchoolResource;
import io.dropwizard.jdbi3.JdbiFactory;
import org.jdbi.v3.core.Jdbi;

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
        
        
        final JdbiFactory factory = new JdbiFactory();
        
        final Jdbi jdbi = factory.build(environment, configuration.getDataSourceFactory(), "mysql");
    }
}
