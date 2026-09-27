class Book {
    String title;
    String author;
    String isbn;

    // Constructor with all three details
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Constructor with only title
    Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.isbn = "NOT_ASSIGNED";
    }

    void display() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("ISBN   : " + isbn);
        System.out.println();
    }
}

public class Ass_2_BooksDemo {
    public static void main(String[] args) {

        Book b1 = new Book(
            "Java Programming",
            "James Gosling",
            "ISBN101"
        );

        Book b2 = new Book("Data Structures");

        System.out.println("Book 1:");
        b1.display();

        System.out.println("Book 2:");
        b2.display();
    }
}