package com.leanthoughts.sky.resources.order;

/**
 * @author fahad
 * @since 01-06-2016.
 */
public class PurchaseOrderStatus {

    private String name;
    private String abbrieviation;

    public PurchaseOrderStatus() {}

    public PurchaseOrderStatus(String name, String abbrieviation) {
        this.name = name;
        this.abbrieviation = abbrieviation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbrieviation() {
        return abbrieviation;
    }

    public void setAbbrieviation(String abbrieviation) {
        this.abbrieviation = abbrieviation;
    }
}
