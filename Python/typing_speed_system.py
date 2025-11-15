from time import time;
import random;
mySentence = ["All things bright and beautiful", "All creatures great and small", "All things wise and wonderful", "The lord God made them all", "The little flower that open", "The little bird that sings", "He made their glowing colours he made their tiny wings"]

sentence = random.choice(mySentence)
newSentence = sentence.lower()
begining_time = time();
print(sentence)
inputed_sentence = input("Enter the sentence above: ").lower()
ending_time = time();


count = 0
correctInput = 0
for word in inputed_sentence:
	
	if word == newSentence[count]:
		correctInput += 1;
	count += 1


print("Time taken in seconds is ", int(ending_time - begining_time), "seconds")
print(f"Time taken in minutes is  {(ending_time - begining_time)/60: .2} in minutes")
print(f"Words typed per minutes is  {((ending_time - begining_time)/60)/ len(newSentence): .2}")
print("You got ", correctInput, "out of ",len(newSentence) , " letters.")


