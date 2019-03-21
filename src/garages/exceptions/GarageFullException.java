package garages.exceptions;

public class GarageFullException extends Exception {

    private static final long serialVersionUID = 0000000000001L;

    public GarageFullException(String message) {
        super(message);
    }
}
