package com.leanthoughts.sky.resources.dictionary;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author ffazil
 * @since 17/05/15
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum CountType {
    PERCENTAGE("Percentage", "PERCENTAGE"),
    NUMBERS("Numbers", "NUMBERS");

    private final String countType;
    private final String abbreviation;

    CountType(String countType, String abbreviation){
        this.countType = countType;
        this.abbreviation = abbreviation;
    }

    public String getCountType() {
        return countType;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}