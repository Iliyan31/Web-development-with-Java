package bg.uni.fmi.lab02.collections;

import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static int getMapSize(Map<Integer, String> map) {
        return map.size();
    }

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "h1");
        map.put(2, "h2");
        map.put(3, "h3");

        System.out.println(getMapSize(map));
    }
}