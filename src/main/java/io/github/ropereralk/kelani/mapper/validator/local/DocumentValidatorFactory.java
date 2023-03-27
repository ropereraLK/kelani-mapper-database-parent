package io.github.ropereralk.kelani.mapper.validator.local;


import org.json.simple.JSONObject;

public interface DocumentValidatorFactory {

   boolean validateDocument(String collection, JSONObject document) throws Exception;



}
