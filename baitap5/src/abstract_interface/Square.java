package abstract_interface;

public class Square extends Shape implements Colorable{
    private double angle = 1.0;

    public Square(){};
    public Square(double angle) {
        this.angle = angle;
    }

    public Square(String color, boolean filled, double angle) {
        super(color, filled);
        this.angle = angle;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    @Override
    public double getArea() {
        return this.angle*this.angle;
    }

    @Override
    public String toString() {
        return "A Square with angle=" + angle
                + ", which is a subclass of "
                + super.toString();

    }

    @Override
    public void resize(double percent) {
        setAngle(this.angle*(percent+100)/100);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
