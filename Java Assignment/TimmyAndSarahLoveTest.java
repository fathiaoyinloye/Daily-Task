import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


	public class TimmyAndSarahLoveTest{
	
		@Test
		public void testThatTimmyPicksAFlower(){
	
		boolean actual = TimmyAndSarahLove.timmyFlower(7);
		boolean expected = false;
		assertEquals(actual,expected);

	}
		@Test
		public void testThatTimmyPicksAFlowerAndItReturnTheRightAnswer(){
	
		boolean actual = TimmyAndSarahLove.timmyFlower(4);
		boolean expected = true;
		assertEquals(actual, expected);

	}


		@Test
		public void testThatSarahPicksAFlower(){
	
		boolean actual = TimmyAndSarahLove.sarahFlower(4);
		boolean expected = true;
		assertEquals(actual, expected);

	}

		@Test
		public void testThatSarahPicksAFlowerAndItReturnTheRightAnswer(){
	
		boolean actual = TimmyAndSarahLove.timmyFlower(9);
		boolean expected = false;
		assertEquals(actual, expected);

	}

		@Test
		public void testThatSarahAndTimmyGetTheRightAnswerToTheirLove(){
	
		boolean actual = TimmyAndSarahLove.inLove(9,7);
		boolean expected = false;
		assertEquals(actual, expected);

	}

		@Test
		public void testThatSarahAndTimmyGetTheRightAnswerToTheirLoveIfOneIsEven(){
	
		boolean actual = TimmyAndSarahLove.inLove(9,6);
		boolean expected = true;
		assertEquals(actual, expected);

	}



}