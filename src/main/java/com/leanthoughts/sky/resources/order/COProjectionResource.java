package com.leanthoughts.sky.resources.order;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by fahad on 21-08-2016.
 */
public class COProjectionResource {

    private Set<BaseLineItemResource> lineItems = new HashSet<>(0);

    public COProjectionResource(){}

    public COProjectionResource(Set<BaseLineItemResource> lineItems) {
        this.lineItems = lineItems;
    }

    public Set<BaseLineItemResource> getLineItems() {
        return lineItems;
    }

    public void setLineItems(Set<BaseLineItemResource> lineItems) {
        this.lineItems = lineItems;
    }
}
