package io.github.ropereralk.kelani.mapper.repository;

import io.github.ropereralk.kelani.mapper.dbconfigurations.MongoConfiguration;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

@Component
public class FindOne {
    @Autowired
    MongoConfiguration mongoConfiguration;

    public JSONObject find(String key, String value , String collection) {

        Query query = new Query();
        query.addCriteria(Criteria.where(key).is(value));

        try {
            return mongoConfiguration.mongoTemplate().findOne(query, JSONObject.class, collection);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }


}
