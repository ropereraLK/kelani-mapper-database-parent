package io.github.ropereralk.kelani.mapper.controller;

import io.github.ropereralk.kelani.mapper.beanCreation.ConfigurationManager;
import io.github.ropereralk.kelani.mapper.beanCreation.PayRoll;
import io.github.ropereralk.kelani.mapper.service.DbMapper;
import io.github.ropereralk.kelani.mapper.service.DbMapperImpl;
import io.github.ropereralk.kelani.mapper.util.constants.enums.Collections;
import io.github.ropereralk.kelani.mapper.validator.local.CustomerOrderDocumentValidatorImpl;
import io.github.ropereralk.kelani.mapper.validator.local.OrderServiceDocumentValidatorImpl;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static io.github.ropereralk.kelani.mapper.util.constants.CollectionsC.ORDER_SERVICE;
import static io.github.ropereralk.kelani.mapper.util.constants.enums.Collections.valueOfNameByCache;

@RestController
public class HealthController {

    public String TEST_DOCUMENT1 = "{ \"_id\": \"0714e158-c1c2-11ed-afa1-0242ac120002\", \"internal\": { \"isPaired\": true, \"id\": \"0d71cc0a-c1c2-11ed-afa1-0242ac120002\", \"generation\": \"cg\" }, \"status\": \"ACTIVE\", \"external\": { \"version\": \"1.3.0\", \"id\": \"0d71d25e-c1c2-11ed-afa1-0242ac120002\", \"isCopy\": false }, \"links\": [], \"createdDate\": \"2023-03-13T11:45:38.678Z\", \"updatedDate\": \"2023-03-13T11:45:38.678Z\" }";
    @Autowired
    MongoTemplate mongoTemplate ;
    @Autowired
    ConfigurationManager configurationManager;
    //private PayRoll payRoll;
    @Autowired
    DbMapper dbMapper;


    @Autowired OrderServiceDocumentValidatorImpl orderServiceDocumentValidatorImpl;
    @Autowired CustomerOrderDocumentValidatorImpl customerOrderDocumentValidatorImpl;
    @GetMapping("/health")
    public JSONObject getHealth () throws Exception {
       // configurationManager.getCollectionList();

        // return this.payRoll.getEmployeeName();

//                JSONObject js = new JSONObject();
//                JSONParser parser = new JSONParser();
//                JSONObject jsonObject = (JSONObject) parser.parse(TEST_DOCUMENT1);
//                dbMapper.createOne("orderService",jsonObject);
                //mongoTemplate.insert(jsonObject,"Love");
                //mongoTemplate.creat

        JSONObject myvalue = dbMapper.findOne("sName","Alex","students");

        return myvalue;


    }
}
