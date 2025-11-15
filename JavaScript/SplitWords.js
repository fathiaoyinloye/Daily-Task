let splittedWords = ""
function splitWords(sentence){

	let splittedWords = sentence.split(" ")	
		return splittedWords;	
}

let result = splitWords("I am going")

for (let count = 0; count < result.length; count++){
	console.log(result[count])

}