package com.leanthoughts.sky.resources.planning;

import com.leanthoughts.sky.resources.BaseResource;
import com.leanthoughts.sky.resources.product.ArticleResource;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sadath on 16-Dec-2015.
 */
public class MealPlanLineItemResource extends BaseResource {
    private PlanningCriteriaGroupResource planningCriteriaGroup;
    private String product;
    private String category;
    private boolean defaultProduct;
    private Map<String, ArticleResource> productMetaData = new HashMap<String, ArticleResource>();
    private Map<String, MealCategoryResource> categoryMetaData = new HashMap<String, MealCategoryResource>();

    public MealPlanLineItemResource() {
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

    public boolean isDefaultProduct() {
        return this.defaultProduct;
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

    public void setDefaultProduct(boolean defaultProduct) {
        this.defaultProduct = defaultProduct;
    }

    public void setProductMetaData(Map<String, ArticleResource> productMetaData) {
        this.productMetaData = productMetaData;
    }

    public void setCategoryMetaData(Map<String, MealCategoryResource> categoryMetaData) {
        this.categoryMetaData = categoryMetaData;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MealPlanLineItemResource)) return false;
        final MealPlanLineItemResource other = (MealPlanLineItemResource) o;
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
        if (this.defaultProduct != other.defaultProduct) return false;
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
        result = result * PRIME + (this.defaultProduct ? 79 : 97);
        final Object $productMetaData = this.productMetaData;
        result = result * PRIME + ($productMetaData == null ? 0 : $productMetaData.hashCode());
        final Object $categoryMetaData = this.categoryMetaData;
        result = result * PRIME + ($categoryMetaData == null ? 0 : $categoryMetaData.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MealPlanLineItemResource;
    }
}