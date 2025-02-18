
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

class EBook extends Book {
 double fileSize;  
 String format;    

 public EBook(String title, String author, double price, double fileSize, String format) {
     super(title, author, price); 
     this.fileSize = fileSize;
     this.format = format;
 }

 @Override
 public void displayDetails() {
     super.displayDetails(); 
     System.out.println("File Size: " + fileSize + "MB");
     System.out.println("Format: " + format);
 }
}


public class Single {
 public static void main(String[] args) {
     Book book = new Book("The Alchemist", "Paulo Coelho", 9.99);
     System.out.println("Book Details:");
     book.displayDetails();

     System.out.println("\n----------------------\n");

     EBook ebook = new EBook("Digital Fortress", "Dan Brown", 6.99, 1.5, "PDF");
     System.out.println("EBook Details:");
     ebook.displayDetails();
 }
}
