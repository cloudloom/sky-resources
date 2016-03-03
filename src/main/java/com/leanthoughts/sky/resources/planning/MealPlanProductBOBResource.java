package com.leanthoughts.sky.resources.planning;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.leanthoughts.sky.resources.BaseResource;
import com.leanthoughts.sky.resources.dictionary.CountType;
import com.leanthoughts.sky.resources.serialization.deserializer.CountTypeDeserializer;
import com.leanthoughts.sky.resources.serialization.serializer.MealPlanProductBOBResourceSerializer;

/**
 * Created by sadath on 01-Mar-2016.
 */
@JsonSerialize(using = MealPlanProductBOBResourceSerializer.class)
public class MealPlanProductBOBResource extends BaseResource {
    private String categoryUid;
    private Double count;
    @JsonDeserialize(using = CountTypeDeserializer.class)
    private CountType countType;

    public MealPlanProductBOBResource() {
    }

    public String getCategoryUid() {
        return this.categoryUid;
    }

    public Double getCount() {
        return this.count;
    }

    public CountType getCountType() {
        return this.countType;
    }

    public void setCategoryUid(String categoryUid) {
        this.categoryUid = categoryUid;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    public void setCountType(CountType countType) {
        this.countType = countType;
    }
}