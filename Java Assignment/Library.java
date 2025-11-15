import java.util.ArrayList;
public class Library{

	ArrayList <String> totalNumberOfBooks = new ArrayList <String>();

		
	public int totalNumberOfBooks(){


		return totalNumberOfBooks.size();

	}

	public String addBooks(String book){
		for (String books : totalNumberOfBooks){
			if (book.equalsIgnoreCase(books))
				return "Book Have Been Added Before";
		}
		totalNumberOfBooks.add(book);

		return "Book Added Successfully";

	}

	public String borrowBooks(String book){
		for (String books : totalNumberOfBooks){
			if (!book.equalsIgnoreCase(books))
			return "Book Not Available";
		}
		totalNumberOfBooks.remove(book);
		return "Book Added Successfully";

	}





}