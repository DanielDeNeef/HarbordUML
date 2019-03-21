package garages;

import enums.Colors;
import interfaces.MoveAble;
import interfaces.Paintable;

import java.util.UUID;

public abstract class Car implements Paintable, MoveAble {
    private final int NUMBER_OF_WHEELS=4;
    private Colors colors;
    private static int count;
    private int chassisID;
    private double speed;
    private int weight;
    private String parkingspot;

    //Constructor
    public Car() {
        this(null);
    }
    public Car(Colors colors) {
        this.colors = colors;
        this.chassisID= UUID.randomUUID().hashCode();
        count++;
    }

    //Setters & Getters
    public Colors getColors() {
        return colors;
    }
    public void setColors(Colors colors) {
        this.colors = colors;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public String getParkingspot() {
        return parkingspot;
    }
    public void setParkingspot(String parkingspot) {
        this.parkingspot = parkingspot;
    }
    public static int getCount() {
        return count;
    }
    public int getChassisID() {
        return chassisID;
    }

    @Override
    public String toString() {
        return getColors().toString();
    }
}
