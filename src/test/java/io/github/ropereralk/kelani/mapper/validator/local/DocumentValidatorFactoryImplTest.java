package io.github.ropereralk.kelani.mapper.validator.local;

import io.github.ropereralk.kelani.mapper.beanCreation.ConfigurationManager;
import io.github.ropereralk.kelani.mapper.dto.CollectionPropertiesDTO;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

class DocumentValidatorFactoryImplTest {
    private ArrayList<CollectionPropertiesDTO> collections = new ArrayList<>();
    @Test
   public void validateDBMapper1(){
        HashMap<String,CollectionPropertiesDTO> collectionPropertiesDTOS = new HashMap<>();
        ArrayList<String> notNullValues = new ArrayList<>();
        notNullValues.add("internal.id");
        notNullValues.add("internal.secondaryId");

        ArrayList<String> nullValues = new ArrayList<>();
        nullValues.add("_id");

        CollectionPropertiesDTO collectionPropertiesDTO = new CollectionPropertiesDTO("order",notNullValues,nullValues);
//        collectionPropertiesDTOS.add(collectionPropertiesDTO);

        ConfigurationManager configurationManager = new ConfigurationManager();
       // configurationManager.setCollectionList(collectionPropertiesDTOS);


        DocumentValidatorFactoryImpl documentValidatorFactory =  new DocumentValidatorFactoryImpl();


    }

}