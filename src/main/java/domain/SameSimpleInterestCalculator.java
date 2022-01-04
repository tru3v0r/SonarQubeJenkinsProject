package domain;

public class SameSimpleInterestCalculator implements InterestCalculator {

    private double rate;

    @Override
    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double calculate(double amount, double year) {
        if (amount < 0 || year < 0) {
            throw new IllegalArgumentException("Amount and year must be positive");
        }
        return amount * year * rate;
    }

    @Override
    public double calculateWithError(double amount, double year) {
        return amount * year * rate / 0;
    }
}
