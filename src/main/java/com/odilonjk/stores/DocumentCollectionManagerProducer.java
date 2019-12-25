package com.odilonjk.stores;


import org.jnosql.artemis.ConfigurationUnit;
import org.jnosql.diana.api.document.DocumentCollectionManager;
import org.jnosql.diana.api.document.DocumentCollectionManagerFactory;
import org.jnosql.diana.api.document.DocumentConfiguration;
import org.jnosql.diana.mongodb.document.MongoDBDocumentCollectionManager;
import org.jnosql.diana.mongodb.document.MongoDBDocumentConfiguration;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

@ApplicationScoped
public class DocumentCollectionManagerProducer {

    private static final String COLLECTION = "stores";

    @Inject
    @ConfigurationUnit(name = "document")
    private DocumentCollectionManagerFactory<MongoDBDocumentCollectionManager> managerFactory;


    @Produces
    public DocumentCollectionManager getManager() {
        return managerFactory.get(COLLECTION);

    }

}