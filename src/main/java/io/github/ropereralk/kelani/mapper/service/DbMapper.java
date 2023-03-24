package io.github.ropereralk.kelani.mapper.service;

import org.json.simple.JSONObject;
/**
 * The Interface DbMapper.
 *
 * We define DbMapper Interface to implementation.
 *
 * @param <T>
 */
public interface DbMapper {

    public String createOne( String collection,JSONObject document);

    public String findOneAndUpdate(JSONObject document, String collection);

    public String findOneAndDelete(String id, String collection);


}
