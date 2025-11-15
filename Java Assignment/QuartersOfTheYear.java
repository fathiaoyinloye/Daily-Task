public class QuartersOfTheYear{
	String[] years = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

	public  String getquarterOfTheYear(int numberOfTheYear){
		String result = "";
		
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
		
	public static void main (String... args){
	QuartersOfTheYear quartersOfTheYear = new QuartersOfTheYear();
	System.out.print(quartersOfTheYear.getquarterOfTheYear(15));



	}




}