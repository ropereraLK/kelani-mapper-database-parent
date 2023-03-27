package io.github.ropereralk.kelani.mapper.validator.local;

import io.github.ropereralk.kelani.mapper.beanCreation.ConfigurationManager;
import org.json.simple.JSONObject;

class CustomerOrderDocumentValidatorImpl extends DocumentValidatorImpl{

    @Override
    public boolean validateDocument(JSONObject document, ConfigurationManager configurationManager) {
        return true;
    }
}
