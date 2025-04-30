package shapes;

public class Ellipse extends ClosedShape {
    private Point focus1;
    private Point focus2;
    private int major;
    private int minor;

    public Ellipse(Point focus1, Point focus2, int major, int minor) {
        this.focus1 = focus1;
        this.focus2 = focus2;
        this.major = major;
        this.minor = minor;
    }

    public static Ellipse createEllipse(Point focus1, Point focus2, int major, int minor) {
        return new Ellipse(focus1, focus2, major, minor);
    }

    public Point getFocus1() {
        return focus1;
    }

    public Point getFocus2() {
        return focus2;
    }

    public int getMajor() {
        return major;
    }

    public int getMinor() {
        return minor;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * major * minor);
    }

    @Override
    public float getPerimeter() {
         
        double a = major;
        double b = minor;
        double h = Math.pow((a - b), 2) / Math.pow((a + b), 2);
        return (float) (Math.PI * (a + b) * (1 + (3 * h) / (10 + Math.sqrt(4 - 3 * h))));
    }

    @Override
    public void draw() {
        System.out.println("Drawing an Ellipse");
    }

    @Override
    public void moveUp(int n) {
        focus1.setY(focus1.getY() - n);
        focus2.setY(focus2.getY() - n);
    }

    @Override
    public void moveDown(int n) {
        focus1.setY(focus1.getY() + n);
        focus2.setY(focus2.getY() + n);
    }

    @Override
    public void moveLeft(int n) {
        focus1.setX(focus1.getX() - n);
        focus2.setX(focus2.getX() - n);
    }

    @Override
    public void moveRight(int n) {
        focus1.setX(focus1.getX() + n);
        focus2.setX(focus2.getX() + n);
    }

    @Override
    public void moveBy(int x, int y) {
        focus1.setX(focus1.getX() + x);
        focus1.setY(focus1.getY() + y);
        focus2.setX(focus2.getX() + x);
        focus2.setY(focus2.getY() + y);
    }
}
