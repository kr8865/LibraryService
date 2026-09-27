public abstract class User {

    private int user_id;
    private String user_name;
    private String role;
    protected User(Builder builder) {
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.role = builder.role;
    }
    public String getInfo(){
        return this.user_name;
    }
   abstract public void Display();
    

    public static abstract class Builder {

        private int user_id;
        private String user_name;
        private String role;

        public Builder setUserid(int user_id) {
            this.user_id = user_id;
            return this;
        }

        public Builder setUsername(String user_name) {
            this.user_name = user_name;
            return this;
        }

        public Builder setRole(String role) {
            this.role = role;
            return this;
        }

        public abstract User build();
    }
}