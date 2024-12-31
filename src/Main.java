public class Main {
    public static void main(String[] args) {
        // Creating Vehicles
        Vehicle car = new Car("V001", "Sedan", 50);
        Vehicle motorcycle = new Motorcycle("V002", "Yamaha", 30);
        Vehicle truck = new Truck("V003", "Freightliner", 100);

        // Creating Customer
        Customer customer = new Customer("C001", "John Doe", 200);

        // Creating Rental Agency
        RentalAgency agency = new RentalAgency();
        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        // Renting Vehicles
        agency.rentVehicle(customer, car, 3); // Rent car for 3 days
        agency.rentVehicle(customer, truck, 2); // Rent truck for 2 days

        // Returning Vehicles
        agency.returnVehicle(car);
    }
}
