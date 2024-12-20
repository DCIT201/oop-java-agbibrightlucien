import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {
    @Test
    public void testCalculateRentalCost() {
        Vehicle car = new Car("C1", "Toyota", 50, true, true);
        assertEquals(110, car.calculateRentalCost(2));
    }
}
