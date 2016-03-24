package com.leanthoughts.sky.resources.order;

/**
 * Created by sadath on 24-Mar-2016.
 */
public class CateringBaseLineItemResource extends BaseLineItemResource {
    private String categoryReference;
    private String groupReference;

    public CateringBaseLineItemResource() {
    }

    public String getCategoryReference() {
        return this.categoryReference;
    }

    public String getGroupReference() {
        return this.groupReference;
    }

    public void setCategoryReference(String categoryReference) {
        this.categoryReference = categoryReference;
    }

    public void setGroupReference(String groupReference) {
        this.groupReference = groupReference;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof CateringBaseLineItemResource)) return false;
        final CateringBaseLineItemResource other = (CateringBaseLineItemResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$categoryReference = this.categoryReference;
        final Object other$categoryReference = other.categoryReference;
        if (this$categoryReference == null ? other$categoryReference != null : !this$categoryReference.equals(other$categoryReference))
            return false;
        final Object this$groupReference = this.groupReference;
        final Object other$groupReference = other.groupReference;
        if (this$groupReference == null ? other$groupReference != null : !this$groupReference.equals(other$groupReference))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $categoryReference = this.categoryReference;
        result = result * PRIME + ($categoryReference == null ? 0 : $categoryReference.hashCode());
        final Object $groupReference = this.groupReference;
        result = result * PRIME + ($groupReference == null ? 0 : $groupReference.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof CateringBaseLineItemResource;
    }
}