package shapes;

public class Line extends Shape {
    private Point begin;
    private Point end;

    public Line(Point b, Point e) {
        this.begin = b;
        this.end = e;
    }

    public float getLength() {
        int dx = end.getX() - begin.getX();
        int dy = end.getY() - begin.getY();
        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    public static float calculateLength(Point p1, Point p2) {
        int dx = p2.getX() - p1.getX();
        int dy = p2.getY() - p1.getY();
        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Line");
    }

    @Override
    public float getArea() {
        return 0; // Line has no area
    }

    @Override
    public void moveUp(int n) { begin.setY(begin.getY() - n); end.setY(end.getY() - n); }

    @Override
    public void moveDown(int n) { begin.setY(begin.getY() + n); end.setY(end.getY() + n); }

    @Override
    public void moveLeft(int n) { begin.setX(begin.getX() - n); end.setX(end.getX() - n); }

    @Override
    public void moveRight(int n) { begin.setX(begin.getX() + n); end.setX(end.getX() + n); }

    @Override
    public void moveBy(int x, int y) {
        begin.setX(begin.getX() + x);
        begin.setY(begin.getY() + y);
        end.setX(end.getX() + x);
        end.setY(end.getY() + y);
    }
}
