package io.github.ropereralk.kelani.mapper.validator;

import io.github.ropereralk.kelani.mapper.util.constants.CollectionsC;
import org.json.simple.JSONObject;


public class DocumentValidatorFactoryImpl implements DocumentValidatorFactory{

    @Override
    public void validateCollection(String collection) {

    }

    @Override
    public boolean validateDocument(String collection, JSONObject document) {
        DocumentValidator documentValidator = getDocumentType(collection);

        return documentValidator.validate(document);
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


}
