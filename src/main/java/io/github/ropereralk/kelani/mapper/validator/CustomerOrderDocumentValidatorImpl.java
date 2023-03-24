package io.github.ropereralk.kelani.mapper.validator;

import org.json.simple.JSONObject;

class CustomerOrderDocumentValidatorImpl implements DocumentValidator{

    @Override
    public boolean validate(JSONObject document) {
        return true;
    }
}
