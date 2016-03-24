package com.leanthoughts.sky.resources.order;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 24-Mar-2016.
 */
public abstract class CateringBaseOrderResource extends BaseOrderResource {
    private Set<CateringBaseLineItemResource> cateringLineItems = new HashSet<CateringBaseLineItemResource>();

    public CateringBaseOrderResource() {
    }

    public Set<CateringBaseLineItemResource> getCateringLineItems() {
        return this.cateringLineItems;
    }

    public void setCateringLineItems(Set<CateringBaseLineItemResource> cateringLineItems) {
        this.cateringLineItems = cateringLineItems;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof CateringBaseOrderResource)) return false;
        final CateringBaseOrderResource other = (CateringBaseOrderResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$cateringLineItems = this.cateringLineItems;
        final Object other$cateringLineItems = other.cateringLineItems;
        if (this$cateringLineItems == null ? other$cateringLineItems != null : !this$cateringLineItems.equals(other$cateringLineItems))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $cateringLineItems = this.cateringLineItems;
        result = result * PRIME + ($cateringLineItems == null ? 0 : $cateringLineItems.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof CateringBaseOrderResource;
    }
}