package com.leanthoughts.sky.resources;

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
    private Set<CategoryResource> categories = new HashSet<CategoryResource>(0);

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

    public Set<CategoryResource> getCategories() {
        return this.categories;
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

    public void setCategories(Set<CategoryResource> categories) {
        this.categories = categories;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ArticleResource)) return false;
        final ArticleResource other = (ArticleResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$sku = this.sku;
        final Object other$sku = other.sku;
        if (this$sku == null ? other$sku != null : !this$sku.equals(other$sku)) return false;
        final Object this$ean = this.ean;
        final Object other$ean = other.ean;
        if (this$ean == null ? other$ean != null : !this$ean.equals(other$ean)) return false;
        final Object this$longDescription = this.longDescription;
        final Object other$longDescription = other.longDescription;
        if (this$longDescription == null ? other$longDescription != null : !this$longDescription.equals(other$longDescription))
            return false;
        final Object this$price = this.price;
        final Object other$price = other.price;
        if (this$price == null ? other$price != null : !this$price.equals(other$price)) return false;
        final Object this$categories = this.categories;
        final Object other$categories = other.categories;
        if (this$categories == null ? other$categories != null : !this$categories.equals(other$categories))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $sku = this.sku;
        result = result * PRIME + ($sku == null ? 0 : $sku.hashCode());
        final Object $ean = this.ean;
        result = result * PRIME + ($ean == null ? 0 : $ean.hashCode());
        final Object $longDescription = this.longDescription;
        result = result * PRIME + ($longDescription == null ? 0 : $longDescription.hashCode());
        final Object $price = this.price;
        result = result * PRIME + ($price == null ? 0 : $price.hashCode());
        final Object $categories = this.categories;
        result = result * PRIME + ($categories == null ? 0 : $categories.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ArticleResource;
    }

    public String toString() {
        return "com.leanthoughts.sky.resources.ArticleResource(sku=" + this.sku + ", ean=" + this.ean + ", longDescription=" + this.longDescription + ", price=" + this.price + ", categories=" + this.categories + ")";
    }
}