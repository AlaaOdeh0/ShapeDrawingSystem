package shapes;

public class Rectangle extends ClosedShape {
    private Point upperCorner;
    private int width;
    private int height;

    public Rectangle(Point upperCorner, int width, int height) {
        this.upperCorner = upperCorner;
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    
    public Point getupperCorner() {
        return upperCorner;
    }
    public static Rectangle createRectangle(Point upperCorner, int width, int height) {
        return new Rectangle(upperCorner, width, height);
    }

    @Override
    public float getArea() {
        return width * height;
    }

    @Override
    public float getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    // Implement Movable methods
    @Override
    public void moveUp(int n) {
        upperCorner.setY(upperCorner.getY() - n);
    }

    @Override
    public void moveDown(int n) {
        upperCorner.setY(upperCorner.getY() + n);
    }

    @Override
    public void moveLeft(int n) {
        upperCorner.setX(upperCorner.getX() - n);
    }

    @Override
    public void moveRight(int n) {
        upperCorner.setX(upperCorner.getX() + n);
    }

    @Override
    public void moveBy(int x, int y) {
        upperCorner.setX(upperCorner.getX() + x);
        upperCorner.setY(upperCorner.getY() + y);
    }

}
