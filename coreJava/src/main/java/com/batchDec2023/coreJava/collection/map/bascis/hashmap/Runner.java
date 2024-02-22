package com.batchDec2023.coreJava.collection.map.bascis.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Runner {

    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("Key", "value");
        map.put(null, 1);  // null allowed
        map.put(1, true);  // heterogenous data allowed
        map.put("Key", "value"); // duplicate not allowed for keys
        map.put(10.f,"value");
        map.put("Key", "new_value"); // if key exist : update else insert an entry




        System.out.println(map);

    }
}
