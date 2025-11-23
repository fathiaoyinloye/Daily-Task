public class CarFuelSystem{
	private double levelOfFuel;
	private boolean isStarted ;
	private static final int fuelEfficiency = 16;	



	public void StartCar(){
		if (isStarted == true) throw new IllegalArgumentException("Car is started already");

		else
		 isStarted = true;
				
	}
	

	public void stopCar(){
		if (isStarted == false) throw new IllegalArgumentException("You cannot stop car when it is not started");
		else isStarted = false;

	}

	public double getLevlOfFuel(){
		return levelOfFuel;

	}


	public boolean getCarStartingStatus(){
		return isStarted;
		
	}

	public void refuel(double liters){
		if(liters <= 0) throw new IllegalArgumentException("liters cannot be less than or equal to zero");
		else if(liters + levelOfFuel > 50) throw new IllegalArgumentException("Highest fuel level is 50liters");
		else levelOfFuel += liters;
	
	}
	private double calCulateFuelConsumed(double distance){
		double fuelConsumed = distance/ fuelEfficiency;
		String formatted = String.format("%.2d", fuelConsumed);
		int formattedInt = Integer.parseInt(formatted);
		return formattedInt;
		

	}
	public void drive(int distance){
		if(isStarted == false) throw new IllegalArgumentException("Car cannot be driven when it is not started");

		else if(distance <= 0) throw new IllegalArgumentException("You cannot go a negative distance");
		else if(levelOfFuel <= 0)throw new IllegalArgumentException("Car cannot be driven without fuel");
		else {
			double fuelConsumed =	calCulateFuelConsumed(distance);
			if(levelOfFuel - fuelConsumed < 0) levelOfFuel = 0;
			else{
				levelOfFuel -= fuelConsumed;

			}
		 }

	

	}


	


}