package com.java.takeatenminutewalk;

import java.util.HashMap;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        HashMap<Character, Integer> map = new HashMap<>();
        boolean result = false;

        for(char ch: walk){
            map.putIfAbsent(ch, 0);
            map.put(ch, map.get(ch) + 1);
        }
        if (walk.length != 10 ) {
            result = false;
        }
        else {
            if (map.containsKey('n')) {
                if (map.get('n').equals(map.get('s')))
                    result = true;
                else
                    result = false;
            }
            if (map.containsKey('e')) {
                if (map.get('e').equals(map.get('w')))
                    result = true;
                else result = false;
            }
        }
        return result;
    }
}
