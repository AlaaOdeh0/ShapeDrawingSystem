package shapes;

public class Square extends Rectangle {

    public Square(Point upperCorner, int side) {
        super(upperCorner, side, side); 
    }

    public static Square createSquare(Point upperCorner, int side) {
        return new Square(upperCorner, side);
    }

    public int getSide() {
        return super.getWidth(); 
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}
