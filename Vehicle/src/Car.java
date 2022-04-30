public class Car extends Vehicle{
    private int gears;
    private String wheels;
    private int numberOfDoors;
    private boolean isManual;

    private int currentGear;

    public Car(double weight, String colour, double speed, int gears, String wheels, int numberOfDoors, boolean isManual) {
        super(weight, colour, speed);
        this.gears = gears;
        this.wheels = wheels;
        this.numberOfDoors = numberOfDoors;
        this.isManual = isManual;
        this.currentGear = 1;
    }

}
