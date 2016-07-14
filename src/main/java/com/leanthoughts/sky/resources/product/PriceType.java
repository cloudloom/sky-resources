package com.leanthoughts.sky.resources.product;

public class PriceType {
    private String name;
    private String abbreviation;

    public PriceType(String name, String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

    public PriceType() {}

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