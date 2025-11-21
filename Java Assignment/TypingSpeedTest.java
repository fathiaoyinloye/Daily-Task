import java.util.Scanner;
public class TypingSpeedTest{
	public static void main (String... args){
		Scanner scanner = new Scanner(System.in);
	
		boolean going = true;
		while(going){
			System.out.println(showMenu());
			System.out.print("Choose from the above menu: ");
			String choice = scanner.nextLine();
			switch(choice){
			case "1" ->{

					String sentence = generateRandomSentence();
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
						System.out.printf("Words per  minutes is %.2f%n", wordsPerMinute);
					System.out.println(AccurancyPercentage(inputedWords, sentence));

			}
		case "2" ->{
					System.out.print("Thanks for using TypingGetBetter Application");
					going = false;
			}
				
		
		default -> {System.out.print("Invalid Input, Please choose from above menu");}

		


		}

	}




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
		for(int index = 0; index < wordsIgnorecase.length(); index++){
			if(wordsIgnorecase.charAt(index) == mySentenceIgnoreCase.charAt(count)) correctLetters ++;
			count++;
				
		}
		return "You got " + correctLetters + " letters right out of total of " + mySentenceIgnoreCase.length();
	}
	
	public static String  generateRandomSentence(){
		String[] mySentence = {"I am a goal getter", 
					"This is the boy that lives down the street ", 
					"Smile its sunnah", 
					"I was a girl in the village doing alright", 
					"Dream its Possible", 
					"I am the product of myself",
					"When there is life there is hope",
					"Remain calm Nothing is under control"};

		int randomNumber = (int)(Math.random() * 7);

		return mySentence[randomNumber];

	
	}

	public static String showMenu(){
		String menu ="""
*********************************************************
*It's Not Too Late... TypingSpeed Can Always Get Better	*
*********************************************************
*	Choose From The Options Below			*
*	1	=>	Test typing Speed		*
*	2	=>	Exit Application		*
*********************************************************
* 	Don't forget, the more the better		*
*********************************************************
""";
	return menu;
	


	}




}