
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SplitStringTest{
	SplitStrings splitStrings;

	@BeforeEach
	void setup (){

		splitStrings = new SplitStrings();
	}

	@Test
	public void testThatThereAreWordsToSplit(){

		String actual = splitStrings.collectSentence("I am a girl");
		String expected = "I am a girl";
		assertEquals(actual, expected);


	}

	@Test
	public void testThatThereAreWordsToTestIsNotEmpty(){

		String actual = splitStrings.collectSentence("");
		String expected = "Words are to be inputed";
		assertEquals(actual, expected);


	}

	@Test
	public void testThatTheWordsAreSeparatedIntoAnArrayCorrectly(){
		String words = "I love programming";
		String[] splitted = splitStrings.splitWords(words);
		String firstWord = splitted[0];
		String expected = "I";
		assertEquals(firstWord, expected);


	}
	@Test
	public void testThatTheWordsAreSeparatedIntoAnArrayCorrectlyTwo(){
		String words = "I love programming";
		String[] splitted = splitStrings.splitWords(words);
		String firstWord = splitted[2];
		String expected = "programming";
		assertEquals(firstWord, expected);


	}






}