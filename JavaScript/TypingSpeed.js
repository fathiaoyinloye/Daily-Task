const prompt = require('prompt-sync')();
const dateTime = new Date();


function AccurancyPercentage(inputtedWords, mySentence){
	let wordsIgnorecase = inputtedWords.toLowerCase()
	let mySentenceIgnoreCase = mySentence.toLowerCase()
	let index = 0;
	let correctLetters = 0;
	for(let word of wordsIgnorecase) {
		if(word == mySentenceIgnoreCase.charAt(index)) correctLetters ++;
		index ++;

	}
		return "You got " + correctLetters + " letters right out of total of " + mySentenceIgnoreCase.length;
}

let mySentence = ["All things bright and beautiful", "All creatures great and small", "All things wise and wonderful", "The lord God made them all", "The little flower that open", "The little bird that sings", "He made their glowing colours he made their tiny wings"]

let randomNumber = Math.floor(Math.random() * 7) 
let sentence = mySentence[randomNumber];
console.log(sentence);
let timeStarted = dateTime.getSeconds();
let inputedWords = prompt("Enter The sentence on the screen: ");
const dateTimeEnded = new Date();
let timeEnded = dateTimeEnded.getSeconds();
let timeUsed =timeEnded - timeStarted ;
let timeInMinutes = timeUsed / 60
let wordsPerMinute = timeInMinutes/sentence.length
console.log("Time taken in seconds:  " + timeUsed);
console.log("Time taken in in minutes is " +  timeInMinutes);
console.log("Words per  minutes is " + wordsPerMinute);
console.log(AccurancyPercentage(inputedWords, sentence));

		
