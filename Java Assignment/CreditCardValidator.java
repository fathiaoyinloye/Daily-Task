import java.util.Scanner;
public class CreditCardValidator{
	public static int [] getArrayOfNumbers(String creditNumber){
		int[] creditCardNumbers = new int[creditNumber.length()];
		
		for(int count = 0; count< creditCardNumbers.length;count++){
			creditCardNumbers[count] = creditNumber.charAt(count) - '0';
		
		}
		return creditCardNumbers;

	}
	public static int getDoubleNumber(int number){
		return number * 2;

	}
	
	public static int sumTwoDigitNumber(int number){
		

		return number - 9;
	}


	public static int sumSecondDigitFromRightToLeft(int[] numbers){
		int sum = 0;
		for(int index = numbers.length-2; index >= 0; index-=2){
			int doubledNumber = getDoubleNumber(numbers[index]);
			if(doubledNumber > 9) doubledNumber = sumTwoDigitNumber(doubledNumber);
			sum += doubledNumber;



		}
	return sum;



	}

	public static int sumOddDigitDigitRightToLeft(int[] numbers){
		int sum = 0;
		for(int index = numbers.length-1; index >= 0; index-=2){
				sum += numbers[index];

		}
	return sum;



	}


	public static String getCardValidityStatus(String creditCardNumber){
		String isValid = "";
		int [] numbers = getArrayOfNumbers(creditCardNumber);
		int numberOne = sumSecondDigitFromRightToLeft(numbers);
		int numberTwo = sumOddDigitDigitRightToLeft(numbers);
		int sum = numberOne + numberTwo;
		if(sum % 10 == 0) isValid = "Valid";
		else isValid = "Invalid";
	return isValid;

	}



	public static String getTypeOfCard(int[] numbers){
		String output = "";
		if(numbers.length < 13 || numbers.length > 16) output = "Invalid Card Numbers";
		else if(numbers[0] == 4) output = "Visa Cards";
		else if(numbers[0] == 5) output = "MasterCards";
		else if(numbers[0] == 6) output = "Discover Cards";
		else if(numbers[0] * 10 + numbers[1] == 37) output = "American Express Cards";
		else output = "Invalid Card";


		return output;
	}


	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
	System.out.print("Hello, kindly enter card details to verify: ");
	String cardNumber = scanner.nextLine();
	System.out.println("Credit card type: " + getTypeOfCard(getArrayOfNumbers(cardNumber)));
	System.out.println("Credit card Number is: " + cardNumber);
	System.out.println("Credit card digit length is : " + cardNumber.length());	
	System.out.println("Credit card Validity status: " + getCardValidityStatus(cardNumber));	


	}


	


	








}