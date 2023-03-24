package io.github.ropereralk.kelani.mapper.validator;


import org.json.simple.JSONObject;

public interface DocumentValidatorFactory {

    boolean validateDocument(String collection, JSONObject document);

}
