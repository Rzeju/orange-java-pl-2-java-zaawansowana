package pl.sda.excercises.points;

public class Point2D {

    private final int x;
    private final int y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static double calculateDistance(Point2D p1, Point2D p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) +  Math.pow(p1.getY() - p2.getY(), 2));
    }
}
