package io.github.ropereralk.kelani.mapper.validator;

import io.github.ropereralk.kelani.mapper.validator.testutils.TestConstants;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;

class DbMapperDocumentValidatorImplTest {


    @Test
    public void validate1() throws ParseException {

        String stringJsonDocument = TestConstants.TEST_DOCUMENT;
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(stringJsonDocument);


    }
}