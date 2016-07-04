package com.leanthoughts.sky.resources.order;

/**
 * @author fahad
 * @since 04-07-2016.
 */
public class GrnStatusResource {

    private String name;
    private String abbreviation;

    public GrnStatusResource(String name, String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

    public GrnStatusResource(){}

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
