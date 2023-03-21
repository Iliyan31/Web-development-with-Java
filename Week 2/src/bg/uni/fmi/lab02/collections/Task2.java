package bg.uni.fmi.lab02.collections;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    private static final int INDEX = 3;

    public static void removeThirdElement(List<String> list) {
        if (INDEX >= list.size()) {
            throw new IllegalArgumentException("The index given is above the size of the list!");
        }

        list.remove(INDEX);
    }


    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        removeThirdElement(arrList);
    }
}