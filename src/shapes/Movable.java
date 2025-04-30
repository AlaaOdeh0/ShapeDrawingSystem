package shapes;

public interface Movable {
    void moveUp(int n);
    void moveDown(int n);
    void moveLeft(int n);
    void moveRight(int n);
    void moveBy(int x, int y);
}
