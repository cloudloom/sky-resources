package com.leanthoughts.sky.resources.planning;

import com.leanthoughts.sky.resources.BaseResource;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 20-Jan-2016.
 */
public class MealPlanProductResource extends BaseResource {
    private String product;
    private Set<String> categories = new HashSet<String>(0);

    public MealPlanProductResource() {
    }

    public String getProduct() {
        return this.product;
    }

    public Set<String> getCategories() {
        return this.categories;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setCategories(Set<String> categories) {
        this.categories = categories;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MealPlanProductResource)) return false;
        final MealPlanProductResource other = (MealPlanProductResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$product = this.product;
        final Object other$product = other.product;
        if (this$product == null ? other$product != null : !this$product.equals(other$product)) return false;
        final Object this$categories = this.categories;
        final Object other$categories = other.categories;
        if (this$categories == null ? other$categories != null : !this$categories.equals(other$categories))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $product = this.product;
        result = result * PRIME + ($product == null ? 0 : $product.hashCode());
        final Object $categories = this.categories;
        result = result * PRIME + ($categories == null ? 0 : $categories.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MealPlanProductResource;
    }
}