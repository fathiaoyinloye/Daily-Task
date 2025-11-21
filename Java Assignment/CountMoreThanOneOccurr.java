public class CountMoreThanOneOccurr{

	public static void main (String... args){
		
	
		System.out.print(getOccurrenceMoreThanOne("fdhAgSF11as"));


	}


	public static int getOccurrenceMoreThanOne(String characters){
		String newCharacters = characters.toLowerCase();
		int occurrence = 0;
		for(int index = 0; index < newCharacters.length(); index++){
			int count = 0;
			for(int counter = index + 1; counter < newCharacters.length(); counter++){
				if(newCharacters.charAt(index) == newCharacters.charAt(counter)) count++;


			}
		
			if (count >= 1) occurrence++;

		}
		return occurrence;

	}


}