
import domain.InterestCalculator;
import domain.SimpleInterestCalculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleInterestCalculatorJUnit4Tests {
    private InterestCalculator interestCalculator;

    @Before
    public void init() {
        interestCalculator = new SimpleInterestCalculator();
        interestCalculator.setRate(.05);
    }

    @Test
    public void testCalculate() {
        double interest = interestCalculator.calculate(10000, 2);
        Assert.assertEquals(interest, 1000.0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalCalculate() {
        interestCalculator.calculate(-1000, 2);
    }

    @Test
    public void testCrashCalculate() {
        double result = interestCalculator.calculate(0,2);
        Assert.assertEquals(result,1000.0, 0);
    }
}
