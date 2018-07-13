package com.trycatch.custom.util.Converter;

import com.trycatch.custom.util.enums.Gender;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class GenderConverter implements AttributeConverter<Gender, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Gender attribute) {
        return attribute.getValue();
    }

    @Override
    public Gender convertToEntityAttribute(Integer dbData) {
        return Gender.fromInteger(dbData);
    }
}
