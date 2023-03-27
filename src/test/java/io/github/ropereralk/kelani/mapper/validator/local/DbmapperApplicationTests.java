package io.github.ropereralk.kelani.mapper.validator.local;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.github.ropereralk.kelani.mapper.validator.local.testutils.TestConstants.TEST_DOCUMENT;

@SpringBootTest
class DbmapperApplicationTests {

	@Test
	void contextLoads() throws ParseException {
		JSONParser parser = new JSONParser();
		JSONObject jsonObject = (JSONObject) parser.parse(TEST_DOCUMENT);

		DocumentValidatorFactoryImpl factory = new DocumentValidatorFactoryImpl();
	//	factory.validateDocument("CustomerOrder",jsonObject);
	}

}
