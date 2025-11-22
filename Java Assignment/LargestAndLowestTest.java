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
