package model;

public class Villa  extends Facility{
    private String standardRoom;
    private double poolArea;
    private int numOfFloor;

    public Villa(String standardRoom, double poolArea, int numOfFloor) {
        super();
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.numOfFloor = numOfFloor;
    }
}
