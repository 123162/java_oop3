package encaps;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {//constractor
        this.x = x;
        this.y = y;
    }
      public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distanceFromOrigin() {//orjine uzaklık x^2+y^2 nin kökü ile bulunuyor
        return Math.sqrt(x * x + y * y);
    }


    public void setLocation(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public void translate(int dx, int dy) {
        x =  dx;
        y =  dy;
    }

}
