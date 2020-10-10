package JavaOOP;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Circle {

    private double radius;

    public Circle(double radius) {
        if(radius <= 0.0){
            this.radius = 0.1;
        }
        else {
            this.radius = radius;
        }
    }

    public double area() {
        return Math.PI * pow(radius, 2);
    }

    public double perimeter() {
        return 2.0 * radius * Math.PI;
    }

    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input circle radius: ");
        double radius = input.nextDouble();

        Circle circle1 = new Circle(radius);

        System.out.printf("\ncircle1 perimeter is: %.2f \n", circle1.perimeter());
        System.out.printf("circle1 area is: %.2f", circle1.area());
    }
}