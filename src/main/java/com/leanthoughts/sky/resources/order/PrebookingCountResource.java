package com.leanthoughts.sky.resources.order;

import com.leanthoughts.sky.resources.BaseResource;

public class PrebookingCountResource extends BaseResource{
    private String code;
    private String description;
    private int quantity;

    public PrebookingCountResource() {
    }

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PrebookingCountResource)) return false;
        final PrebookingCountResource other = (PrebookingCountResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$code = this.code;
        final Object other$code = other.code;
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) return false;
        final Object this$description = this.description;
        final Object other$description = other.description;
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        if (this.quantity != other.quantity) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $code = this.code;
        result = result * PRIME + ($code == null ? 0 : $code.hashCode());
        final Object $description = this.description;
        result = result * PRIME + ($description == null ? 0 : $description.hashCode());
        result = result * PRIME + this.quantity;
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof PrebookingCountResource;
    }
}
