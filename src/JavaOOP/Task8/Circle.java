package JavaOOP.Task8;

import static java.lang.Math.pow;

public class Circle extends GraphicObject {

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
}