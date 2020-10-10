package JavaOOP.Task8;

import java.util.Scanner;

public abstract class GraphicObject {

    public abstract double area();

    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input square side length: ");
        double sideLength = input.nextInt();

        System.out.print("Input circle radius: ");
        double radius = input.nextDouble();

        Square square1 = new Square(sideLength);
        Circle circle1 = new Circle(radius);

        System.out.printf("\nsquare1 area is: %.2f", square1.area());
        System.out.printf("\ncircle1 area is: %.2f", circle1.area());
    }
}
