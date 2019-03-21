package garages;

import enums.Colors;

public class SportCar extends Car {

    private final int NUMBER_OF_SEATS=4;
    private static int count;

    public SportCar() {
        this(null);
    }

    public SportCar(Colors colors) {
        super(colors);
        count++;
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
        super.setSpeed(getSpeed()+speed);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void accelerate(double value) {
        setSpeed(value);
    }

    @Override
    public void slowDown(double value) {
        setSpeed(-value);
    }

    @Override
    public void rePaint(Colors colors) {
        setColors(colors);
    }
}
