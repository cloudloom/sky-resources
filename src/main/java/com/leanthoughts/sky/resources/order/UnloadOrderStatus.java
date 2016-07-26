package com.leanthoughts.sky.resources.order;

/**
 * @author fahad
 * @since 01-06-2016.
 */
public class UnloadOrderStatus {

    private String name;
    private String abbreviation;

    public UnloadOrderStatus() {}

    public UnloadOrderStatus(String name, String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
