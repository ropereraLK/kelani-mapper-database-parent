package io.github.ropereralk.kelani.mapper.validator.local;

import io.github.ropereralk.kelani.mapper.beanCreation.ConfigurationManager;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceDocumentValidatorImpl extends DocumentValidatorImpl {

    @Override
    public boolean validateDocument(JSONObject document, ConfigurationManager configurationManager) {
        return false;
    }
}
