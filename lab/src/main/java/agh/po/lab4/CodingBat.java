package agh.po.lab4;

import java.util.Map;
import java.util.HashMap;

    public class CodingBat {
        public Map<String, String> mapAB(Map<String, String> map) {
            if (map.containsKey("a") && map.containsKey("b")) {
                String combinedValue = map.get("a") + map.get("b");
                map.put("ab", combinedValue);
            }
            return map;
        }

        public Map<String, Integer> wordLen(String[] strings) {
            Map<String, Integer> map = new HashMap<>();
            for (String s : strings) {
                map.put(s, s.length());
            }
            return map;
        }


        public static void main(String[] args) {
            CodingBat cb = new CodingBat();

            System.out.println("mapAB");
            Map<String, String> testMap = new HashMap<>();
            testMap.put("a", "Hi");
            testMap.put("b", "There");
            System.out.println(cb.mapAB(testMap));

            System.out.println("wordLen");
            System.out.println(cb.wordLen(new String[]{"kom", "kom", "bob", "bob"}));
        }
    }
