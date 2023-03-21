package bg.uni.fmi.lab02.collections;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    private static final int INDEX = 1;

    public static void removeThirdElement(List<String> list, String elem) {
        if (INDEX >= list.size()) {
            throw new IllegalArgumentException("The index given is above the size of the list!");
        }

        list.set(INDEX, elem);
    }


    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        arrList.add("h1");
        arrList.add("h2");
        arrList.add("h3");
        arrList.add("h4");
        removeThirdElement(arrList, "Hi");
        System.out.println(arrList);
    }
}