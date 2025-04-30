package shapes;

import java.util.ArrayList;

public class Polygon extends ClosedShape {
    protected ArrayList<Point> points = new ArrayList<>();

    public void addPoint(Point p) {
        points.add(p);
    }

    public Point getPoint(int index) {
        return points.get(index);
    }

    public boolean isRectangle() {
        return points.size() == 4;
    }

    public boolean isSquare() {
        return isRectangle(); // assume valid square if 4 points
    }

    public boolean isTriangle() {
        return points.size() == 3;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Polygon with " + points.size() + " points");
    }

    @Override
    public float getArea() {
         
        float area = 0;
        int n = points.size();
        for (int i = 0; i < n; i++) {
            Point p1 = points.get(i);
            Point p2 = points.get((i + 1) % n);
            area += (p1.getX() * p2.getY()) - (p2.getX() * p1.getY());
        }
        return Math.abs(area) / 2.0f;
    }

    @Override
    public float getPerimeter() {
        float perimeter = 0;
        int n = points.size();
        for (int i = 0; i < n; i++) {
            Point p1 = points.get(i);
            Point p2 = points.get((i + 1) % n);
            perimeter += Line.calculateLength(p1, p2);
        }
        return perimeter;
    }

    @Override
    public void moveUp(int n) {
        for (Point p : points) p.setY(p.getY() - n);
    }

    @Override
    public void moveDown(int n) {
        for (Point p : points) p.setY(p.getY() + n);
    }

    @Override
    public void moveLeft(int n) {
        for (Point p : points) p.setX(p.getX() - n);
    }

    @Override
    public void moveRight(int n) {
        for (Point p : points) p.setX(p.getX() + n);
    }

    @Override
    public void moveBy(int x, int y) {
        for (Point p : points) {
            p.setX(p.getX() + x);
            p.setY(p.getY() + y);
        }
    }
}
