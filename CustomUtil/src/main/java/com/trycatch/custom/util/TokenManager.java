package com.trycatch.custom.util;

import java.util.UUID;

/**
 *
 */
public class TokenManager {
    public static String createAccessToken(){
        String uuid = UUID.randomUUID().toString();
        return uuid.replace("-","").toLowerCase();
    }
}
