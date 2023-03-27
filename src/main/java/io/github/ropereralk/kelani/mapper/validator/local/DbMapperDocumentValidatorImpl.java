package io.github.ropereralk.kelani.mapper.validator.local;

import io.github.ropereralk.kelani.mapper.beanCreation.ConfigurationManager;
import io.github.ropereralk.kelani.mapper.exceptions.MapperValidationException;
import org.json.simple.JSONObject;

class DbMapperDocumentValidatorImpl extends DocumentValidatorImpl {

    @Override
    public boolean validateDocument(JSONObject document, ConfigurationManager configurationManager) {
        validateInternalId(document);
        validateExternalId(document);

        return true;
    }

    private void validateInternalId(JSONObject document){
        if(document.get("internal.id")==null){
            throw new MapperValidationException("InternalId Not found");
        }
    }

    private void validateExternalId(JSONObject document){
        if(document.get("external.id")==null){
            throw new MapperValidationException("External Not found");
        }
    }
}
