import java.util.ArrayList;
public class FilterString{
	
	public static void main(String... args){
	
	String[] words = {"Fathia", "Temmy", "Tolu"};	
	System.out.print(getWordsWithFourLetters(words));

	}


	public static ArrayList <String> getWordsWithFourLetters(String[] myWords){
		ArrayList <String> fourLetterWords = new ArrayList<>();
		for (String word : myWords){
			 if (word.length() == 4)  fourLetterWords.add(word);
		}

		return fourLetterWords;
	}

}