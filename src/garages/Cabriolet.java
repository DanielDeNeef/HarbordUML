package garages;

import enums.Colors;

public class Cabriolet extends SportCar {

    private static int count;
    private boolean openRoof;

    public Cabriolet() {
        this(null);
    }

    public Cabriolet(Colors colors){
        super(colors);
        count++;
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
        super.accelerate(value);
    }

    public boolean isRoofOpen(){
        return openRoof;
    }

    public void setOpenRoof(boolean openRoof){
        this.openRoof=openRoof;
    }
}
