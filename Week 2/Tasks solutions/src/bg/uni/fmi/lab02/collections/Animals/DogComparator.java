package bg.uni.fmi.lab02.collections.Animals;

import java.util.Comparator;

public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog dog1, Dog dog2) {
        return Integer.compare(dog1.weight(), dog2.weight());
    }
}
