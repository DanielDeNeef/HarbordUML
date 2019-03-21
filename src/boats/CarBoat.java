package boats;

import garages.Car;

public class CarBoat extends Boat {

    private static int count;
    private int maxVehicle;
    private int maxLoad;
    private Car[] cars;

    public CarBoat() {
        this(0,0);
    }

    public CarBoat(int maxW,int maxL){
        this.maxVehicle=maxW;
        this.maxLoad=maxL;
        this.cars=new Car[maxW];
        count++;
    }

    public int getMaxVehicle(){
        return maxVehicle;
    }

    public void setMaxVehicle(int mawV){
        this.maxVehicle=mawV;
    }

    public int getMaxLoad(){
        return maxLoad;
    }

    public void setMaxLoad(int maxL){
        this.maxLoad=maxL;
    }

    @Override
    public void floats() {

    }

    @Override
    public void dock() {

    }

    @Override
    public void accelerate(double value) {
        super.setSpeed(super.getSpeed()+value);
    }

    @Override
    public void slowDown(double value) {
        super.setSpeed(super.getSpeed()-value);

    }

    @Override
    public double getSpeed() {
        return super.getSpeed();
    }

    public void addCarstoBoat(Car car){
        if (countfreeplace()>0){
            cars[countfreeplace()]=car;
        }
    }

    public int countfreeplace(){
        int counter=0;
        for (Car x : cars){
            if (x.equals(null)){
                return counter;
            }
        }
        return counter;
    }

    public void removecar(int index){
        if (index<cars.length&&index>=0) {
            cars[index] = null;
        }
    }

    public void printCars(){
        for (Car x : cars){
            System.out.println("|"+x+"| ");
        }
    }
}
