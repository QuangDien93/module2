package abstract_interface;

public class TestResize {
    public static void main(String[] args) {
        Shape[] array = new Shape[3];
        array[0] = new Circle(Math.random()*10, "yellow",false);
        array[1] = new Rectangle(Math.random()*10,Math.random()*10);
        array[2] = new Square(Math.random()*10);
        for(Shape element:array){
            System.out.println(element.getArea());
            element.resize(50);
            System.out.println(element.getArea());
        }
    }
}
