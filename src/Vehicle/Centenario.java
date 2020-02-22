package Vehicle;

public class Centenario extends Car {

    private int roadService;

    public Centenario(int wheels, int doors, int gears, boolean isManual, int roadService) {
        super("Centenario", "1", wheels, doors, gears, isManual);
        this.roadService = roadService;
    }


}
