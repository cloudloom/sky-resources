package com.leanthoughts.sky.resources.planning;

import com.leanthoughts.sky.resources.BaseResource;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 27-Jan-2016.
 */
public class MealPlanProductProjectionResource extends BaseResource {
    private String product;
    private Set<MealPlanProductBOBResource> bob = new HashSet<MealPlanProductBOBResource>();

    public MealPlanProductProjectionResource() {
    }

    public String getProduct() {
        return this.product;
    }

    public Set<MealPlanProductBOBResource> getBob() {
        return this.bob;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setBob(Set<MealPlanProductBOBResource> bob) {
        this.bob = bob;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MealPlanProductProjectionResource)) return false;
        final MealPlanProductProjectionResource other = (MealPlanProductProjectionResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$product = this.product;
        final Object other$product = other.product;
        if (this$product == null ? other$product != null : !this$product.equals(other$product)) return false;
        final Object this$bob = this.bob;
        final Object other$bob = other.bob;
        if (this$bob == null ? other$bob != null : !this$bob.equals(other$bob)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $product = this.product;
        result = result * PRIME + ($product == null ? 0 : $product.hashCode());
        final Object $bob = this.bob;
        result = result * PRIME + ($bob == null ? 0 : $bob.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MealPlanProductProjectionResource;
    }
}