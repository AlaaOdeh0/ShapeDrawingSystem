package shapes;

public class Circle extends ClosedShape {
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public static Circle createCircle(Point center, int radius) {
        return new Circle(center, radius);
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public void moveUp(int n) { center.setY(center.getY() - n); }

    @Override
    public void moveDown(int n) { center.setY(center.getY() + n); }

    @Override
    public void moveLeft(int n) { center.setX(center.getX() - n); }

    @Override
    public void moveRight(int n) { center.setX(center.getX() + n); }

    @Override
    public void moveBy(int x, int y) {
        center.setX(center.getX() + x);
        center.setY(center.getY() + y);
    }
}
