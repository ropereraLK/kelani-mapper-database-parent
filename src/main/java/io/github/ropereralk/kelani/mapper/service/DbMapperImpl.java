package io.github.ropereralk.kelani.mapper.service;

import io.github.ropereralk.kelani.mapper.validator.DocumentValidatorFactory;
import io.github.ropereralk.kelani.mapper.validator.DocumentValidatorFactoryImpl;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class DbMapperImpl implements DbMapper {

    @Override
    public String createOne(String collection, JSONObject document) {
        // First Validate the JsonObject
        DocumentValidatorFactory documentValidatorFactory = new DocumentValidatorFactoryImpl();
        documentValidatorFactory.validateDocument(collection,document);
        return null;
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
