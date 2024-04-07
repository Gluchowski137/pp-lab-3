import geometry.*;

public class Main{
    public static void main(String[] args){
        ColoredCircle coloredCircle = new ColoredCircle(new Point(1.0, 1.0), 10.0, "red");
        System.out.println("ColoredCircle center: " + coloredCircle.getCenter());
        System.out.println("ColoredCircle radius: " + coloredCircle.getRadius());
        System.out.println("ColoredCircle area: " + coloredCircle.getArea());
        System.out.println("ColoredCircle color: " + coloredCircle.getColor());
    }
}