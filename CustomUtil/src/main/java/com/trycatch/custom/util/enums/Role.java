package com.trycatch.custom.util.enums;

import java.util.Objects;

public enum Role {
    user(0),
    service(1),
    finance(2),
    admin(3),
    trial_doc(4),
    review_doc(5);
    private Integer value;

    private Role(Integer value){
        this.value = value;
    }

    public Integer getValue(){
        return this.value;
    }

    public static Role fromString(Integer value){
        Objects.requireNonNull(value, "value can not be null");
        Role role = null;
        switch (value){
            case 0:
                role = user;
                break;
            case 1:
                role = service;
                break;
            case 2:
                role = finance;
                break;
            case 3:
                role = admin;
                break;
            case 4:
                role = trial_doc;
                break;
            case 5:
                role = review_doc;
                break;
            default:
                role = user;
        }
        return role;
    }
}
