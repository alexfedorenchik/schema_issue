package com.example;

import com.example.model.ModelExample;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public ModelExample hello() {
        return new ModelExample("rest", "rest_data");
    }
}
