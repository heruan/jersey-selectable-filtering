package org.example;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.message.filtering.SelectableEntityFilteringFeature;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api")
public class Application extends ResourceConfig {
    public Application() {
        this.packages("org.example.resource");
        this.property(SelectableEntityFilteringFeature.QUERY_PARAM_NAME, "fields");
        this.register(SelectableEntityFilteringFeature.class);
    }
}
