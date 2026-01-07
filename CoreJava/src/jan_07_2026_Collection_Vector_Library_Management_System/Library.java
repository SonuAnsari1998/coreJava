package jan_07_2026_Collection_Vector_Library_Management_System;

import module java.base;

public class Library {
	public void displayAvailableBooks(Vector<Book> book) {
		IO.println("Available Books in the Library :");
		for (Book books : book) {
			IO.println(books);
		}
	}

	public void issueBook(Vector<Book> book, Integer id) {
		boolean flag = false;

		for (Book b : book) {
			if (b.id() == id) {
				IO.println(b + " Book issued.");
				flag = true;
				book.remove(b);
				break;
			}
		}
		if (!flag) {
			IO.println("Book " + id + " not found.");
		}
	}

	public void searchBook(Vector<Book> book, String search) {

		Iterator<Book> itr = book.iterator();
		while (itr.hasNext()) {
			int index = 0;
			if (book.get(index++).author().equals(search) || book.get(index - 1).title().equals(search)) {
				IO.println("Found: " + book.get(--index));
				System.exit(0);
			} else {
				IO.println("Book with ID " + search + "not found.");
			}
		}
	}
}
