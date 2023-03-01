package model;

public class House extends Facility{
    private String standardRoom;
    private int numOfFloor;

    public House(String standardRoom, int numOfFloor) {
        super();
        this.standardRoom = standardRoom;
        this.numOfFloor = numOfFloor;
    }
}
