package shapes;

public class Triangle extends ClosedShape {
    private Point p1, p2, p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public static Triangle createTriangle(Point p1, Point p2, Point p3) {
        return new Triangle(p1, p2, p3);
    }

    public void updatePoints(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public boolean isRightTriangle() {
        float a = Line.calculateLength(p1, p2);
        float b = Line.calculateLength(p2, p3);
        float c = Line.calculateLength(p3, p1);
        float[] sides = {a, b, c};
        java.util.Arrays.sort(sides);
        return Math.abs(sides[2]*sides[2] - (sides[0]*sides[0] + sides[1]*sides[1])) < 0.01;
    }

    @Override
    public float getArea() {
        
        float a = Line.calculateLength(p1, p2);
        float b = Line.calculateLength(p2, p3);
        float c = Line.calculateLength(p3, p1);
        float s = (a + b + c) / 2;
        return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public float getPerimeter() {
        return Line.calculateLength(p1, p2) + Line.calculateLength(p2, p3) + Line.calculateLength(p3, p1);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    public void moveUp(int n) {
        p1.setY(p1.getY() - n);
        p2.setY(p2.getY() - n);
        p3.setY(p3.getY() - n);
    }

    @Override
    public void moveDown(int n) {
        p1.setY(p1.getY() + n);
        p2.setY(p2.getY() + n);
        p3.setY(p3.getY() + n);
    }

    @Override
    public void moveLeft(int n) {
        p1.setX(p1.getX() - n);
        p2.setX(p2.getX() - n);
        p3.setX(p3.getX() - n);
    }

    @Override
    public void moveRight(int n) {
        p1.setX(p1.getX() + n);
        p2.setX(p2.getX() + n);
        p3.setX(p3.getX() + n);
    }

    @Override
    public void moveBy(int x, int y) {
        p1.setX(p1.getX() + x); p1.setY(p1.getY() + y);
        p2.setX(p2.getX() + x); p2.setY(p2.getY() + y);
        p3.setX(p3.getX() + x); p3.setY(p3.getY() + y);
    }
}
