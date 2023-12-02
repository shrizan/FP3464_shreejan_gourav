public class Motorcycle extends Vehicle {
    private boolean sidecar;

    public Motorcycle(String make, String plate, String color, VehicleType category, boolean sidecar) {
        super(make, plate, color, category);
        this.sidecar = sidecar;
    }

    public boolean isSidecar() {
        return sidecar;
    }

    @Override
    public String toString() {
        return super.toString() + (sidecar?"\n\t- with sidecar" : "\n\t- without sidecar");
    }
}
