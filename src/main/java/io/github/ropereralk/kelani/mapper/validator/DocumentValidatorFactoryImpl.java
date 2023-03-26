package io.github.ropereralk.kelani.mapper.validator;

import io.github.ropereralk.kelani.mapper.beanCreation.ConfigurationManager;
import io.github.ropereralk.kelani.mapper.dto.CollectionPropertiesDTO;
import io.github.ropereralk.kelani.mapper.exceptions.MapperValidationException;
import io.github.ropereralk.kelani.mapper.util.constants.CollectionsC;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

public class DocumentValidatorFactoryImpl implements DocumentValidatorFactory{
    @Autowired
    ConfigurationManager configurationManager;

  @Override
    public boolean validateDocument(String collection, JSONObject document) throws Exception {

        DocumentValidator documentValidator = getDocumentType(collection);
        documentValidator.validateCollection(collection);
        documentValidator.validateDocument(document, configurationManager);

        return true;
    }

    private DocumentValidator getDocumentType(String collection){
        switch (collection) {

        case CollectionsC.CUSTOMER_ORDER:
                return new  CustomerOrderDocumentValidatorImpl();

        case CollectionsC.ORDER_SERVICE :
            return new OrderServiceDocumentValidatorImpl();

        default:
            return new DbMapperDocumentValidatorImpl();
        }
    }

    private CollectionPropertiesDTO getCollectionProperties(String collection,ConfigurationManager configurationManager){
        configurationManager.getCollectionList();
        return null;
    }


}
