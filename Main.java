import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        Library library=new Library();
        System.out.print("1.create user");
        String name=sc.next();
        String role=sc.next();
        //User u= User.createUser(1,name,role);
        Book b=new Book(1, "radhashyam", "librarian");
        System.out.print(b.gettitile());
        

       
    }
    
}
