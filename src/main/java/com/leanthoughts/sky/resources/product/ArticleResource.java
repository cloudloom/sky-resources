package com.leanthoughts.sky.resources.product;

import com.leanthoughts.sky.resources.planning.MealCategoryResource;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 01-Jan-2016.
 */
public class ArticleResource extends ProductResource {
    private String sku;
    private String ean;
    private String longDescription;
    private PriceResource price;
    private String image;
    private String id;
    private Set<CategoryResource> categories = new HashSet<CategoryResource>(0);
    private Set<MealCategoryResource> mealCategories = new HashSet<MealCategoryResource>(0);

    public ArticleResource() {
    }

    public String getSku() {
        return this.sku;
    }

    public String getEan() {
        return this.ean;
    }

    public String getLongDescription() {
        return this.longDescription;
    }

    public PriceResource getPrice() {
        return this.price;
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

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public void setPrice(PriceResource price) {
        this.price = price;
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ArticleResource)) return false;
        final ArticleResource other = (ArticleResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$sku = this.getSku();
        final Object other$sku = other.getSku();
        if (this$sku == null ? other$sku != null : !this$sku.equals(other$sku)) return false;
        final Object this$ean = this.getEan();
        final Object other$ean = other.getEan();
        if (this$ean == null ? other$ean != null : !this$ean.equals(other$ean)) return false;
        final Object this$longDescription = this.getLongDescription();
        final Object other$longDescription = other.getLongDescription();
        if (this$longDescription == null ? other$longDescription != null : !this$longDescription.equals(other$longDescription))
            return false;
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        if (this$price == null ? other$price != null : !this$price.equals(other$price)) return false;
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
        final Object $sku = this.getSku();
        result = result * PRIME + ($sku == null ? 0 : $sku.hashCode());
        final Object $ean = this.getEan();
        result = result * PRIME + ($ean == null ? 0 : $ean.hashCode());
        final Object $longDescription = this.getLongDescription();
        result = result * PRIME + ($longDescription == null ? 0 : $longDescription.hashCode());
        final Object $price = this.getPrice();
        result = result * PRIME + ($price == null ? 0 : $price.hashCode());
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