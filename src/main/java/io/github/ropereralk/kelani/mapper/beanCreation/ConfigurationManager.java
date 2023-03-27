package io.github.ropereralk.kelani.mapper.beanCreation;

import io.github.ropereralk.kelani.mapper.dto.CollectionPropertiesDTO;
import org.json.simple.JSONObject;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

@Configuration
@ConfigurationProperties("kelani.mapper.collections")
public class ConfigurationManager extends Properties {

//    public ConfigurationManager(){
//        System.out.println("dd");
//    }


  //  @Value("${kelani.mapper.collections}")
    //private ArrayList<JSONObject> collections;



//    public  ArrayList< JSONObject> getCollectionList(){
//        return collections;
//    }
//
//    public void setCollectionList(ArrayList<JSONObject> collections) {
//        this.collections = collections;
//    }


}
