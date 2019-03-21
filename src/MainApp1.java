import enums.Colors;
import garages.FamilyCar;
import garages.Garage;
import garages.SportCar;
import garages.exceptions.GarageFullException;
import garages.exceptions.VehicleAlreadyInGarageException;

public class MainApp1 {
    public static void main(String[] args) throws VehicleAlreadyInGarageException, GarageFullException {

        FamilyCar citroenC8 = new FamilyCar(Colors.RED);
        FamilyCar citroenC9 = new FamilyCar(Colors.GREEN);
        SportCar ferrari = new SportCar(Colors.BLACK);

        Garage bob = new Garage();
            bob.addVehicle(citroenC8);
            bob.addVehicle(citroenC9);

        //bob.printGarage();


    }
}
