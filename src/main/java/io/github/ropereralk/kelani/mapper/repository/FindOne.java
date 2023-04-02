package io.github.ropereralk.kelani.mapper.repository;

import io.github.ropereralk.kelani.mapper.dbconfigurations.MongoConfiguration;
import io.github.ropereralk.kelani.mapper.exceptions.DocumentNotFoundException;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class FindOne {
    @Autowired
    MongoConfiguration mongoConfiguration;

    public JSONObject find(String key, String value , String collection) {

        Query query = new Query();
        query.addCriteria(Criteria.where(key).is(value));

        try {
            JSONObject document = mongoConfiguration.mongoTemplate().findOne(query, JSONObject.class, collection);

            if (document == null) {
                throw new DocumentNotFoundException(HttpStatus.NOT_FOUND, "DB-FIND_ONE" + " : Document Not Found");
            } else {
                return document;
            }
        }catch (DocumentNotFoundException dne)   {
            throw dne;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }


}
