public class Book {
    private int bookID;
   private String title;
    private String author; 
    private int total;
    private int available; 
    public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.total=total;
        this.available=available;
    }
    public int getbookID(){
        return this.bookID;

    }
    public String gettitile(){
        return this.title;
    }
    public String getauthor(){
        return this.author;
    }
    public int gettotal(){
        return this.total;
    }
    public int getavailable(){
        return this.available;

    }
    public void setBookID(int bookID){
        this.bookID=bookID;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setTotal(int total){
        
        this.total=total;
    }
    public void setAvailabe(int available){
        this.available=available;
    }


    
}
