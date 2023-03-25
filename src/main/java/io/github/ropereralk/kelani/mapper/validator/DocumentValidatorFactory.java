package io.github.ropereralk.kelani.mapper.validator;


import org.json.simple.JSONObject;

public interface DocumentValidatorFactory {
    void validateCollection(String collection);
    boolean validateDocument(String collection, JSONObject document);

}
