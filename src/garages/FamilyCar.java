package garages;

import enums.Colors;

public class FamilyCar extends Car {

    private final int NUMBER_OF_SEATS=8;
    private static int count;

    //Constructor
    public FamilyCar() {
        this(null);
    }
    public FamilyCar(Colors colors) {
        super(colors);
        count++;
    }

    //Setters & Getters
    public static int getCount() {
        return count;
    }
    @Override
    public Colors getColors() {
        return super.getColors();
    }
    @Override
    public void setColors(Colors colors) {
        super.setColors(colors);
    }
    @Override
    public double getSpeed() {
        return super.getSpeed();
    }
    @Override
    public void setSpeed(double speed) {
        super.setSpeed(speed);
    }
    @Override
    public void accelerate(double value) {
    }
    @Override
    public void slowDown(double value) {
    }
    @Override
    public void rePaint(Colors colors) {
    }
}
