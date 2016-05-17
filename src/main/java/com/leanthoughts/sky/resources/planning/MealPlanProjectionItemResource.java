package com.leanthoughts.sky.resources.planning;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.leanthoughts.sky.resources.BaseResource;
import com.leanthoughts.sky.resources.dictionary.CountType;
import com.leanthoughts.sky.resources.product.ArticleResource;
import com.leanthoughts.sky.resources.serialization.deserializer.CountTypeDeserializer;
import com.leanthoughts.sky.resources.serialization.serializer.MealPlanProjectionItemSerializer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sadath on 25-Jan-2016.
 */
@JsonSerialize(using = MealPlanProjectionItemSerializer.class)
public class MealPlanProjectionItemResource extends BaseResource {
    private PlanningCriteriaGroupResource planningCriteriaGroup;
    private String product;
    private String category;
    private Double count;
    @JsonDeserialize(using = CountTypeDeserializer.class)
    private CountType countType;
    private Map<String, ArticleResource> productMetaData = new HashMap<String, ArticleResource>();
    private Map<String, MealCategoryResource> categoryMetaData = new HashMap<String, MealCategoryResource>();

    public MealPlanProjectionItemResource() {
    }

    public PlanningCriteriaGroupResource getPlanningCriteriaGroup() {
        return this.planningCriteriaGroup;
    }

    public String getProduct() {
        return this.product;
    }

    public String getCategory() {
        return this.category;
    }

    public Double getCount() {
        return this.count;
    }

    public CountType getCountType() {
        return this.countType;
    }

    public Map<String, ArticleResource> getProductMetaData() {
        return this.productMetaData;
    }

    public Map<String, MealCategoryResource> getCategoryMetaData() {
        return this.categoryMetaData;
    }

    public void setPlanningCriteriaGroup(PlanningCriteriaGroupResource planningCriteriaGroup) {
        this.planningCriteriaGroup = planningCriteriaGroup;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    public void setCountType(CountType countType) {
        this.countType = countType;
    }

    public void setProductMetaData(Map<String, ArticleResource> productMetaData) {
        this.productMetaData = productMetaData;
    }

    public void setCategoryMetaData(Map<String, MealCategoryResource> categoryMetaData) {
        this.categoryMetaData = categoryMetaData;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MealPlanProjectionItemResource)) return false;
        final MealPlanProjectionItemResource other = (MealPlanProjectionItemResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$planningCriteriaGroup = this.planningCriteriaGroup;
        final Object other$planningCriteriaGroup = other.planningCriteriaGroup;
        if (this$planningCriteriaGroup == null ? other$planningCriteriaGroup != null : !this$planningCriteriaGroup.equals(other$planningCriteriaGroup))
            return false;
        final Object this$product = this.product;
        final Object other$product = other.product;
        if (this$product == null ? other$product != null : !this$product.equals(other$product)) return false;
        final Object this$category = this.category;
        final Object other$category = other.category;
        if (this$category == null ? other$category != null : !this$category.equals(other$category)) return false;
        final Object this$count = this.count;
        final Object other$count = other.count;
        if (this$count == null ? other$count != null : !this$count.equals(other$count)) return false;
        final Object this$countType = this.countType;
        final Object other$countType = other.countType;
        if (this$countType == null ? other$countType != null : !this$countType.equals(other$countType)) return false;
        final Object this$productMetaData = this.productMetaData;
        final Object other$productMetaData = other.productMetaData;
        if (this$productMetaData == null ? other$productMetaData != null : !this$productMetaData.equals(other$productMetaData))
            return false;
        final Object this$categoryMetaData = this.categoryMetaData;
        final Object other$categoryMetaData = other.categoryMetaData;
        if (this$categoryMetaData == null ? other$categoryMetaData != null : !this$categoryMetaData.equals(other$categoryMetaData))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $planningCriteriaGroup = this.planningCriteriaGroup;
        result = result * PRIME + ($planningCriteriaGroup == null ? 0 : $planningCriteriaGroup.hashCode());
        final Object $product = this.product;
        result = result * PRIME + ($product == null ? 0 : $product.hashCode());
        final Object $category = this.category;
        result = result * PRIME + ($category == null ? 0 : $category.hashCode());
        final Object $count = this.count;
        result = result * PRIME + ($count == null ? 0 : $count.hashCode());
        final Object $countType = this.countType;
        result = result * PRIME + ($countType == null ? 0 : $countType.hashCode());
        final Object $productMetaData = this.productMetaData;
        result = result * PRIME + ($productMetaData == null ? 0 : $productMetaData.hashCode());
        final Object $categoryMetaData = this.categoryMetaData;
        result = result * PRIME + ($categoryMetaData == null ? 0 : $categoryMetaData.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MealPlanProjectionItemResource;
    }

    public String toString() {
        return "com.leanthoughts.sky.resources.planning.MealPlanProjectionItemResource(planningCriteriaGroup=" + this.planningCriteriaGroup + ", product=" + this.product + ", category=" + this.category + ", count=" + this.count + ", countType=" + this.countType + ", productMetaData=" + this.productMetaData + ", categoryMetaData=" + this.categoryMetaData + ")";
    }
}