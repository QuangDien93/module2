package Fan;

public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        speed = 1;
        on = false;
        radius = 5;
        color = "blue";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String convertSpeed(int a) {
        if (a == 1) {
            return "SLOW";
        } else {
            if (a == 2) {
                return "MEDIUM";
            } else {
                if (a == 3) {
                    return "FAST";
                } else {
                    return "UNDIFINED";
                }
            }
        }
    }

    @Override
    public String toString() {
        if (this.isOn()) {
            return "Fan:{" + "\n"
                    + " radius = " + radius + "\n"
                    + " speed = " + convertSpeed(this.speed) + "\n"
                    + " Color = " + color + "\n"
                    + "The Fan is ON";
        } else {
            return "Fan:{" + "\n"
                    + " radius = " + radius + "\n"
                    + " Color = " + color + "\n"
                    + "The Fan is OFF";
        }
    }
}
