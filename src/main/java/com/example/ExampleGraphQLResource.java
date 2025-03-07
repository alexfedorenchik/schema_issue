package com.example;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import com.example.model.ModelExample;

@GraphQLApi
public class HelloGraphQLResource {

    @Query
    public ModelExample sayHello() {
        return new ModelExample("graphql", "graphql_data");
    }
}