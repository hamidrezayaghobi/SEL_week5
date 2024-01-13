package calculator;

import calculator.Calculator;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private int result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("Two input values, {int} and {int}")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }


    @When("I add the two values")
    public void iAddTheTwoValues() {
        result = calculator.add(value1, value2);
        System.out.print(result);
    }

    @Then("I expect the result {int}")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }

    @Then("I expect the result")
    public void iExpectTheResult() {
    }

    @When("I calculate the square root of a divided by b")
    public void iCalculateTheSquareRootOfDividedBy() {
        try {
            result = calculator.calculateResult(value1, value2);
            System.out.print(result);
        } catch (ArithmeticException e) {
            System.out.println("Akhh Akhh Error");
            result = -1;
        }
    }

    @Then("I expect the return {int}")
    public void iExpectTheReturn(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}