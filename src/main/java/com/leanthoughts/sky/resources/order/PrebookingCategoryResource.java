package com.leanthoughts.sky.resources.order;

import com.leanthoughts.sky.resources.BaseResource;

public class PrebookingCategoryResource extends BaseResource{
    private String name;
    private String code;
    private int quantity;

    public PrebookingCategoryResource() {
    }

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PrebookingCategoryResource)) return false;
        final PrebookingCategoryResource other = (PrebookingCategoryResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.name;
        final Object other$name = other.name;
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$code = this.code;
        final Object other$code = other.code;
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) return false;
        if (this.quantity != other.quantity) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.name;
        result = result * PRIME + ($name == null ? 0 : $name.hashCode());
        final Object $code = this.code;
        result = result * PRIME + ($code == null ? 0 : $code.hashCode());
        result = result * PRIME + this.quantity;
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof PrebookingCategoryResource;
    }
}
