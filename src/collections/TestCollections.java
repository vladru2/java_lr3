package collections;

import java.util.*;

public class TestCollections {
    public static Map<String, Integer> testMap = new HashMap<>();
    public static Set<String> testSet = new HashSet<>();
    public static List<Integer> testList = new ArrayList<>();

    public static void main(String[] args) {
        testMap.put("test1", 1);
        testMap.put("test2", 2);
        testMap.put("test3", 3);
        if (testMap.containsKey("test1")) {
            System.out.println(testMap.get("test1"));
        } else {
            System.out.println("map not contains test1");
        }
        testMap.remove("test1");
        if (testMap.containsKey("test1")) {
            System.out.println(testMap.get("test1"));
        } else {
            System.out.println("map not contains test1");
        }

        testMap.forEach((s, integer) -> System.out.println("key:" + s + " " + "value:" + integer));

        testSet.add("test1");
        testSet.add("test2");
        testSet.add("test3");

        if (testSet.contains("test1")) {
            System.out.println("set contains test1");
            testList.add(3);
            testList.add(2);
            testList.add(1);
        }

        if (!testList.isEmpty()) {
            if (testList.get(2) == 1) {
                System.out.println(testList.get(0));
            }
        }
    }
}
