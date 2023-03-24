package io.github.ropereralk.kelani.mapper.validator;

import org.json.simple.JSONObject;

public class DocumentValidatorFactoryImpl implements DocumentValidatorFactory{

    @Override
    public boolean validateDocument(String collection, JSONObject document) {
        DocumentValidator documentValidator = getDocumentType(collection);

        return documentValidator.validate(document);
    }

    private DocumentValidator getDocumentType(String collection){
        switch (collection)
        {
        case "CustomerOrder":
                return new  CustomerOrderDocumentValidatorImpl();
        default:
            return new DbMapperDocumentValidatorImpl();
        }
    }


}
