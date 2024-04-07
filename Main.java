import geometry.*;

public class Main{
    public static void main(String[] args){
        Point center = new Point(0.0, 0.0);
        Circle circle = new Circle(center, 5.0);
        System.out.println("Circle center: " + circle.getCenter());
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());
        System.out.println("Circle area: " + circle.getArea());
    }
}