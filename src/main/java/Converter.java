//import main.java.RewardValue;

public class Converter {

    // Convert cash value to miles using RewardValue
    public static double convertCashToMiles(double cashValue) {
        RewardValue rewardValue = new RewardValue(cashValue);
        return rewardValue.getMilesValue();
    }

    // Convert miles value to cash using RewardValue
    public static double convertMilesToCash(double milesValue) {
        double cashValue = milesValue / 0.0035;
        return cashValue;
    }

    public static void main(String[] args) {
        double cashValue = 100.0;
        double milesValue = convertCashToMiles(cashValue);
        System.out.println("Miles value for $" + cashValue + ": " + milesValue);

        double newCashValue = convertMilesToCash(milesValue);
        System.out.println("Cash value for " + milesValue + " miles: $" + newCashValue);
    }
}
