package io.github.ropereralk.kelani.mapper.validator.local;

import io.github.ropereralk.kelani.mapper.beanCreation.ConfigurationManager;
import io.github.ropereralk.kelani.mapper.exceptions.MapperValidationException;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import static io.github.ropereralk.kelani.mapper.util.constants.Constants.DOT_NAME;

public abstract class DocumentValidatorImpl implements DocumentValidator {
    @Autowired
    ConfigurationManager configurationManager;
    @Override
    public abstract boolean validateDocument(JSONObject document, ConfigurationManager configurationManager);



    public boolean validateCollection(String collection) throws Exception {
        try {
            if (!(configurationManager.get(collection.concat(DOT_NAME)) == null)) {
                return true;
            }

            throw new MapperValidationException("Validation failed");
        } catch (MapperValidationException e) {
            throw new MapperValidationException("Collection Name Not Permitted");
        }catch (Exception e ){
            throw new Exception(e.getLocalizedMessage());
        }


    }

}
