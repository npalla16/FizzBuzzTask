package co.uk.myprojects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTaskTest{

    private FizzBuzzTask fizzBuzzTask;

    @BeforeEach
    public void setUp() {
        fizzBuzzTask = new FizzBuzzTask();
    }

    @AfterEach
    public void tearDown() {
        fizzBuzzTask = null;
        assertNull(fizzBuzzTask);
    }

    @DisplayName("getResult should return FIZZ if number is divisible by 3")
    @ParameterizedTest(name = "getResult should return FIZZ when number {0} is divisible by 3")
    @CsvSource({
            "3, FIZZ",
            "6, FIZZ",
            "9, FIZZ",
            "18, FIZZ"
    })
    public void getResultShouldReturnFizzIfTheNumberIsDivBy3(int number, String expectedResult) {
        assertEquals(expectedResult, fizzBuzzTask.getResult(number));
    }

    @DisplayName("getResult should return BUZZ if number is divisible by 5")
    @ParameterizedTest(name = "getResult should return BUZZ when number {0} is divisible by 5")
    @CsvSource({
            "5, BUZZ",
            "10, BUZZ",
            "35, BUZZ",
            "50, BUZZ"
    })
    public void getResultShouldReturnBuzzIfTheNumberIsDivBy5(int number, String expectedResult) {
        assertEquals(expectedResult, fizzBuzzTask.getResult(number));
    }

    @DisplayName("getResult should return FIZZBUZZ if number is divisible by 15")
    @ParameterizedTest(name = "getResult should return FIZZBUZZ when number {0} is divisible by 15")
    @CsvSource({
            "15, FIZZBUZZ",
            "30, FIZZBUZZ",
            "45, FIZZBUZZ",
            "90, FIZZBUZZ"
    })
    public void getResultShouldReturnFizzBuzzIfTheNumberIsDivisibleBy15(int number,String expectedResult) {
        assertEquals(expectedResult, fizzBuzzTask.getResult(number));
    }

    @DisplayName("getResult should return the same number in string format if the number is not divisible by 3 or 5")
    @ParameterizedTest(name="getResult should return same number in string format when number {0} is not divisible by 3 or 5")
    @ValueSource(ints = {1, 2, 4, 7, 8, 11, 13, 14, 16, 17, 19, 22, 23, 26, 28, 29})
    public void getResultShouldReturnTheSameNumberIfTheNumberIsNotDivisibleBy3Or5(int number) {
        assertEquals(String.valueOf(number), fizzBuzzTask.getResult(number));
    }

    @DisplayName("getResult should handle negative numbers correctly")
    @ParameterizedTest(name = "getResult should handle negative number {0} correctly")
    @CsvSource({
            "-3, FIZZ",
            "-5, BUZZ",
            "-15, FIZZBUZZ",
            "-1, -1",
            "-2, -2"
    })
    public void getResultShouldHandleNegativeNumbers(int number, String expectedResult) {
        assertEquals(expectedResult, fizzBuzzTask.getResult(number));
    }

    @DisplayName("getResult should handle zero correctly")
    @ParameterizedTest(name = "getResult should handle zero number {0} correctly")
    @CsvSource({
            "0, FIZZBUZZ"
    })
    public void getResultShouldHandleZeroAsFizzBuzz(int number, String expectedResult) {
        assertEquals(expectedResult, fizzBuzzTask.getResult(number));
    }
}