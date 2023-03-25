package io.github.ropereralk.kelani.mapper.beanCreation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ConfigurationManager {

    private final HashMap<String,String> collectionList = new HashMap<>();

    public  HashMap<String,String> getCollectionList(){
        return collectionList;
    }
}
