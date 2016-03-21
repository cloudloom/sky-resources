package com.leanthoughts.sky.resources.planning;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.leanthoughts.sky.resources.BaseResource;
import com.leanthoughts.sky.resources.product.ArticleResource;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Created by sadath on 04-Jan-2016.
 */
public class MealCategoryResource extends BaseResource {
    private String serialNumber;
    private String code;
    private String description;
    private boolean enabled;
    @JsonBackReference
    private MealCategoryResource parent;
    @JsonManagedReference
    private Set<MealCategoryResource> children = new HashSet<MealCategoryResource>(0);
    private Map<String, Boolean> products = new HashMap<String, Boolean>(0);
    private Map<String, ArticleResource> productsMetaData = new HashMap<String, ArticleResource>();

    public Stream<MealCategoryResource> flattened() {
        return Stream.concat(Stream.of(this),
                children.stream().flatMap(MealCategoryResource::flattened));
    }

    public MealCategoryResource() {
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public MealCategoryResource getParent() {
        return this.parent;
    }

    public Set<MealCategoryResource> getChildren() {
        return this.children;
    }

    public Map<String, ArticleResource> getProductsMetaData() {
        return this.productsMetaData;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setParent(MealCategoryResource parent) {
        this.parent = parent;
    }

    public void setChildren(Set<MealCategoryResource> children) {
        this.children = children;
    }

    public void setProductsMetaData(Map<String, ArticleResource> productsMetaData) {
        this.productsMetaData = productsMetaData;
    }

    public Map<String, Boolean> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Boolean> products) {
        this.products = products;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MealCategoryResource)) return false;
        final MealCategoryResource other = (MealCategoryResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$serialNumber = this.serialNumber;
        final Object other$serialNumber = other.serialNumber;
        if (this$serialNumber == null ? other$serialNumber != null : !this$serialNumber.equals(other$serialNumber))
            return false;
        final Object this$code = this.code;
        final Object other$code = other.code;
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) return false;
        final Object this$description = this.description;
        final Object other$description = other.description;
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        if (this.enabled != other.enabled) return false;

        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $serialNumber = this.serialNumber;
        result = result * PRIME + ($serialNumber == null ? 0 : $serialNumber.hashCode());
        final Object $code = this.code;
        result = result * PRIME + ($code == null ? 0 : $code.hashCode());
        final Object $description = this.description;
        result = result * PRIME + ($description == null ? 0 : $description.hashCode());
        result = result * PRIME + (this.enabled ? 79 : 97);

        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MealCategoryResource;
    }
}