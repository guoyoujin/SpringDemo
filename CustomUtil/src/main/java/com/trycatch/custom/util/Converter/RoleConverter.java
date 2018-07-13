package com.trycatch.custom.util.Converter;

import com.trycatch.custom.util.enums.Role;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class RoleConverter implements AttributeConverter<Role, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Role role) {
        return role.getValue();
    }

    @Override
    public Role convertToEntityAttribute(Integer integer) {
        return Role.fromString(integer);
    }

}
