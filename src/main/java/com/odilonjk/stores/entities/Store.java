package com.odilonjk.stores.entities;

import org.jnosql.artemis.Column;
import org.jnosql.artemis.Entity;
import org.jnosql.artemis.Id;

import java.io.Serializable;

@Entity
public class Store implements Serializable {

    @Id
    private long id;

    @Column
    private String name;

    @Column
    private String description;

    public Store() {}

    @Override
    public String toString() {
        return "Store: " + this.name + " - " + this.id;
    }

    public static class StoreBuilder {

        private long id;
        private String name;
        private String description;

        public StoreBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public StoreBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public StoreBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Store build() {
            Store store = new Store();
            store.id = this.id;
            store.name = this.name;
            store.description = this.description;
            return store;
        }

    }

}
