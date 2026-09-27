public class Admin extends User {
    private Admin(Builder build){
        super(build);
    }
    @Override 
    public void Display(){
        System.out.println("you are logged in as admin");
    }

   public static class Builder extends User.Builder{

        @Override 
        public User build(){
            return new Admin(this);
        }
    }
}
