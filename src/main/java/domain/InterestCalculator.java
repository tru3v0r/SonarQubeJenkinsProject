package domain;

public interface InterestCalculator {
    public void setRate(double rate);
    public double calculate(double amount, double year);
    double calculateWithError(double amount, double year);
}
