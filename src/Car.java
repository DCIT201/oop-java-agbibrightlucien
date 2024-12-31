public class Car extends Vehicle {
    public Car(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days; // Base rate * number of days
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}