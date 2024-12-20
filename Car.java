public class Car extends Vehicle {
    private boolean hasAirConditioning;

    public Car(String vehicleId, String model, double baseRentalRate, boolean isAvailable, boolean hasAirConditioning) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.hasAirConditioning = hasAirConditioning;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (hasAirConditioning) {
            cost += 10 * days; // Extra charge for AC
        }
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
