package co.uk.myprojects;

import java.util.stream.IntStream;

public class FizzBuzzTask {

	/** Print FIZZ instead of number,if the number is multiple of 3 or it has 3 in it.
	Print BUZZ instead of number,if the number is multiple of 5 or it has 5 in it.
	Print FIZZBUZZ instead of number,if the number satisfies both criteria. */
	
	
	private java.util.function.IntPredicate divBy(int number){
		return i-> i % number == 0;
	}
	
	public String getResult(int number) {
		String result = "";
		result += divBy(3).test(number)? "FIZZ" : "";
		result += divBy(5).test(number)? "BUZZ" : "";
		return (result).isEmpty()? String.valueOf(number):result;
	}
	 public static void main(String[] args) {
		 FizzBuzzTask fbt = new FizzBuzzTask();
		 IntStream.rangeClosed(1, 100).mapToObj(fbt::getResult).forEach(System.out::println);
	}
}
