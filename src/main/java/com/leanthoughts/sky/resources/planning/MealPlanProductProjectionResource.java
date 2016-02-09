package com.leanthoughts.sky.resources.planning;

import com.leanthoughts.sky.resources.BaseResource;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sadath on 27-Jan-2016.
 */
public class MealPlanProductProjectionResource extends BaseResource {
    private String product;
    private Map<String, Double> quantity = new HashMap<String, Double>(0);

    public MealPlanProductProjectionResource() {
    }

    public String getProduct() {
        return this.product;
    }

    public Map<String, Double> getQuantity() {
        return this.quantity;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setQuantity(Map<String, Double> quantity) {
        this.quantity = quantity;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MealPlanProductProjectionResource)) return false;
        final MealPlanProductProjectionResource other = (MealPlanProductProjectionResource) o;
        if (!other.canEqual((Object) this)) return false;
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
        final Object $product = this.product;
        result = result * PRIME + ($product == null ? 0 : $product.hashCode());
        final Object $quantity = this.quantity;
        result = result * PRIME + ($quantity == null ? 0 : $quantity.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MealPlanProductProjectionResource;
    }
}