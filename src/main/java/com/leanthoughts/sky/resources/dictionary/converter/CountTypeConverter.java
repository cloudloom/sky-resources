package com.leanthoughts.sky.resources.dictionary.converter;


import com.leanthoughts.sky.resources.dictionary.CountType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Created by sadath on 17-Feb-2016.
 */
@Converter(autoApply = true)
public class CountTypeConverter implements AttributeConverter<CountType, String> {
    @Override
    public String convertToDatabaseColumn(CountType countType) {
        switch (countType) {
            case PERCENTAGE:
                return "PERCENTAGE";
            case NUMBERS:
                return "NUMBERS";
            default:
                throw new IllegalArgumentException("Unknown value: " + countType);
        }
    }

    @Override
    public CountType convertToEntityAttribute(String s) {
        switch (s) {
            case "PERCENTAGE":
                return CountType.PERCENTAGE;
            case "NUMBERS":
                return CountType.NUMBERS;
            default:
                throw new IllegalArgumentException("Unknown value: " + s);
        }
    }
}