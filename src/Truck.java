public class Truck extends Vehicle {
    public Truck(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + 50; // Extra charge for trucks
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
