package bg.uni.fmi.lab02.collections.Animals;

public record Dog(String breed, int weight) implements Comparable<Dog> {
    @Override
    public int compareTo(Dog o) {
        return Integer.compare(this.weight, o.weight);
    }
}
