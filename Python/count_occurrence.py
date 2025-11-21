def count_occurrence_more_than_one(characters):
	newCharacter = characters.lower()
	occurrence = 0;
	for index in range(len(newCharacter) - 1):
		count = 0
		for character in newCharacter:
			if(newCharacter[index] == character):
				count+= 1
		if count > 1:
			occurrence += 1
	return occurrence
print(count_occurrence_more_than_one("chAacteTrs"))
