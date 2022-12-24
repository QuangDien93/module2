package circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);
        Cylinder cylinder1 = new Cylinder(2, "yellow", 5);
        System.out.println(circle2.getArea());
        System.out.println(circle1.getRadius());
        System.out.println(cylinder1.toString());
        System.out.println(cylinder1.getCapacity());
    }
}
