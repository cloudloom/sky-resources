package com.leanthoughts.sky.resources.product;

import com.leanthoughts.sky.resources.dictionary.CountType;
import com.leanthoughts.sky.resources.planning.MealCategoryResource;
import com.leanthoughts.sky.resources.planning.PlanningCriteriaGroupResource;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 01-Jan-2016.
 */
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

    /** Customized Properties For App**/
    private double bobQuantity;
    private CountType bobQuantityType;
    private double preBookingQuantity;
    private double totalQuantity;

    public ArticleResource() {
    }

    public String getSku() {
        return this.sku;
    }

    public String getEan() {
        return this.ean;
    }

    public String getCode() {
        return this.code;
    }

    public String getLongDescription() {
        return this.longDescription;
    }

    public String getImage() {
        return this.image;
    }

    public Set<CategoryResource> getCategories() {
        return this.categories;
    }

    public Set<MealCategoryResource> getMealCategories() {
        return this.mealCategories;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCategories(Set<CategoryResource> categories) {
        this.categories = categories;
    }

    public void setMealCategories(Set<MealCategoryResource> mealCategories) {
        this.mealCategories = mealCategories;
    }

    public double getBobQuantity() {
        return bobQuantity;
    }

    public void setBobQuantity(double bobQuantity) {
        this.bobQuantity = bobQuantity;
    }

    public CountType getBobQuantityType() {
        return bobQuantityType;
    }

    public void setBobQuantityType(CountType bobQuantityType) {
        this.bobQuantityType = bobQuantityType;
    }

    public double getPreBookingQuantity() {
        return preBookingQuantity;
    }

    public void setPreBookingQuantity(double preBookingQuantity) {
        this.preBookingQuantity = preBookingQuantity;
    }

    public double getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(double totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public Set<PriceResource> getPrices() {
        return prices;
    }

    public void setPrices(Set<PriceResource> prices) {
        this.prices = prices;
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

    public Set<ProductBundleItemResource> getItems() {
        return items;
    }

    public void setItems(Set<ProductBundleItemResource> items) {
        this.items = items;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

        if (Double.compare(that.bobQuantity, bobQuantity) != 0) return false;
        if (Double.compare(that.preBookingQuantity, preBookingQuantity) != 0) return false;
        if (Double.compare(that.totalQuantity, totalQuantity) != 0) return false;
        if (sku != null ? !sku.equals(that.sku) : that.sku != null) return false;
        if (ean != null ? !ean.equals(that.ean) : that.ean != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (longDescription != null ? !longDescription.equals(that.longDescription) : that.longDescription != null)
            return false;
        if (prices != null ? !prices.equals(that.prices) : that.prices != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (categories != null ? !categories.equals(that.categories) : that.categories != null) return false;
        if (mealCategories != null ? !mealCategories.equals(that.mealCategories) : that.mealCategories != null)
            return false;
        if (planningCriteriaGroups != null ? !planningCriteriaGroups.equals(that.planningCriteriaGroups) : that.planningCriteriaGroups != null)
            return false;
        if (unitOfMeasure != null ? !unitOfMeasure.equals(that.unitOfMeasure) : that.unitOfMeasure != null)
            return false;
        if (materialGroup != null ? !materialGroup.equals(that.materialGroup) : that.materialGroup != null)
            return false;
        if (materialCategory != null ? !materialCategory.equals(that.materialCategory) : that.materialCategory != null)
            return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (items != null ? !items.equals(that.items) : that.items != null) return false;
        return bobQuantityType == that.bobQuantityType;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (sku != null ? sku.hashCode() : 0);
        result = 31 * result + (ean != null ? ean.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (longDescription != null ? longDescription.hashCode() : 0);
        result = 31 * result + (prices != null ? prices.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (categories != null ? categories.hashCode() : 0);
        result = 31 * result + (mealCategories != null ? mealCategories.hashCode() : 0);
        result = 31 * result + (planningCriteriaGroups != null ? planningCriteriaGroups.hashCode() : 0);
        result = 31 * result + (unitOfMeasure != null ? unitOfMeasure.hashCode() : 0);
        result = 31 * result + (materialGroup != null ? materialGroup.hashCode() : 0);
        result = 31 * result + (materialCategory != null ? materialCategory.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (items != null ? items.hashCode() : 0);
        temp = Double.doubleToLongBits(bobQuantity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (bobQuantityType != null ? bobQuantityType.hashCode() : 0);
        temp = Double.doubleToLongBits(preBookingQuantity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(totalQuantity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ArticleResource;
    }
}