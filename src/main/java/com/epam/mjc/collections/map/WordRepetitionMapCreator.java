package com.epam.mjc.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String,Integer> map = new HashMap<>();
        String[] arr = sentence.toLowerCase(Locale.ROOT).split("[ .,]");
        for (String s: arr) {
            if(!s.equals("")) {
                if (!map.containsKey(s)) {
                    map.put(s, 1);
                } else {
                    map.get(s);
                    map.put(s, map.get(s) + 1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return map;
    }
}
