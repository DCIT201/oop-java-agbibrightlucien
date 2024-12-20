public interface LoyaltyProgram {
    void addPoints(int points);

    int getPoints();
}

public class Customer implements LoyaltyProgram {
    private int loyaltyPoints;

    @Override
    public void addPoints(int points) {
        loyaltyPoints += points;
    }

    @Override
    public int getPoints() {
        return loyaltyPoints;
    }
}
