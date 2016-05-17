package com.leanthoughts.sky.resources.serialization.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.leanthoughts.sky.resources.planning.MealPlanProjectionItemResource;

import java.io.IOException;

/**
 * Created by sadath on 17-May-2016.
 */
public class MealPlanProjectionItemSerializer extends JsonSerializer<MealPlanProjectionItemResource> {
    @Override
    public void serialize(MealPlanProjectionItemResource value, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("uid", value.getUid());
        jsonGenerator.writeObjectField("planningCriteriaGroup", value.getPlanningCriteriaGroup());
        jsonGenerator.writeStringField("product", value.getProduct());
        jsonGenerator.writeStringField("category", value.getCategory());
        jsonGenerator.writeNumberField("count", value.getCount() != null ? value.getCount().doubleValue() : 0.0);
        jsonGenerator.writeStringField("countType", value.getCountType() != null ? value.getCountType().getAbbreviation() : null);
        jsonGenerator.writeObjectField("productMetaData", value.getProductMetaData());
        jsonGenerator.writeObjectField("categoryMetaData", value.getCategoryMetaData());
        jsonGenerator.writeEndObject();
    }
}
