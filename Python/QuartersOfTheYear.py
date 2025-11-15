years = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];

def getquarterOfTheYear(numberOfTheYear):
		result = "";
		
		if (numberOfTheYear < 1 or numberOfTheYear > 12):
			result = "Invalid Number Of The Year Inputed";

		elif (numberOfTheYear < 4):
			result = years[numberOfTheYear - 1] +  " is part of the first quarter of the year";

		elif (numberOfTheYear < 7):
			result = years[numberOfTheYear - 1] + " is part of the second quarter of the year";

		elif (numberOfTheYear < 10):
			result = years[numberOfTheYear - 1] + " is part of the second quarter of the year";

		elif (numberOfTheYear < 13):
			result = years[numberOfTheYear - 1] + " is part of the fourth quarter of the year";

		return result;



		
print(getquarterOfTheYear(1));



	