package boats;

import interfaces.Floatable;

public abstract class Boat implements Floatable {

    private static int count;
    private String city;
    private int number;
    private String callSign;
    private double speed;

    public Boat(){

    }

    public Boat(String city,int number){
        this.city=city;
        this.number=number;
        this.callSign=city+number;
    }

    public void setCity(String city){
        this.city=city;
    }

    public String getCity(){
        return city;
    }

    public void setNumber(int number){
        this.number=number;
    }

    public int getNumber(){
        return number;
    }
    public int getCount(){
        return count;
    }

}
