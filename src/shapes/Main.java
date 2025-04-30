package shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = Rectangle.createRectangle(new Point(0, 0), 10, 20);
        Square square = Square.createSquare(new Point(5, 5), 15);
        Circle circle = Circle.createCircle(new Point(0, 0), 10);
        Ellipse ellipse = Ellipse.createEllipse(new Point(0, 0), new Point(5, 5), 10, 5);
        Triangle triangle = Triangle.createTriangle(new Point(0, 0), new Point(5, 0), new Point(0, 5));

        rect.draw(); System.out.println("Rect Area: " + rect.getArea());
        square.draw(); System.out.println("Square Area: " + square.getArea());
        circle.draw(); System.out.println("Circle Area: " + circle.getArea());
        ellipse.draw(); System.out.println("Ellipse Area: " + ellipse.getArea());
        triangle.draw(); System.out.println("Triangle Area: " + triangle.getArea());
    }
}
