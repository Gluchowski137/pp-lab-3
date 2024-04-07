import geometry.*;

public class Main{
    public static void main(String[] args) {
        Square square = new Square(4.0);
        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Square perimeter: " + square.calculatePerimeter());
    }
}