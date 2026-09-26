import java.util.HashMap;

public class User {
    int user_id;
    String name;
    String role;
    private User(int user_id,String name,String role){
        this.user_id=user_id;
        this.name=name;
        this.role=role;
    }
    public int getUser(){
        return this.user_id;
    }
    public String getName(){
        return this.name;
    }
    public String getrole(){
        return this.role;
    }
    public void setUser(int user_id){
        this.user_id=user_id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setRole(String role){
        this.role=role;
    }
    public void Display(){
        System.out.print(" I AM "+getName()+" role "+getrole());
    }
    //factory method
    public static User createUser(int user_id,String name,String role){
        if(user_id<=0){
            throw new IllegalArgumentException("Invalid ID");
        }

        return new User(user_id,name,role);

    }

    
}
