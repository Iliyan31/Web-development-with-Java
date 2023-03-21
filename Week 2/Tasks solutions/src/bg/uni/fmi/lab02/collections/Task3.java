package bg.uni.fmi.lab02.collections;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static int containsElement(List<String> list, String element) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("The list is empty!");
        }

        return list.indexOf(element);
    }


    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        System.out.println(containsElement(arrList, "Hi"));
    }
}