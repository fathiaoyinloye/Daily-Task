import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest{
	Library library;

	@BeforeEach
	void setup (){

		library = new Library();
	}

	@Test
	public void testThatLibraryHasNoBook(){


	//Arrange

	//Act
	int result = library.totalNumberOfBooks();

	//Assert
	assertEquals(result, 0);

	}


	@Test
	public void testThatOneBookIsAddedToTheLibraryAndTheTotalNumberOfBooksIsOne(){
	// ARRANGE

	
	//ACT
	String response = library.addBooks("Things Fall Apart");

	//ASSERT
	assertEquals(response, "Book Added Successfully");


	}

	@Test
	public void testThatTwoBooksIsAddedToTheLibraryAndTheTotalNumberOfBooksIsTwo(){
		// ARRANGE

	
		//ACT
		library.addBooks("Things Fall Apart");
		library.addBooks("Had I Know");
		int actual = library.totalNumberOfBooks();

		//ASSERT
		assertEquals(actual, 2);


	}
	@Test
	public void testThatSameBookCannotBeAddedTwice(){

		// ARRANGE

	
		//ACT
		library.addBooks("Things Fall Apart");
		library.addBooks("Things Fall Apart");
		int actual = library.totalNumberOfBooks();

		//ASSERT
		assertEquals(actual, 1);


	}
	@Test
	public void testThatyoucanborrowbook(){

		// ARRANGE

	
		//ACT
		library.addBooks("Things Fall Apart");
		library.borrowBooks("Things Fall Apart");
		int actual = library.totalNumberOfBooks();
		System.out.print(actual);
		//ASSERT
		assertEquals(actual, 0);


	}
	@Test
	public void testThatyoucanOnlyborrowbookThatExist(){

		// ARRANGE

	
		//ACT
		library.addBooks("Things Fall Apart");
		String actual = library.borrowBooks("th Fall Apart");
		//ASSERT
		assertEquals(actual, "Book Not Available");


	}




}