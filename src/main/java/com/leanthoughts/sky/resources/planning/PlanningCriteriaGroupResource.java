package com.leanthoughts.sky.resources.planning;

/**
 * Created by fahad on 15-12-2015.
 */

import com.leanthoughts.sky.resources.BaseResource;
import com.leanthoughts.sky.resources.dictionary.CountType;
import com.leanthoughts.sky.resources.product.ArticleResource;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Planning Criteria Group :
 *      Non-perishable Food
 *      Perishable Food
 *      Crew Food
 *      Dry Store ( Other Consumables )
 */
public class PlanningCriteriaGroupResource extends BaseResource {
    private String name;
    private CountType countType;
    private Set<String> products = new HashSet<String>();
    private Map<String, ArticleResource> productsMetaData = new HashMap<String, ArticleResource>();
    private Set<MealCategoryResource> mealCategories = new HashSet<MealCategoryResource>(0);

    public PlanningCriteriaGroupResource() {
    }

    public String getName() {
        return this.name;
    }

    public CountType getCountType() {
        return this.countType;
    }

    public Set<String> getProducts() {
        return this.products;
    }

    public Map<String, ArticleResource> getProductsMetaData() {
        return this.productsMetaData;
    }

    public Set<MealCategoryResource> getMealCategories() {
        return this.mealCategories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountType(CountType countType) {
        this.countType = countType;
    }

    public void setProducts(Set<String> products) {
        this.products = products;
    }

    public void setProductsMetaData(Map<String, ArticleResource> productsMetaData) {
        this.productsMetaData = productsMetaData;
    }

    public void setMealCategories(Set<MealCategoryResource> mealCategories) {
        this.mealCategories = mealCategories;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PlanningCriteriaGroupResource)) return false;
        final PlanningCriteriaGroupResource other = (PlanningCriteriaGroupResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.name;
        final Object other$name = other.name;
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$countType = this.countType;
        final Object other$countType = other.countType;
        if (this$countType == null ? other$countType != null : !this$countType.equals(other$countType)) return false;
        final Object this$products = this.products;
        final Object other$products = other.products;
        if (this$products == null ? other$products != null : !this$products.equals(other$products)) return false;
        final Object this$productsMetaData = this.productsMetaData;
        final Object other$productsMetaData = other.productsMetaData;
        if (this$productsMetaData == null ? other$productsMetaData != null : !this$productsMetaData.equals(other$productsMetaData))
            return false;
        final Object this$mealCategories = this.mealCategories;
        final Object other$mealCategories = other.mealCategories;
        if (this$mealCategories == null ? other$mealCategories != null : !this$mealCategories.equals(other$mealCategories))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.name;
        result = result * PRIME + ($name == null ? 0 : $name.hashCode());
        final Object $countType = this.countType;
        result = result * PRIME + ($countType == null ? 0 : $countType.hashCode());
        final Object $products = this.products;
        result = result * PRIME + ($products == null ? 0 : $products.hashCode());
        final Object $productsMetaData = this.productsMetaData;
        result = result * PRIME + ($productsMetaData == null ? 0 : $productsMetaData.hashCode());
        final Object $mealCategories = this.mealCategories;
        result = result * PRIME + ($mealCategories == null ? 0 : $mealCategories.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof PlanningCriteriaGroupResource;
    }
}