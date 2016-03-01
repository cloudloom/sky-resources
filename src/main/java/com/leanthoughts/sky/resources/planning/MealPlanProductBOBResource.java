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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MealPlanProductBOBResource)) return false;
        final MealPlanProductBOBResource other = (MealPlanProductBOBResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$categoryUid = this.categoryUid;
        final Object other$categoryUid = other.categoryUid;
        if (this$categoryUid == null ? other$categoryUid != null : !this$categoryUid.equals(other$categoryUid))
            return false;
        final Object this$count = this.count;
        final Object other$count = other.count;
        if (this$count == null ? other$count != null : !this$count.equals(other$count)) return false;
        final Object this$countType = this.countType;
        final Object other$countType = other.countType;
        if (this$countType == null ? other$countType != null : !this$countType.equals(other$countType)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $categoryUid = this.categoryUid;
        result = result * PRIME + ($categoryUid == null ? 0 : $categoryUid.hashCode());
        final Object $count = this.count;
        result = result * PRIME + ($count == null ? 0 : $count.hashCode());
        final Object $countType = this.countType;
        result = result * PRIME + ($countType == null ? 0 : $countType.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MealPlanProductBOBResource;
    }
}