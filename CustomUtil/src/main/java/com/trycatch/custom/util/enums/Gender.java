package com.trycatch.custom.util.enums;

import java.util.Objects;

public enum Gender {
    male(0),
    female(1);

    private Integer value;
    private Gender(Integer value){
        this.value = value;
    }

    public Integer getValue(){
        return this.value;
    }

    public static Gender fromInteger(Integer value){
        Objects.requireNonNull(value, "value can not be null");
        Gender gender = null;
        switch (value){
            case 0:
                gender = male;
                break;
            case 1:
                gender = female;
                break;
            default:
        }
        return gender;
    }
}
