package me.wydryszek.gl.tests;

import me.wydryszek.gl.tests.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {

    @Test
    public void should_add_two_numbers() {

        //given
        Calculator calculator = new Calculator();

        //when
        int result1 = calculator.add(5, 10);
        int result2 = calculator.add(6, -4);
        int result3 = calculator.add(-8, -2);

        //then
        Assert.assertEquals(15, result1);
        Assert.assertEquals(2, result2);
        Assert.assertEquals(-10, result3);
    }

    @Test
    public void should_not_add_two_numbers() {

        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(5, 4);

        //then
        Assert.assertNotEquals(10, result);
    }

    @Test
    public void should_subtract_two_numbers() {

        //given
        Calculator calculator = new Calculator();

        //when
        int result1 = calculator.subtract(6, 2);
        int result2 = calculator.subtract(-5, 7);
        int result3 = calculator.subtract(-1, -10);

        //then
        Assert.assertEquals(4, result1);
        Assert.assertEquals(-12, result2);
        Assert.assertEquals(9, result3);
    }

    @Test
    public void should_not_subtract_two_numbers() {

        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.subtract(12, 3);

        //then
        Assert.assertNotEquals(10, result);
    }

    @Test
    public void should_multiply_two_numbers() {

        //given
        Calculator calculator = new Calculator();

        //when
        int result1 = calculator.multiply(3, 2);
        int result2 = calculator.multiply(-5, 3);
        int result3 = calculator.multiply(-10, -4);

        //then
        Assert.assertEquals(6, result1);
        Assert.assertEquals(-15, result2);
        Assert.assertEquals(40, result3);
    }

    @Test
    public void should_not_multiply_two_numbers() {

        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.multiply(-5, -5);

        //then
        Assert.assertNotEquals(-25, result);
    }

    @Test
    public void should_divide_two_numbers() {

        //given
        Calculator calculator = new Calculator();

        //when
        double result1 = calculator.divide(6, 2);
        double result2 = calculator.divide(-5, 10);
        double result3 = calculator.divide(-15, -4);

        //then
        Assert.assertEquals(3, result1, 0);
        Assert.assertEquals(-0.5, result2, 0);
        Assert.assertEquals(3.75, result3, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void should_not_divide_two_numbers() {

        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.divide(123, 0);

        //then
        Assert.assertNotEquals(123, result);
    }

}
