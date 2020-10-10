package JavaOOP;

public class UsePoint {

    public static void main (String [] args) {

        Point point1 = new Point();

        point1.setX(1);
        point1.setY(-5);
        point1.setZ(12);

        System.out.println("Point1 properties: ");
        System.out.println("X = " + point1.getX());
        System.out.println("Y = " + point1.getY());
        System.out.println("Z = " + point1.getZ());

        //Task5
        Point point2 = new Point(4,5, -2);

        System.out.println("\nPoint2 properties: ");
        System.out.println("X = " + point2.getX());
        System.out.println("Y = " + point2.getY());
        System.out.println("Z = " + point2.getZ());

        Point point3 = new Point(-8,5);

        System.out.println("\nPoint3 properties: ");
        System.out.println("X = " + point3.getX());
        System.out.println("Y = " + point3.getY());
        System.out.println("Z = " + point3.getZ());
    }
}