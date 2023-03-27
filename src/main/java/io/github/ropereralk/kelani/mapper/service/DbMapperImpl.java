package io.github.ropereralk.kelani.mapper.service;

import io.github.ropereralk.kelani.mapper.validator.local.DocumentValidatorFactory;
import io.github.ropereralk.kelani.mapper.validator.local.DocumentValidatorFactoryImpl;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class DbMapperImpl implements DbMapper {

    @Override
    public String createOne(String collection, JSONObject document) throws Exception {
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
