package io.github.ropereralk.kelani.mapper.validator.local;

import io.github.ropereralk.kelani.mapper.beanCreation.ConfigurationManager;
import io.github.ropereralk.kelani.mapper.dto.CollectionPropertiesDTO;
import io.github.ropereralk.kelani.mapper.util.constants.CollectionsC;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DocumentValidatorFactoryImpl implements DocumentValidatorFactory{

    @Autowired
    ConfigurationManager configurationManager;
    @Autowired
    OrderServiceDocumentValidatorImpl orderServiceDocumentValidatorImpl;
    @Autowired
    CustomerOrderDocumentValidatorImpl customerOrderDocumentValidatorImpl;
    @Autowired
    DbMapperDocumentValidatorImpl dbMapperDocumentValidatorImpl;

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
                return  customerOrderDocumentValidatorImpl;

        case CollectionsC.ORDER_SERVICE :
            return  orderServiceDocumentValidatorImpl;

        default:
            return dbMapperDocumentValidatorImpl;
        }
    }

    private CollectionPropertiesDTO getCollectionProperties(String collection,ConfigurationManager configurationManager){
        //configurationManager.getCollectionList();
        return null;
    }


}
