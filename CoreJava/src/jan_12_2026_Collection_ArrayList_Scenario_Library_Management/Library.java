package jan_12_2026_Collection_ArrayList_Scenario_Library_Management;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Library {
	private ArrayList<Book> books;

	public Library() {
		books = new ArrayList<Book>();
	}

	public void addBook(Book book) {

		if (books.size() == 0) {
			books.add(book);
			System.out.println("Book added successfully.");
		} else {
			for (Book b : books) {
				if (!(b.getIsbn() == book.getIsbn())) {
					books.add(book);
					System.out.println("Book added successfully.");
				} else {
					System.out.println("Book with the same ISBN " + book.getIsbn() + " already exists.");
				}
			}
		}
	}

	private Book searchBookByISBN(long isbn) {
		Book book = null;
		for (Book b : books) {
			if (b.getIsbn() == isbn) {
				return b;
			}
		}
		return book;
	}

	public void displayAllBooks() {
//		 for(Book book:books) {
//			 IO.println(books);
//		 }

		Iterator<Book> itr = books.iterator();
		while (itr.hasNext()) {
			IO.println(itr.next());
		}
	}

	public void updateBookQuantityByISBN(long isbn) {

		for (Book b : books) {
			if (b.getIsbn() == isbn) {
				int qty = Integer.parseInt(IO.readln("Enter Quantity for Updation :"));
				if (qty <= 0) {
					System.out.println("Invalid updation!!");
				} else {
					b.setQuantity(qty);
					IO.println("Quantity updated successfully.new quantity = " + qty);
				}
			}
		}
	}

	public void deleteBookByTitle(String title) {
		for (Book book : books) {
			if (title.isBlank() || title == null) {
				IO.println("Book Title cannot be blank");
				System.exit(0);
			}
		}
		ListIterator<Book> itr = books.listIterator();

		while (itr.hasNext()) {
			Book book1 = itr.next();

			if (book1.getTitle().equals(title)) {
				itr.remove();
				IO.println(title + " book has been removed successfully...");
				break;
			}
		}
	}
}
