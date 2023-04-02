package io.github.ropereralk.kelani.mapper.service;

import io.github.ropereralk.kelani.mapper.beanCreation.ConfigurationManager;
import io.github.ropereralk.kelani.mapper.repository.FindOne;
import io.github.ropereralk.kelani.mapper.repository.InsertOne;
import io.github.ropereralk.kelani.mapper.util.constants.tools.Sanitizer;
import io.github.ropereralk.kelani.mapper.validator.local.CustomerOrderDocumentValidatorImpl;
import io.github.ropereralk.kelani.mapper.validator.local.DocumentValidatorFactory;
import io.github.ropereralk.kelani.mapper.validator.local.DocumentValidatorFactoryImpl;
import io.github.ropereralk.kelani.mapper.validator.local.OrderServiceDocumentValidatorImpl;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbMapperImpl implements DbMapper {
    @Autowired ConfigurationManager configurationManager;
    @Autowired OrderServiceDocumentValidatorImpl orderServiceDocumentValidatorImpl;
    @Autowired CustomerOrderDocumentValidatorImpl customerOrderDocumentValidatorImpl;
    @Autowired
    InsertOne insertOne;

    @Autowired
    FindOne findOne;
    @Autowired
    DocumentValidatorFactory documentValidatorFactory;
    @Override
    public String createOne(String collection, JSONObject document) throws Exception {
        // First Validate the JsonObject

        documentValidatorFactory.validateDocument(collection,document);
        insertOne.insert(collection,document);
        return null;
    }

    @Override
    public JSONObject findOne(String key, String value , String collection) throws Exception {
        return findOne.find(
            Sanitizer.sanitize(key),
            Sanitizer.sanitize(value) ,
            Sanitizer.sanitize(collection));
    }

    @Override
    public String findOneAndUpdate(JSONObject document, String collection) {
        return null;
    }

    @Override
    public String findOneAndDelete(String id, String collection) {
        return null;
    }
}
