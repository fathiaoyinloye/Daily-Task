let years = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];

function getquarterOfTheYear(numberOfTheYear){
		let result = "";
		
		if (numberOfTheYear < 1 || numberOfTheYear > 12)
			result = "Invalid Number Of The Year Inputed";

		else if (numberOfTheYear < 4)
			result = years[numberOfTheYear - 1] +  " is part of the first quarter of the year";

		else if (numberOfTheYear < 7)
			result = years[numberOfTheYear - 1] + " is part of the second quarter of the year";

		else if (numberOfTheYear < 10)
			result = years[numberOfTheYear - 1] + " is part of the second quarter of the year";

		else if (numberOfTheYear < 13)
			result = years[numberOfTheYear - 1] + " is part of the fourth quarter of the year";

		return result;


	}
		
console.log(getquarterOfTheYear(1));



	