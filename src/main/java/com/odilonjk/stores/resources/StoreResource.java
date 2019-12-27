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
    public Response findById(@PathParam("id") String id) {
        Store store = storeService.findById(id);
        return Response.ok(store).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Store store) {
        storeService.create(store);
        return Response.accepted().build();
    }

}
