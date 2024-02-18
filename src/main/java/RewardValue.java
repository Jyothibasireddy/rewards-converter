//import java.io.FileWriter;
//import java.io.IOException;
public class RewardValue {

    private double cashValue;
    private double milesValue;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * 0.0035; // Convert cash value to miles
    }

    // Constructor accepting miles value
    public RewardValue(double cashValue, double milesValue) {
        this.cashValue = cashValue;
        this.milesValue = milesValue;
    }

    // Getter method for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter method for miles value
    public double getMilesValue() {
        return milesValue;
    }

}
