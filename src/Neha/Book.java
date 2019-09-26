/* Create a class Book having Title, Book Publisher, Author with parameterized constructor using this keyword. 
 * Write a method to display the details of the Book and Test the class by creating objects.*/
package Neha;

public class Book {
	String title = "";
	String bookPublisher = "";
	String author = "";
	Book(String title,String bookPublisher,String author ){
		this.title = title;
		this.bookPublisher=bookPublisher;
		this.author=author;
	}
	void display() {
		System.out.println("The title of the book is "+title +" written by " +author+ " and published by "+bookPublisher);
	}
	public static void main(String[] args) {
		Book b = new Book("Java","Technocredits","Maulik");
		b.display();
	}
	

}
