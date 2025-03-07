package com.example;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLSchema;
import jakarta.enterprise.event.Observes;

@GraphQLApi
public class ExampleGraphQLResource {

    @Query
    public ModelExample sayHello() {
        return new ModelExample("graphql", "graphql_data");
    }

    public GraphQLSchema.Builder beforeSchemaBuild(@Observes GraphQLSchema.Builder builder) {
        builder.additionalType(ExtendedScalars.Object);
        return builder;
    }
}