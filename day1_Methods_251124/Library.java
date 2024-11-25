package week2.day1_Methods_251124;

public class Library {
	
	public String addBook(String bookTitle) {
		System.out.println("Book added sucessfully");
		return bookTitle;
	}
	public void issueBook() {
		System.out.println("Book issued sucessfully");
	}

	public static void main(String[] args) {
		Library obj = new Library();
		obj.addBook("test");
		obj.issueBook();
	}

}
