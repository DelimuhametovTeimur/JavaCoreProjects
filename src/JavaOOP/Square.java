package JavaOOP;

import java.util.Scanner;

public class Square {

    private double sideLength;

    public Square(double sideLength) {
        if(sideLength <= 0.0){
            this.sideLength = 0.1;
        }
        else {
            this.sideLength = sideLength;
        }
    }

    public double area() {
        return sideLength * sideLength;
    }

    public double perimeter() {
        return 4.0 * sideLength;
    }

    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input square side length: ");
        double sideLength = input.nextDouble();

        Square square1 = new Square(sideLength);

        System.out.printf("\nsquare1 perimeter is: %.2f \n", square1.perimeter());
        System.out.printf("square1 area is: %.2f", square1.area());
    }
}
