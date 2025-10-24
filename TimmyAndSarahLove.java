public class TimmyAndSarahLove{

	public static boolean timmyFlower(int flower){

		if (flower % 2 == 0)
			return true;
		else
			return false;
	}


	public static boolean sarahFlower(int flower){

		if (flower % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean inLove(int flower1, int flower2){
		boolean timmy = timmyFlower(flower1);
		boolean sarah = sarahFlower(flower2);

		if( timmy == true || sarah == true)
			return true;
		else
			return false;
		

	}





}