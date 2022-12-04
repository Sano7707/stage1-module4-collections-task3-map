package com.epam.mjc.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String,Integer> map = new HashMap<>();

        for (Map.Entry<Integer,String> e:sourceMap.entrySet()) {
            if(map.containsKey(e.getValue()) && e.getKey() < map.get(e.getValue())){
                map.put(e.getValue(), e.getKey());
            }
            else if(!map.containsKey(e.getValue())){
                map.put(e.getValue(), e.getKey());
            }

        }
        return map;
    }
}
