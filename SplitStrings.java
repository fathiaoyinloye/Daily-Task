public class SplitStrings{


	public String collectSentence(String sentence){
		if (sentence.equals(""))
			return "Words are to be inputed";
		return sentence;
	}

	public 	String[] splitWords(String sentence){
		
		String words = collectSentence(sentence);
		String [] splittedWords= words.split(" ");
	
	
		return splittedWords;	

	}


}