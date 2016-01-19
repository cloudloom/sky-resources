package com.leanthoughts.sky.resources;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by sadath on 16-Dec-2015.
 */
public class MealPlanLineItemResource extends BaseResource {
    private PlanningCriteriaGroupResource planningCriteriaGroup;
    private Set<String> products = new HashSet<String>();
    private Map<String, ProductResource> productMetaData = new HashMap<String, ProductResource>();

    public MealPlanLineItemResource() {
    }

    public PlanningCriteriaGroupResource getPlanningCriteriaGroup() {
        return this.planningCriteriaGroup;
    }

    public Set<String> getProducts() {
        return this.products;
    }

    public Map<String, ProductResource> getProductMetaData() {
        return this.productMetaData;
    }

    public void setPlanningCriteriaGroup(PlanningCriteriaGroupResource planningCriteriaGroup) {
        this.planningCriteriaGroup = planningCriteriaGroup;
    }

    public void setProducts(Set<String> products) {
        this.products = products;
    }

    public void setProductMetaData(Map<String, ProductResource> productMetaData) {
        this.productMetaData = productMetaData;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MealPlanLineItemResource)) return false;
        final MealPlanLineItemResource other = (MealPlanLineItemResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$planningCriteriaGroup = this.getPlanningCriteriaGroup();
        final Object other$planningCriteriaGroup = other.getPlanningCriteriaGroup();
        if (this$planningCriteriaGroup == null ? other$planningCriteriaGroup != null : !this$planningCriteriaGroup.equals(other$planningCriteriaGroup))
            return false;
        final Object this$products = this.getProducts();
        final Object other$products = other.getProducts();
        if (this$products == null ? other$products != null : !this$products.equals(other$products)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $planningCriteriaGroup = this.getPlanningCriteriaGroup();
        result = result * PRIME + ($planningCriteriaGroup == null ? 0 : $planningCriteriaGroup.hashCode());
        final Object $products = this.getProducts();
        result = result * PRIME + ($products == null ? 0 : $products.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MealPlanLineItemResource;
    }
}