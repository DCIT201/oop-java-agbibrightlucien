public class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private int days;
    private double rentalCost;

    public RentalTransaction(Customer customer, Vehicle vehicle, int days) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
        this.rentalCost = vehicle.calculateRentalCost(days);
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }
}
