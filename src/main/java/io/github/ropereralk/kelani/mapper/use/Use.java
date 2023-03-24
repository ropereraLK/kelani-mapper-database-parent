package io.github.ropereralk.kelani.mapper.use;

import io.github.ropereralk.kelani.mapper.service.DbMapper;
import io.github.ropereralk.kelani.mapper.service.DbMapperImpl;
import io.github.ropereralk.kelani.mapper.validator.DocumentValidator;
import org.json.simple.JSONObject;

public class Use {
    DbMapper dbMapper = new DbMapperImpl();
    private DbMapper getDbMapper(){
        return dbMapper;
    }


    public void pushToDb(final JSONObject sampleCourse){

        //Create DB Document
        getDbMapper().createOne("OrderCollection",sampleCourse);

    }



}
