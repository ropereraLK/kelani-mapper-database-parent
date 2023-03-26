package io.github.ropereralk.kelani.mapper.validator;

import io.github.ropereralk.kelani.mapper.beanCreation.ConfigurationManager;
import org.json.simple.JSONObject;

public class OrderServiceDocumentValidatorImpl extends DocumentValidatorImpl {
    @Override
    public boolean validateDocument(JSONObject document, ConfigurationManager configurationManager) {
        return false;
    }
}
