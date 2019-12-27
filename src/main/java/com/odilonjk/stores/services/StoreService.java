package com.odilonjk.stores.services;


import com.odilonjk.stores.entities.Store;
import com.odilonjk.stores.repositories.StoreRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@ApplicationScoped
public class StoreService {

    @Inject
    private StoreRepository storeRepository;

    public Store findById(String id) {
        Optional<Store> optionalStore = storeRepository.findById(id);
        return optionalStore.orElseThrow(EntityNotFoundException::new);
    }

    public void create(Store store) {
        storeRepository.save(store);
    }
}

