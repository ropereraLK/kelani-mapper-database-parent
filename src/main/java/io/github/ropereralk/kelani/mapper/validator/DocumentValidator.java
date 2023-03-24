package io.github.ropereralk.kelani.mapper.validator;

import org.json.simple.JSONObject;

public interface DocumentValidator {



    boolean validate(JSONObject document);
}
