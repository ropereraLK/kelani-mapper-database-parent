package io.github.ropereralk.kelani.mapper.dto;

import java.util.ArrayList;
import java.util.List;

public class CollectionPropertiesDTO {
    private String name;
    private ArrayList<String> notNullValues;
    private ArrayList<String> nullValues;

    public CollectionPropertiesDTO(String name, ArrayList<String> notNullValues, ArrayList<String> nullValues) {
        this.name = name;
        this.notNullValues = notNullValues;
        this.nullValues = nullValues;
    }

    public CollectionPropertiesDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNotNullValues() {
        return notNullValues;
    }

    public void setNotNullValues(ArrayList<String> notNullValues) {
        this.notNullValues = notNullValues;
    }

    public List<String> getNullValues() {
        return nullValues;
    }

    public void setNullValues(ArrayList<String> nullValues) {
        this.nullValues = nullValues;
    }
}
