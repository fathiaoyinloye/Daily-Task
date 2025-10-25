def get_word(words):
	if type(words) == int or words == "":
		return "Invalid Input"
	return words


def split_words(words):
	words = get_word(words)
	splittedWords = words.split(" ")
	return splittedWords