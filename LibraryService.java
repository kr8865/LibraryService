import java.util.ArrayList;

public class LibraryService {
  private static LibraryService instance;
  private LibraryService(){

  }


     public static LibraryService getInstance() {

        if (instance == null) {
            instance = new LibraryService();
        }

        return instance;
    }

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book newBook) {

        for (Book book : books) {

            if (book.getBookID() == newBook.getBookID()) {

                book.addCopy();

                System.out.println("Existing book found. Copy added.");
                return;
            }
        }

        books.add(newBook);

        System.out.println("New book added.");
    }

    public void removeBook(int bookId) {

        for (int i = 0; i < books.size(); i++) {

            Book book = books.get(i);

            if (book.getBookID() == bookId) {

                if (book.getAvailable() == 0) {
                    System.out.println(
                        "Cannot remove. All copies are currently issued."
                    );
                    return;
                }

                book.removeCopy();

                if (book.getTotal() == 0) {
                    books.remove(i);
                }

                System.out.println("Book removed successfully.");
                return;
            }
        }

        System.out.println("Book does not exist.");
    }

    public void borrowBook(int bookId, User user) {

        for (Book book : books) {

            if (book.getBookID() == bookId) {
                book.issueTo(user);
                return;
            }
        }

        System.out.println("Book does not exist.");
    }

    public void returnBook(int bookId, User user) {

        for (Book book : books) {

            if (book.getBookID() == bookId) {
                book.returnBook(user);
                return;
            }
        }

        System.out.println("Book does not exist.");
    }
    public void allBooks(){
        for(int i=0;i<books.size();i++){
            System.out.println(books.get(i).getTitle()+" "+books.get(i).getAvailable());
        }
    }
    public void getAllissuedBooks(){
        for(int i=0;i<books.size();i++){
            if(!books.get(i).getIssuedTo().isEmpty()){
                for(User user:books.get(i).getIssuedTo()){
                System.out.println(books.get(i).getTitle()+" "+user.getInfo());
                }
            }
        }
    }
}