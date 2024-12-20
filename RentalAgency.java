import java.util.*;

public class RentalAgency {
    private List<Vehicle> fleet;

    public RentalAgency() {
        fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public Vehicle findVehicleById(String vehicleId) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                return vehicle;
            }
        }
        return null;
    }

    public void processRental(String vehicleId, Customer customer, int days) {
        Vehicle vehicle = findVehicleById(vehicleId);
        if (vehicle != null && vehicle.isAvailableForRental()) {
            ((Rentable) vehicle).rent(customer, days);
        } else {
            System.out.println("Vehicle is unavailable.");
        }
    }
}
