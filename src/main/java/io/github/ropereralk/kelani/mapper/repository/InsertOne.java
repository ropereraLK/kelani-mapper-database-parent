package io.github.ropereralk.kelani.mapper.repository;

import io.github.ropereralk.kelani.mapper.dbconfigurations.MongoConfiguration;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertOne {
    @Autowired
    MongoConfiguration mongoConfiguration;
    public void insert(String collection, JSONObject document) throws Exception {

        mongoConfiguration.mongoTemplate()

           .insert(document,collection);
    }
}
