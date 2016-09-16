package com.leanthoughts.sky.resources.planning;

import com.leanthoughts.sky.resources.BaseResource;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by fahad on 16-09-2016.
 */
public class GLPResource extends BaseResource {

    private String type;
    private Set<GLPLineItemResource> lineItems = new HashSet<>(0);

    public GLPResource(){}

    public GLPResource(String type, Set<GLPLineItemResource> lineItems) {
        this.type = type;
        this.lineItems = lineItems;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<GLPLineItemResource> getLineItems() {
        return lineItems;
    }

    public void setLineItems(Set<GLPLineItemResource> lineItems) {
        this.lineItems = lineItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        GLPResource that = (GLPResource) o;

        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        return lineItems != null ? lineItems.equals(that.lineItems) : that.lineItems == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (lineItems != null ? lineItems.hashCode() : 0);
        return result;
    }
}
