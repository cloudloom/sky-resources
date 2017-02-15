package com.leanthoughts.sky.resources.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.leanthoughts.sky.resources.dictionary.CountType;
import com.leanthoughts.sky.resources.planning.MealCategoryResource;
import com.leanthoughts.sky.resources.planning.PlanningCriteriaGroupResource;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 01-Jan-2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArticleResource extends ProductResource {
    private String sku;
    private String ean;
    private String code;
    private String longDescription;
    private Set<PriceResource> prices = new HashSet<PriceResource>(0);
    private String image;
    private Set<CategoryResource> categories = new HashSet<CategoryResource>(0);
    private Set<MealCategoryResource> mealCategories = new HashSet<MealCategoryResource>(0);
    private Set<PlanningCriteriaGroupResource> planningCriteriaGroups = new HashSet<PlanningCriteriaGroupResource>();
    private String unitOfMeasure;
    private String materialGroup;
    private String materialCategory;
    private String type;
    private Set<ProductBundleItemResource> items = new HashSet<>(0);
    private LocalDateTime created;

    public ArticleResource() {
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public Set<PriceResource> getPrices() {
        return prices;
    }

    public void setPrices(Set<PriceResource> prices) {
        this.prices = prices;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Set<CategoryResource> getCategories() {
        return categories;
    }

    public void setCategories(Set<CategoryResource> categories) {
        this.categories = categories;
    }

    public Set<MealCategoryResource> getMealCategories() {
        return mealCategories;
    }

    public void setMealCategories(Set<MealCategoryResource> mealCategories) {
        this.mealCategories = mealCategories;
    }

    public Set<PlanningCriteriaGroupResource> getPlanningCriteriaGroups() {
        return planningCriteriaGroups;
    }

    public void setPlanningCriteriaGroups(Set<PlanningCriteriaGroupResource> planningCriteriaGroups) {
        this.planningCriteriaGroups = planningCriteriaGroups;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getMaterialGroup() {
        return materialGroup;
    }

    public void setMaterialGroup(String materialGroup) {
        this.materialGroup = materialGroup;
    }

    public String getMaterialCategory() {
        return materialCategory;
    }

    public void setMaterialCategory(String materialCategory) {
        this.materialCategory = materialCategory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<ProductBundleItemResource> getItems() {
        return items;
    }

    public void setItems(Set<ProductBundleItemResource> items) {
        this.items = items;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ArticleResource that = (ArticleResource) o;

        return sku != null ? sku.equals(that.sku) : that.sku == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (sku != null ? sku.hashCode() : 0);
        return result;
    }
}