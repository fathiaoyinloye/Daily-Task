import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToUpperCaseTest{

	@Test
	public void testThatThereIsAWordToConvertToUpperCase(){


	//Arrange
	ToUpperCase toUpperCase = new ToUpperCase();

	//Act
	String result = toUpperCase.convertToUpperCase("fathia");

	//Assert
	assertEquals(result, "FATHIA");

	}


	@Test
	public void testThatItConvertsSentenceToLower(){


	//Arrange
	ToUpperCase toUpperCase = new ToUpperCase();

	//Act
	String result = toUpperCase.convertToUpperCase("fathia is my name");

	//Assert
	assertEquals(result, "FATHIA IS MY NAME");

	}








}

