package com.leanthoughts.sky.resources.serialization.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.leanthoughts.sky.resources.dictionary.CountType;

import java.io.IOException;

/**
 * Created by sadath on 01-Mar-2016.
 */
public class CountTypeDeserializer extends JsonDeserializer<CountType> {
    @Override
    public CountType deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return CountType.fromValue(p.getValueAsString());
    }
}
