package bg.uni.fmi.lab01.tasks.task7;

public class Circle implements GeometricObject {
    private static final double PI = Math.PI;
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.pow(radius, 2) * PI);
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }
}