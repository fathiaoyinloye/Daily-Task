import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CarFuelSystemTest{
	CarFuelSystem fuelSystem;

	@BeforeEach
	void setup (){

		fuelSystem = new CarFuelSystem();
	}

	@Test
	public void testThatCarCannotMoveWhenYouJustCreatAnObjectOfCarSystem(){

	boolean result = fuelSystem.getCarStartingStatus();

	assertEquals(result, false);

	}

	@Test
	public void testThatCarCanStartWhenItNeedsToStart(){
		fuelSystem.StartCar();
		boolean result = fuelSystem.getCarStartingStatus();

		assertEquals(result, true);

	}

	@Test
	public void testThatCarCannotStartWhenItIsAlreadyStarted(){
		fuelSystem.StartCar();
		assertThrows(IllegalArgumentException.class, () ->{
            	fuelSystem.StartCar();
		});


	}
	
	@Test
	public void testThatCarCanStop(){
		fuelSystem.StartCar();
		fuelSystem.stopCar();
		boolean result = fuelSystem.getCarStartingStatus();

		assertEquals(result, false);

	}


	@Test
	public void testThatCarCantStopCarWhenCarIsAlreadyStopped(){
		assertThrows(IllegalArgumentException.class, () ->{
            	fuelSystem.stopCar();
		});


	}
	
	@Test
	public void testThatByDefaultYourFuelTankIsEmpty(){
		
		double result = fuelSystem.getLevlOfFuel();

		assertEquals(result, 0.0);

	}
	
	@Test
	public void testThatYouCanFuelYourTankAndYourFuelLevelIncreases(){
		 fuelSystem.refuel(2);
		double result = fuelSystem.getLevlOfFuel();

		assertEquals(result, 2.0);

	}


	@Test
	public void testThatYouCannotFillYourTankMoreThanTheFuelLevel(){
		 fuelSystem.refuel(30);
		assertThrows(IllegalArgumentException.class, () ->{
            	fuelSystem.refuel(29);
		});

		
	}
	@Test
	public void testThatYouCannotFuelWithANegativeValue(){
		assertThrows(IllegalArgumentException.class, () ->{
            	fuelSystem.refuel(-10);
		});

		
	}


	@Test
	public void testThatYouCantDriveWhenYourFuelLevelIsZero(){
		fuelSystem.StartCar();
		assertThrows(IllegalArgumentException.class, () ->{
            	fuelSystem.drive(5);
		});

		
	}
	
	@Test
	public void testThatYouCantDriveWhenDistanceIsNegative(){
		fuelSystem.StartCar();
		assertThrows(IllegalArgumentException.class, () ->{
            	fuelSystem.drive(-5);
		});

		
	}
	@Test
	public void testThatYouCantDriveWhenCarIsNotStart(){
		assertThrows(IllegalArgumentException.class, () ->{
            	fuelSystem.drive(10);
		});

		
	}

	
		

}




