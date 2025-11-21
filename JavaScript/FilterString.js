function getWordsWithFourLetters(myWords){
	let  fourLetterWords = []
	for (let word of myWords){
		if (word.length == 4)  fourLetterWords.push(word);
	}

	return fourLetterWords;
	}

let words = ["Fathia", "Temmy", "Tolu", "Babe"];	
console.log(getWordsWithFourLetters(words));

