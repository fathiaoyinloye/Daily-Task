public class ZeroLastDigitTwo{
		public static void main(String[] args){


		int[] numbers = {4, 0, 2, 0, 10, 3, 0,};

			for (int count = 1; count < numbers.length; count++){
				for(int counter = 0; counter <= count; counter++){

					if (numbers[counter] == 0){
						int temporary = numbers[counter];
						numbers[counter] = numbers[count];
						numbers[count] = temporary;
					}

					

								
			}
		
		}
					for (int count = 0;count < numbers.length; count++){
								System.out.print(numbers[count]+ " ");

			
	}

	}

}