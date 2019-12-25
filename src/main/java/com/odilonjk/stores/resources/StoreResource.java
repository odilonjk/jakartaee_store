package com.odilonjk.stores.resources;

import com.odilonjk.stores.entities.Store;
import com.odilonjk.stores.services.StoreService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/store")
@ApplicationScoped
public class StoreResource {

    @Inject
    private StoreService storeService;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findById(@PathParam("id") long id) {
        Store store = storeService.findById(id);
        return Response.ok().entity(store).build();
    }

    @POST
    @Path("/{name}")
    public Response create(@PathParam("name") String name) {
        storeService.create(name);
        return Response.accepted().build();
    }

}
