import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
       System.out.print("hello please enter your name and id");
       System.out.print("enter your name please");
       String name=sc.next();
       System.out.println("enter your id please:");
       int id=sc.nextInt();
       System.out.print("enter your role please:");
       String role=sc.next();
       UserFactory factory = new UserFactory();

      User user = factory.createUser(role)
        .setUserid(id)
        .setUsername(name)
        .build();

        user.Display();

        LibraryService libraryService =  LibraryService.getInstance();
        libraryService.addBook(new Book(1,"marykom","neha"));
        libraryService.addBook(new Book(1,"marykom","neha"));
        libraryService.borrowBook(1, user);

        libraryService.allBooks();
        libraryService.getAllissuedBooks();

        

        

       




        

       
    }
    
}
