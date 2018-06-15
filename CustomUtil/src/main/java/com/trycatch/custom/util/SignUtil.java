package com.trycatch.custom.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.TreeMap;

public class SignUtil {
    private static Logger logger = LoggerFactory.getLogger(SignUtil.class);

    public static String sign(final Map<String,Object> map,String timestamp,String appKey,String appToken){
        map.put("app_key",appKey);
        map.put("timestamp",timestamp);
        TreeMap<String,Object> treeMap = new TreeMap<String, Object>(map);
        StringBuilder sb = new StringBuilder();
        for (String key: treeMap.keySet()){
            logger.info("key:"+key+"=="+map.get(key));
            sb.append(key+map.get(key));
        }
        logger.info(appToken+sb.toString().toString()+appToken);
        String result = MD5EncodeUtil.encoding(appToken+sb.toString()+appToken,"UTF-8").toUpperCase();
        logger.info(result);
        return result;
    }
}