import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;
    private List<RentalTransaction> transactions;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void rentVehicle(Customer customer, Vehicle vehicle, int days) {
        if (customer.isEligibleForRental() && vehicle.isAvailableForRental()) {
            vehicle.setAvailable(false);
            RentalTransaction transaction = new RentalTransaction(customer, vehicle, days);
            transactions.add(transaction);
            System.out.println("Vehicle rented: " + vehicle.getModel());
        } else {
            System.out.println("Cannot rent vehicle.");
        }
    }

    public void returnVehicle(Vehicle vehicle) {
        vehicle.setAvailable(true);
        System.out.println("Vehicle returned: " + vehicle.getModel());
    }

    public List<Vehicle> getFleet() {
        return fleet;
    }
}
