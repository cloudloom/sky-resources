package com.leanthoughts.sky.resources;

/**
 * Created by sadath on 01-Jan-2016.
 */
public class CategoryResource extends BaseResource{
    private String name;
    private String description;
    private CategoryResource parent;
    private SellerResource seller;

    public CategoryResource() {
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public CategoryResource getParent() {
        return this.parent;
    }

    public SellerResource getSeller() {
        return this.seller;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setParent(CategoryResource parent) {
        this.parent = parent;
    }

    public void setSeller(SellerResource seller) {
        this.seller = seller;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof CategoryResource)) return false;
        final CategoryResource other = (CategoryResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.name;
        final Object other$name = other.name;
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$description = this.description;
        final Object other$description = other.description;
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$parent = this.parent;
        final Object other$parent = other.parent;
        if (this$parent == null ? other$parent != null : !this$parent.equals(other$parent)) return false;
        final Object this$seller = this.seller;
        final Object other$seller = other.seller;
        if (this$seller == null ? other$seller != null : !this$seller.equals(other$seller)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.name;
        result = result * PRIME + ($name == null ? 0 : $name.hashCode());
        final Object $description = this.description;
        result = result * PRIME + ($description == null ? 0 : $description.hashCode());
        final Object $parent = this.parent;
        result = result * PRIME + ($parent == null ? 0 : $parent.hashCode());
        final Object $seller = this.seller;
        result = result * PRIME + ($seller == null ? 0 : $seller.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof CategoryResource;
    }

    public String toString() {
        return "com.leanthoughts.sky.resources.CategoryResource(name=" + this.name + ", description=" + this.description + ", parent=" + this.parent + ", seller=" + this.seller + ")";
    }
}