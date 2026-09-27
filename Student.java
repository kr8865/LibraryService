public class Student extends User {
    private Student(Builder build){
        super(build);
    }
    @Override 
    public void Display(){
        System.out.print("You are logged in as Student");
    }
    public static class Builder extends User.Builder{

        @Override 
        public Student build(){
            return new Student(this);
        }

    }
    
}
