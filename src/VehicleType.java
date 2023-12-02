public enum VehicleType {
    Sport,
    RACE("Race Motorcycle"),
    NOT_FOR_RACE("Not for race"),
    Family;

    private String type;

    VehicleType() {
    }

    VehicleType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type != null ? type : super.toString();
    }
}
