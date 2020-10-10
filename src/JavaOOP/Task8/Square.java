package JavaOOP.Task8;

public class Square extends GraphicObject {

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
}