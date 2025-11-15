import java.util.Scanner;
public class TypingSpeedTest{
	public static void main (String... args){
		String[] mySentence = {"I am a goal getter", "This is the boy that lives down the street ", "Smile its sunnah", "I was a girl in the village doing alright"};
		int randomNumber = (int)(Math.random() * 3);	
		String sentence = mySentence[randomNumber];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(sentence);
		Long timeStarted = checkTime();
		System.out.print("Enter The sentence on the screen: ");
		String inputedWords = scanner.nextLine();
		Long timeEnded = checkTime();
		Long timeUsed = getTimeUsed(timeStarted, timeEnded);
		Long timeInSeconds = getTimeInSeconds(timeUsed);
		double timeInMinutes = getTimeInMinutes(timeInSeconds);

		double wordsPerMinute = timeInMinutes/7;
		System.out.println("Time taken in seconds:  " + timeInSeconds);
		System.out.printf("Time taken in in minutes is %.2f%n", timeInMinutes);
		System.out.println("Words per  minutes is %.2f%n", wordsPerMinute);
		System.out.println(AccurancyPercentage(inputedWords, sentence));

	}

	public static Long  checkTime(){
		Long time = System.currentTimeMillis();

		return time;

	}

	public static Long getTimeUsed(Long timeStarted, Long timeEnded){
		
		return timeEnded - timeStarted;

	}
	
	public static Long getTimeInSeconds(Long timeUsed){

		return timeUsed/1000;
	}
	
	public static double getTimeInMinutes(Long timeInSeconds){

		return  timeInSeconds * 1.0 /60;
	}
	public static String AccurancyPercentage(String words, String mySentence){
			String mySentenceIgnoreCase = mySentence.toLowerCase();
			String wordsIgnorecase = words.toLowerCase();
		int count = 0;
		int correctLetters = 0;
		for(int index = 0; index < mySentenceIgnoreCase.length(); index++){
			if(wordsIgnorecase.charAt(count) == mySentenceIgnoreCase.charAt(index)) correctLetters ++;
				if(count == mySentenceIgnoreCase.length() - 1) break;
				count ++;

		}
		return "You got " + correctLetters + " letters right out of total of " + mySentenceIgnoreCase.length();
	}
	

}