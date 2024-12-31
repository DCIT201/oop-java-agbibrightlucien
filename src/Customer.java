public class Customer {
    private String customerId;
    private String name;
    private double balance;
    private boolean rentalEligibility;

    public Customer(String customerId, String name, double balance) {
        this.customerId = customerId;
        this.name = name;
        this.balance = balance;
        this.rentalEligibility = balance > 0; // Eligibility based on balance
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
        this.rentalEligibility = balance > 0; // Update eligibility
    }

    public boolean isEligibleForRental() {
        return rentalEligibility;
    }
}
