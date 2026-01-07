package jan_07_2026_Collection_Vector_Library_Management_System;

/*Select from the Menu :
	 1) Display Books Available in the Library :
	 2) Search a Book in the Library :
	 3) Issue a Book from the Library :
	 4) Exit from the application :
Please Enter your Choice :*/
import module java.base;

public class LibraryManagement {
	void main() {
		Library library = new Library();
		Vector<Book> bookList = new Vector<Book>(10, 5);
		bookList.add(new Book(101, "Core Java", "Mr James"));
		bookList.add(new Book(102, "Adv Java", "Mr Robert"));
		bookList.add(new Book(103, "Head First Java", "Miss Kathy Sierra"));
		bookList.add(new Book(104, "Programming in C", "Mr Denis"));

		IO.println("Select from the Menu :");
		IO.println("\t1) Display Books Available in the Library :");
		IO.println("\t2) Search a Book in the Library :");
		IO.println("\t3) Issue a Book from the Library :");
		IO.println("\t4) Exit from the application :");
		int choice = Integer.parseInt(IO.readln("Please Enter your Choice :"));
		switch (choice) {
		case 1 -> {
			library.displayAvailableBooks(bookList);
		}
		case 2 -> {
			String authorAndTitle = IO.readln("Enter keyword to search by title or author:");
			library.searchBook(bookList, authorAndTitle);
		}
		case 3 -> {
			int id = Integer.parseInt(IO.readln("Enter Book id which for Book issue :"));
			library.issueBook(bookList, id);
		}

		default -> IO.println("Invalid Choice");
		}
		;
	}
}
