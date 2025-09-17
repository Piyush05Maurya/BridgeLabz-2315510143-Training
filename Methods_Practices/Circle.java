package oops;

public class Circle {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public void areaCircle() {
        System.out.printf("Area of circle: %.4f", (Math.PI * radius * radius));
    }

    // Method to calculate circumference
    public void circumferenceCircle() {
        System.out.printf("\nCircumference of circle: %.4f ", (2 * Math.PI * radius));
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        circle.areaCircle();
        circle.circumferenceCircle();
    }
}

