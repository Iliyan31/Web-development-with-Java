package bg.uni.fmi.lab01.tasks.task7;

public class Rectangle implements GeometricObject {
    private final int length;

    private final int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double getArea() {
        return length * breadth;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + breadth);
    }
}
