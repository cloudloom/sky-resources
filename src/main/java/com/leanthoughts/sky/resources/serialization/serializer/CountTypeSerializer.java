package com.leanthoughts.sky.resources.serialization.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.leanthoughts.sky.resources.dictionary.CountType;
import com.leanthoughts.sky.resources.planning.MealPlanProductProjectionResource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sadath on 01-Mar-2016.
 */
public class CountTypeSerializer extends JsonSerializer<MealPlanProductProjectionResource> {
    @Override
    public void serialize(MealPlanProductProjectionResource value, JsonGenerator jgen, SerializerProvider serializers) throws IOException, JsonProcessingException {
        jgen.writeStartObject();
        if(value.getUid() != null) {
            jgen.writeStringField("uid", value.getUid());
        }
        if(value.getProduct() != null) {
            jgen.writeStringField("product", value.getProduct());
        }
        if(value.getQuantity() != null && value.getQuantity().size() > 0) {
            jgen.writeObjectField("quantity", value.getQuantity());
        }
        if(value.getCountType() != null && value.getCountType().size() > 0) {
            Map<String, CountType> fetchedCountType = value.getCountType();
            Map<String, String> countType = new HashMap<String, String>();
            fetchedCountType.entrySet().stream().forEach(entry -> countType.put(entry.getKey(), entry.getValue().getAbbreviation()));
            jgen.writeObjectField("countType", countType);
        }
        jgen.writeEndObject();
    }
}
