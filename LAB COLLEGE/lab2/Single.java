
class Book {
 String title, author;
 double price;


 public Book(String title, String author, double price) {
     this.title = title;
     this.author = author;
     this.price = price;
 }

 
 public void displayDetails() {
     System.out.println("Book Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("Price: $" + price);
 }
}

//Derived class EBook
class EBook extends Book {
 double fileSize;  
 String format;    

 // Constructor
 public EBook(String title, String author, double price, double fileSize, String format) {
     super(title, author, price); // Calling parent class constructor
     this.fileSize = fileSize;
     this.format = format;
 }

 // Method to display eBook details (overriding)
 @Override
 public void displayDetails() {
     super.displayDetails(); // Calls base class method
     System.out.println("File Size: " + fileSize + "MB");
     System.out.println("Format: " + format);
 }
}

//Main class to test the application
public class Single {
 public static void main(String[] args) {
     // Creating a Book object
     Book book = new Book("The Alchemist", "Paulo Coelho", 9.99);
     System.out.println("Book Details:");
     book.displayDetails();

     System.out.println("\n----------------------\n");

     // Creating an EBook object
     EBook ebook = new EBook("Digital Fortress", "Dan Brown", 6.99, 1.5, "PDF");
     System.out.println("EBook Details:");
     ebook.displayDetails();
 }
}
