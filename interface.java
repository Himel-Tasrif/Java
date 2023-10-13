abstract class Shape {
    public abstract double calculateArea();
}

interface Drawable {
    void draw();
}

class Circle extends Shape implements Drawable {
    private double r;

    public Circle(double r) {
        this.r = r;
    }
    public double calculateArea() {
        return 3.1416 * r * r;
    }
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class interface1 {
    public static void main(String[] args) {
        Circle obj1 = new Circle(5.0);
        System.out.println("Area of the circle: " + obj1.calculateArea());
        obj1.draw();
    }
}
