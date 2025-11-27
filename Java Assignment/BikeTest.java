import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest{
	Bike bike;

	@BeforeEach
	void setup (){

		bike = new Bike();
	}

	@Test
	public void testThatBikeCannotMoveWhenYouJustCreatAnObjctOfIt(){

		boolean result = bike.getIsStarted();
		assertFalse(result);

	}

	@Test
	public void testThatBikeCanBeTurnedOn(){
		bike.onBike();
		boolean result = bike.getIsStarted();
		assertTrue(result);

	}

	@Test
	public void testThatBikeCanBeStopped(){
		bike.onBike();
		bike.OffBike();
		boolean result = bike.getIsStarted();
		assertFalse(result);


	}
	@Test
	public void testThatBikeCannotBeStoppedIfItIsNotOn(){
		assertThrows(IllegalArgumentException.class, () ->{
            	bike.OffBike();
		});
	}
	
	@Test
	public void testThatBikeCanBeAcceleratedToGearOne(){
		bike.onBike();
		bike.accelerateBike();
		int result = bike.getSpeed();
		assertEquals(result, 1);

	}

	
	@Test
	public void testThatBikeCanChangeAccelerationOnceItHasIncreasePassTwentyFromGearOneToGearTwo(){
		bike.onBike();

		for(int count = 0; count <= 20; count++){
			bike.accelerateBike();
		}

		int result = bike.getSpeed();
		assertEquals(result, 22);

	}
	@Test
	public void testThatBikeCanBeAcceleratedToGearTwo(){
		bike.onBike();
		for(int count = 0; count <= 22; count++){
			bike.accelerateBike();
		}

		int result = bike.getSpeed();
		assertEquals(result, 26);

	}
	
	@Test
	public void testThatBikeCanBeAcceleratedToGearThree(){
		bike.onBike();
		for(int count = 0; count <= 25; count++){
			bike.accelerateBike();
		}

		int result = bike.getSpeed();
		assertEquals(result, 33);


	}

	@Test
	public void testThatBikeCanBeAcceleratedToGearFour(){
		bike.onBike();
		for(int count = 0; count <= 29; count++){
			bike.accelerateBike();
		}

		int result = bike.getSpeed();
		assertEquals(result, 46);

	}
	@Test
	public void testThatBikeCannotAcceleratedWhenYourBikeIsOff(){
		
		assertThrows(IllegalArgumentException.class, () ->{
            	bike.accelerateBike();
		});
	}
	@Test
	public void testThatBikeCanBeDecelerated(){
		bike.onBike();
		for(int count = 0; count < 4; count++){
			bike.accelerateBike();
		}
		bike.decelerateBike();
		int result = bike.getSpeed();
		assertEquals(result, 3);
	}
	
	@Test
	public void testThatBikeCanBeDeceleratedInGearFour(){
		bike.onBike();
		for(int count = 0; count < 29; count++){
			bike.accelerateBike();
		}
		bike.decelerateBike();
		int result = bike.getSpeed();
		assertEquals(result, 38);
	}
	@Test
	public void testThatBikeCannotBeDecelerattedWhenTheSpeedLevelIsZero(){
		bike.onBike();
		bike.decelerateBike();
		int result = bike.getSpeed();
		assertEquals(result, 0);
	}



}