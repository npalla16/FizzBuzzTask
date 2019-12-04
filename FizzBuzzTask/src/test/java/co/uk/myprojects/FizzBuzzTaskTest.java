package co.uk.myprojects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTaskTest{

	private FizzBuzzTask fizzBuzzTask;

	@Before
	public void setUp() throws Exception {
		fizzBuzzTask = new FizzBuzzTask();
	}

	@After
	public void tearDown() throws Exception {
		fizzBuzzTask = null;
		assertNull(fizzBuzzTask);
	}

    @Test
    public void getResultShouldReturnFizzIfTheNumberIsDivBy3() {
        assertEquals("FIZZ", fizzBuzzTask.getResult(3));
        assertEquals("FIZZ", fizzBuzzTask.getResult(27));
    }

    @Test
    public void getResultShouldReturnBuzzIfTheNumberIsDivBy5() {
       assertEquals("BUZZ", fizzBuzzTask.getResult(5));
       assertEquals("BUZZ", fizzBuzzTask.getResult(10));
    }

    @Test
    public void getResultShouldReturnBuzzIfTheNumberIsDivBy15() {
        assertEquals("FIZZBUZZ", fizzBuzzTask.getResult(15));
        assertEquals("FIZZBUZZ", fizzBuzzTask.getResult(30));
    }

    @Test
    public void getResultShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        assertEquals("1", fizzBuzzTask.getResult(1));
        assertEquals("2", fizzBuzzTask.getResult(2));
        assertEquals("4", fizzBuzzTask.getResult(4));
    }

}