public interface Rentable {
    void rent(Customer customer, int days);

    void returnVehicle();
}

public class Motorcycle extends Vehicle implements Rentable {
    // Implementation of methods
    @Override
    public void rent(Customer customer, int days) {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("Motorcycle rented to " + customer.getName());
        } else {
            System.out.println("Motorcycle is unavailable.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Motorcycle returned.");
    }
}
