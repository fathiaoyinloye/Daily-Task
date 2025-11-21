function getOccurrenceMoreThanOne(characters){
	let newCharacters = characters.toLowerCase();
	let occurrence = 0;
	for(let index = 0; index < newCharacters.length; index++){
		let count = 0;
		for(let counter = index + 1; counter < newCharacters.length; counter++){
			if(newCharacters.charAt(index) == newCharacters.charAt(counter)) count++;


			}
		
			if (count >= 1) occurrence++;

		}
		return occurrence;
	}
	
console.log(getOccurrenceMoreThanOne("fdhAgSF11as"));



	



