package abstract_interface;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] array = new Shape[3];
        array[0] = new Circle(Math.random() * 10, "yellow", false);
        array[1] = new Rectangle(Math.random() * 10, Math.random() * 10);
        array[2] = new Square(Math.random() * 10);
        for (Shape element : array) {
            if (element instanceof Square) {
                System.out.println(element.getArea());
                ((Square) element).howToColor();
            } else {
                System.out.println(element.getArea());
            }
        }
    }
}
