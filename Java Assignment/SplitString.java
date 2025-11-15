public class SplitString{

	public 	static void main (String... args){


	String sentence = "I am a good girl";
	String [] splittedWords= sentence.split(" ");
	
	
	for (String word : splittedWords){
			
		System.out.println(word);

	}




	}

}