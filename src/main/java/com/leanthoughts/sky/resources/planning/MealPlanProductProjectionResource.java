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
}