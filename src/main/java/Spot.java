public class Spot {
    public String getX() {
        return x;
    }
    public void setX(String x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    String x;
    int y;

    public Spot(String x, int y) {
        if (x.compareTo("h") > 0 || (y > 8 || y < 1)){
            throw new IllegalArgumentException("Incorrect spot error");
        }
        this.x = x;
        this.y = y;

    }

    @Override
    public String toString() {
        return "Spot{" +
                "x='" + x + '\'' +
                ", y=" + y +
                '}';
    }
}
