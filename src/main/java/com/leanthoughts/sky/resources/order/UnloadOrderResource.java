package com.leanthoughts.sky.resources.order;

import java.util.HashSet;
import java.util.Set;

/**
 * @author fahad
 * @since 26-07-2016.
 */
public class UnloadOrderResource extends BaseOrderResource {

    private UnloadOrderStatus status;
    private Set<BaseLineItemResource> perishableWastage = new HashSet<BaseLineItemResource>();

    public UnloadOrderStatus getStatus() {
        return status;
    }

    public void setStatus(UnloadOrderStatus status) {
        this.status = status;
    }

    public Set<BaseLineItemResource> getPerishableWastage() {
        return perishableWastage;
    }

    public void setPerishableWastage(Set<BaseLineItemResource> perishableWastage) {
        this.perishableWastage = perishableWastage;
    }

    UnloadOrderResource(){}

    public UnloadOrderResource(UnloadOrderStatus status, Set<BaseLineItemResource> perishableWastage) {
        this.status = status;
        this.perishableWastage = perishableWastage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        UnloadOrderResource that = (UnloadOrderResource) o;

        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        return perishableWastage != null ? perishableWastage.equals(that.perishableWastage) : that.perishableWastage == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (perishableWastage != null ? perishableWastage.hashCode() : 0);
        return result;
    }
}
