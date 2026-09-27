import java.util.ArrayList;

public class Book {

    private int bookID;
    private String title;
    private String author;

    private int total;
    private int available;

    private ArrayList<User> issuedTo;

    public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.total = 1;
        this.available = 1;
        this.issuedTo = new ArrayList<>();
    }

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getTotal() {
        return total;
    }

    public int getAvailable() {
        return available;
    }

    public ArrayList<User> getIssuedTo() {
        return issuedTo;
    }

    public void addCopy() {
        total++;
        available++;
    }

    public void removeCopy() {
        if (available > 0) {
            total--;
            available--;
        }
    }

    public void issueTo(User user) {
        if (available > 0) {
            issuedTo.add(user);
            available--;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(User user) {
        if (issuedTo.remove(user)) {
            available++;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("This user has not borrowed this book.");
        }
    }
}