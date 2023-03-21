package bg.uni.fmi.lab02.collections;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static String retrieveElementByIndex(List<String> list, int index) {
        if (index >= list.size()) {
            throw new IllegalArgumentException("The index given is above the size of the list!");
        }

        return list.get(index);
    }

    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        System.out.println(retrieveElementByIndex(arrList, 2));
    }
}