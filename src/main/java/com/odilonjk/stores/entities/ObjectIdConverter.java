package com.odilonjk.stores.entities;

import org.jnosql.artemis.AttributeConverter;
import org.bson.types.ObjectId;

public class ObjectIdConverter implements AttributeConverter<String, ObjectId> {

    @Override
    public ObjectId convertToDatabaseColumn(String attribute) {
        if(attribute == null) {
            return null;
        }
        return new ObjectId(attribute);
    }

    @Override
    public String convertToEntityAttribute(ObjectId dbData) {
        if(dbData == null) {
            return null;
        }
        return dbData.toString();
    }
}