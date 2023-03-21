package bg.uni.fmi.lab02.collections;

import bg.uni.fmi.lab02.collections.Animals.Dog;
import bg.uni.fmi.lab02.collections.Animals.DogComparator;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static List<Dog> sortDogList(List<Dog> dogs) {
        //dogs.sort(Dog::compareTo);
        dogs.sort(new DogComparator());
        return dogs;
    }

    public static void main(String[] args) {
        List<Dog> arrList = new ArrayList<>();
        arrList.add(new Dog("Bug1", 15));
        arrList.add(new Dog("Bug2", 12));
        arrList.add(new Dog("Bug3", 17));
        arrList.add(new Dog("Bug4", 14));
        System.out.println(sortDogList(arrList));
    }
}