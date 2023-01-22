package pl.sda.excercises.points;

public class Main {

    public static void main(String[] args) {

        Point2D point2D_0 = new Point2D();
        Point2D point2D_1 = new Point2D(1, 1);

        Point3D point3D_0 = new Point3D();
        Point3D point3D_1 = new Point3D(1, 2, 3);

        System.out.println("Punk 2D_0");
        System.out.println(point2D_0.getX());
        System.out.println(point2D_0.getY());

        System.out.println("Punk 2D_1");
        System.out.println(point2D_1.getX());
        System.out.println(point2D_1.getY());

        System.out.println("Punk 3D_0");
        System.out.println(point3D_0.getX());
        System.out.println(point3D_0.getY());
        System.out.println(point3D_0.getZ());

        System.out.println("Punk 3D_1");
        System.out.println(point3D_1.getX());
        System.out.println(point3D_1.getY());
        System.out.println(point3D_1.getZ());

        double result = Point2D.calculateDistance(point2D_0, point2D_1);
        System.out.println(result);
    }
}
