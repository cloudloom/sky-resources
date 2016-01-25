package com.leanthoughts.sky.resources;

/**
 * Created by sadath on 25-Jan-2016.
 */
public class MealPlanProjectionItemResource extends BaseResource {
    private MealPlanLineItemResource mealPlanLineItem;
    private String product;
    private Double quantity;

    public MealPlanProjectionItemResource() {
    }

    public MealPlanLineItemResource getMealPlanLineItem() {
        return this.mealPlanLineItem;
    }

    public String getProduct() {
        return this.product;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public void setMealPlanLineItem(MealPlanLineItemResource mealPlanLineItem) {
        this.mealPlanLineItem = mealPlanLineItem;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MealPlanProjectionItemResource)) return false;
        final MealPlanProjectionItemResource other = (MealPlanProjectionItemResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$mealPlanLineItem = this.mealPlanLineItem;
        final Object other$mealPlanLineItem = other.mealPlanLineItem;
        if (this$mealPlanLineItem == null ? other$mealPlanLineItem != null : !this$mealPlanLineItem.equals(other$mealPlanLineItem))
            return false;
        final Object this$product = this.product;
        final Object other$product = other.product;
        if (this$product == null ? other$product != null : !this$product.equals(other$product)) return false;
        final Object this$quantity = this.quantity;
        final Object other$quantity = other.quantity;
        if (this$quantity == null ? other$quantity != null : !this$quantity.equals(other$quantity)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $mealPlanLineItem = this.mealPlanLineItem;
        result = result * PRIME + ($mealPlanLineItem == null ? 0 : $mealPlanLineItem.hashCode());
        final Object $product = this.product;
        result = result * PRIME + ($product == null ? 0 : $product.hashCode());
        final Object $quantity = this.quantity;
        result = result * PRIME + ($quantity == null ? 0 : $quantity.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MealPlanProjectionItemResource;
    }
}