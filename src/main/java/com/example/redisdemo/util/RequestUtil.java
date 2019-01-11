package com.example.redisdemo.util;

import java.util.Map;

public class RequestUtil {
    public static Map<String,Object> paramMap(Map<String,Object> map,Map<String,String[]> target){
        for(Map.Entry<String,String[]> entry:target.entrySet()){
            map.put(entry.getKey(),entry.getValue());
        }
        return map;
    }
}
