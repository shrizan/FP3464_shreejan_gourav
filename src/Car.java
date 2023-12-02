public class Car extends Vehicle {
    private Gear gear;
    private CarType type;

    public Car(String make, String plate, String color, VehicleType category, Gear gear, CarType type) {
        super(make, plate, color, category);
        this.gear = gear;
        this.type = type;
    }

    @Override
    public String getVehicleType() {
        return "has a car";
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\n\t- gear: %s\n\t- type: %s\n\t", gear, type.toString());
    }
}
