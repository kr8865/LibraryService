import java.util.*;;

public class Library {
     ArrayList<Book> books=new ArrayList<>();
    public  void addBooks(int book_id,String book_name,String author,User user){
        if(!user.getrole().equals("librarian")){
            System.out.println("you are not authorized for this");
            return;
        }
        boolean av=false;
       for(int i=0;i<books.size();i++){
        if(books.get(i).getbookID()==book_id){
            books.get(i).setTotal(books.get(i).gettotal()+1);
            av=true;
        }

       }
       if(!av){
        books.add(new Book(book_id, book_name,author));
       }

    }

    /*remove book */
    public void removeBooks(int book_id,User user){
       if(!user.getrole().equals("librarian")){
            System.out.println("you are not authorized for this");
            return;
        }
        boolean av=false;
       for(int i=0;i<books.size();i++){
        if(books.get(i).getbookID()==book_id){
            if(books.get(i).gettotal()>1){
               books.get(i).setTotal(books.get(i).gettotal()-1);
              av=true;
              break;
            }
            else if(books.get(i).gettotal()==1){
                av=true;
                books.remove(i);
            }
            else{
                System.out.println("no book availabe");
                break;

            } 
        }

       }
       if(!av){
        System.out.print("book is not available");
       }


    }
    /*search book */
    public void searchBooks(int book_id){
        for(int i=0;i<books.size();i++){
            if(books.get(i).getbookID()==book_id){
            System.out.println(books.get(i).getbookID()+" "+books.get(i).gettitile());
            }
        }
        
    }




    
}
