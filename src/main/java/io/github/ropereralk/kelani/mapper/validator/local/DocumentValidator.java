package io.github.ropereralk.kelani.mapper.validator.local;

import io.github.ropereralk.kelani.mapper.beanCreation.ConfigurationManager;
import org.json.simple.JSONObject;

public interface DocumentValidator {



    boolean validateDocument(JSONObject document, ConfigurationManager configurationManager);

    boolean validateCollection(String collection) throws Exception;
}
