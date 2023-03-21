package bg.uni.fmi.lab02.collections;

import java.util.ArrayList;
import java.util.List;

public class Task0 {
    public static void insertFirst(List<String> arr, String item) {
        arr.add(0, item);
    }

    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        insertFirst(arrList, "Hi");

        System.out.println(arrList);
    }
}