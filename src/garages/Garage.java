package garages;

import garages.exceptions.GarageFullException;
import garages.exceptions.VehicleAlreadyInGarageException;
import interfaces.MoveAble;

public class Garage {

    private final int MAX = 30;
    private MoveAble [] vehicles;
    private int counter;

    public Garage() {
        vehicles = new MoveAble[MAX];
    }

    public void addVehicle(MoveAble vehicle) throws VehicleAlreadyInGarageException,GarageFullException {
        if (!isVehiclePresent(vehicle)){
            if (counter==MAX){
                throw new GarageFullException("geen plaats meer in de garage");
            }else {
                this.vehicles[nextFreePosiiton()] = vehicle;
                counter++;
            }
        }
    }

    private boolean isVehiclePresent(MoveAble vehicle)throws VehicleAlreadyInGarageException,NullPointerException{
        boolean test=false;
            for (MoveAble x : vehicles) {
                try {
                    if (x.equals(vehicle)) {
                        test = true;
                        throw new VehicleAlreadyInGarageException("wagen staat al in de garage");
                    }
                }catch (NullPointerException npe){

                }
            }

        return false;
    }

    private int nextFreePosiiton(){
        int index = -1;
        for (int x =0;x<vehicles.length;x++){
            try {
                if (vehicles[x].equals(null)) {
                }
            }catch (NullPointerException npe){
                return x;
            }
        }
        return index;
    }

    public void removeVehicle(MoveAble vehicle){
        for (MoveAble x : vehicles){
            if (x.equals(vehicle)){
                x=null;
                counter--;
            }
        }
    }

    public MoveAble getVehicleAtindex(int index) throws VehicleAlreadyInGarageException {
        if (isVehiclePresent(vehicles[index])){
            return vehicles[index];
        }else {
            System.out.println("wagen niet gevonden");
            return null;
        }
    }

    public void clear(){
        for (MoveAble x : vehicles){
            x=null;
        }
    }

    public void printGarage(){
        for (MoveAble x : vehicles){
           try {
               if (x.equals(null)) {
               } else {
                   System.out.print("|" + x + "| ");
               }
           }catch (NullPointerException npe){
               System.out.print("|    | ");
           }
        }
        System.out.println();
    }

}
