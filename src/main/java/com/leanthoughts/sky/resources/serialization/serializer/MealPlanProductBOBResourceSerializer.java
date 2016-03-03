package com.leanthoughts.sky.resources.serialization.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.leanthoughts.sky.resources.planning.MealPlanProductBOBResource;

import java.io.IOException;

/**
 * Created by sadath on 01-Mar-2016.
 */
public class MealPlanProductBOBResourceSerializer extends JsonSerializer<MealPlanProductBOBResource> {
    @Override
    public void serialize(MealPlanProductBOBResource value, JsonGenerator jgen, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        if(value.getCategoryUid() != null && value.getCount() != null && value.getCountType() != null) {
            jgen.writeStartObject();
            jgen.writeStringField("uid", value.getUid());
            jgen.writeStringField("categoryUid", value.getCategoryUid());
            jgen.writeNumberField("count", value.getCount() != null ? value.getCount().doubleValue() : 0.0);
            jgen.writeStringField("countType", value.getCountType() != null ? value.getCountType().getAbbreviation() : null);
            jgen.writeEndObject();
        }
    }
}
