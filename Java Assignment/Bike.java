public class Bike{

	private boolean isStarted;
	private int speed;
	
	public void onBike(){
		isStarted = true;

	}
	
	public void OffBike(){
		if (isStarted == false) throw new IllegalArgumentException("You cannot stop bike when it is not started");
		isStarted = false;
	}
	
	public boolean getIsStarted(){
		return isStarted;

	}

	public void accelerateBike(){
		if (isStarted == false) throw new IllegalArgumentException("You cannot accelerate when the bike is off");
		else if (speed >= 40) setAccelerateToGearFour();
		else if (speed >= 30) setAccelerateToGearThree();
		else if (speed >= 20) setAccelerateToGearTwo();
		else setAccelerateToGearOne();

	}
	
	public void decelerateBike(){
		if (isStarted == false) throw new IllegalArgumentException("You cannot accelerate when the bike is off");
		else if (speed >= 40) setDecelerateToGearFour();
		else if (speed >= 30) setDecelerateToGearThree();
		else if (speed >= 20) setDecelerateToGearTwo();
		else if(speed >= 1) setDecelerateToGearOne();

	}

	private void setAccelerateToGearOne(){
		speed++;
	}

	
	private void setAccelerateToGearTwo(){
		speed += 2;							
	}

	
	private void setAccelerateToGearThree(){
		speed += 3;			
				
					

	}
	
	private void setAccelerateToGearFour(){
		speed += 4;
						

	}

	private void setDecelerateToGearOne(){
		speed--;
	}

	
	private void setDecelerateToGearTwo(){
		speed -= 2;							
	}

	
	private void setDecelerateToGearThree(){
		speed -= 3;			
	}
	
	private void setDecelerateToGearFour(){
		speed -= 4;
						

	}








	
	public int getSpeed(){
		return speed;


	}



}