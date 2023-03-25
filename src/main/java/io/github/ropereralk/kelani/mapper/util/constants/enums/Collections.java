package io.github.ropereralk.kelani.mapper.util.constants.enums;

import io.github.ropereralk.kelani.mapper.exceptions.MapperDoNotExistException;

import java.util.HashMap;
import java.util.Map;

public enum Collections {

    ORDER_SERVICE ("orderService"),
    CUSTOMER_ORDER    ("customerOrder"),
    ORDER   ("order"),;

    public final String collectionName;
    private Collections(String collectionName) {
        this.collectionName = collectionName;
    }

    public static Collections valueOfNameByIterating(String collectionName) {
        for (Collections e : values()) {
            if (e.collectionName.equals(collectionName)) {
                return e;
            }
        }
        throw new MapperDoNotExistException("Collections.valueOfNameByIterating() Collection Name Do Not Exists. collectionName : " +  collectionName);
    }

    private static final Map<String, Collections> BY_COLLECTION_NAME = new HashMap<>();

    public static boolean isCollectionExists(String collectionName){
        if (valueOfNameByCache(collectionName)!= null){
            return true;
        }
        return false;

    }

    static {
        for (Collections e: values()) {
            BY_COLLECTION_NAME.put(e.collectionName, e);
        }
    }

    public static Collections valueOfNameByCache(String collectionName) {
        return BY_COLLECTION_NAME.get(collectionName);
    }
}
