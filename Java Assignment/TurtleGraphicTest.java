import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleGraphicTest{
	TurtleGraphic turtle;

	@BeforeEach
	void setup (){

		turtle = new TurtleGraphic();
	}


	@Test
	public void testThatTurtleExist(){

	boolean exist = turtle.turtleExist();

	assertEquals(exist, true);

	}


	/*@Test
	public void testThatAtStartMyTurtlePositionIsAtIndexZeroZaro(){

	int [] postion = turtle.getPosition();
	int[] expected = {0,0}

	assertEquals(position, expected);

	}*/
}

	
