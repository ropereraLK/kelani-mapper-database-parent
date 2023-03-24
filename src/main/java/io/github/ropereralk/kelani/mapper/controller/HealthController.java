package io.github.ropereralk.kelani.mapper.controller;

import io.github.ropereralk.kelani.mapper.beanCreation.PayRoll;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    public String TEST_DOCUMENT = "{ \"_id\": \"0714e158-c1c2-11ed-afa1-0242ac120002\", \"internal\": { \"isPaired\": true, \"id\": \"0d71cc0a-c1c2-11ed-afa1-0242ac120002\", \"generation\": \"cg\" }, \"status\": \"ACTIVE\", \"external\": { \"version\": \"1.3.0\", \"id\": \"0d71d25e-c1c2-11ed-afa1-0242ac120002\", \"isCopy\": false }, \"links\": [], \"createdDate\": \"2023-03-13T11:45:38.678Z\", \"updatedDate\": \"2023-03-13T11:45:38.678Z\" }";
    @Autowired
    MongoTemplate mongoTemplate ;

    private PayRoll payRoll;
    @GetMapping("/health")
    public String getHealth () throws ParseException {
        return this.payRoll.getEmployeeName();



//        JSONObject js = new JSONObject();
//        JSONParser parser = new JSONParser();
//        JSONObject jsonObject = (JSONObject) parser.parse(TEST_DOCUMENT);
//        mongoTemplate.insert(jsonObject,"Love");
//        //mongoTemplate.creat
//
//        return "Db Mapper Service Up and Running";
    }
}
