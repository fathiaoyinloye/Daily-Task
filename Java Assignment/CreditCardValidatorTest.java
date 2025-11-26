import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardValidatorTest{

	@Test
	public void testThatICanTakeMyCreditCardNumberAStringAndReturnAnArrayOfNumber(){

	int[] actual = CreditCardValidator.getArrayOfNumbers("123");
	int[] expected = {1,2,3};

	assertArrayEquals(actual, expected);

	}

	@Test
	public void testSumSecondDigitDigitRightToLeft(){
	int[] numbers = {2,4,5,7};
	int actual = CreditCardValidator.sumSecondDigitFromRightToLeft(numbers);
	int expected = 5;
	assertEquals(expected, actual);

	}

	@Test
	public void testSumOddDigitDigitRightToLeft(){
	int[] numbers = {2,4,5,7};
	int actual = CreditCardValidator.sumOddDigitDigitRightToLeft(numbers);
	int expected = 11;
	assertEquals(expected, actual);

	}
	
	@Test
	public void testgetTypeOfCard(){
	int[] numbers = {2,4,5,7};
	String actual = CreditCardValidator.getTypeOfCard(numbers);
	String expected = "Invalid Card Numbers";
	System.out.print(actual);
	assertEquals(expected, actual);

	}

	@Test
	public void testgetCardValidityStatusValidates(){
	String actual = CreditCardValidator.getCardValidityStatus("4567887654");
	String expected = "Invalid";
	System.out.print(actual);
	assertEquals(expected, actual);

	}





}
