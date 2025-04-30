package shapes;

public class Color {
    private int R, G, B;

    public Color(int r, int g, int b) {
        this.R = r;
        this.G = g;
        this.B = b;
    }

    public void setColor(int r, int g, int b) {
        this.R = r;
        this.G = g;
        this.B = b;
    }

    // Getters
    public int getR() { return R; }
    public int getG() { return G; }
    public int getB() { return B; }
}
