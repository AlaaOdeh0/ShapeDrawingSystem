package shapes;

public abstract class Shape implements Movable {
    protected Color color;

    public abstract void draw();
    public abstract float getArea();
}
