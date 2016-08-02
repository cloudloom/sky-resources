package com.leanthoughts.sky.resources.product;

import com.leanthoughts.sky.resources.dictionary.CountType;
import com.leanthoughts.sky.resources.planning.MealCategoryResource;
import com.leanthoughts.sky.resources.planning.PlanningCriteriaGroupResource;

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
    private String id;
    private Set<CategoryResource> categories = new HashSet<CategoryResource>(0);
    private Set<MealCategoryResource> mealCategories = new HashSet<MealCategoryResource>(0);
    private Set<PlanningCriteriaGroupResource> planningCriteriaGroups = new HashSet<PlanningCriteriaGroupResource>();
    private String unitOfMeasure;
    private String materialGroup;
    private String materialCategory;
    private Set<ProductBundleItemResource> items = new HashSet<>(0);

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

    public String getId() {
        return this.id;
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

    public void setId(String id) {
        this.id = id;
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ArticleResource)) return false;
        final ArticleResource other = (ArticleResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$code = this.getCode();
        final Object other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) return false;
        final Object this$longDescription = this.getLongDescription();
        final Object other$longDescription = other.getLongDescription();
        if (this$longDescription == null ? other$longDescription != null : !this$longDescription.equals(other$longDescription))
            return false;
        final Object this$image = this.getImage();
        final Object other$image = other.getImage();
        if (this$image == null ? other$image != null : !this$image.equals(other$image)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $code = this.getCode();
        result = result * PRIME + ($code == null ? 0 : $code.hashCode());
        final Object $longDescription = this.getLongDescription();
        result = result * PRIME + ($longDescription == null ? 0 : $longDescription.hashCode());
        final Object $image = this.getImage();
        result = result * PRIME + ($image == null ? 0 : $image.hashCode());
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 0 : $id.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ArticleResource;
    }
}