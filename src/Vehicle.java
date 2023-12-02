public abstract class Vehicle {
    private String make;
    private String plate;
    private String color;
    private VehicleType category;

    abstract public String getVehicleType();

    public Vehicle(String make, String plate, String color, VehicleType category) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("\n\t- make: %s\n\t- plate: %s\n\t- color:%s\n\t- category:%s", make, plate, color, category.toString());
    }
}
