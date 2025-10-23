def to_upper_case(word):
	if type(word) == str:
		word = word.upper()
		return word
	else: raise TypeError ("Invalid input, enter a word")

