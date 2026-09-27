public class UserFactory {

    public User.Builder createUser(String role) {

        if (role.equalsIgnoreCase("ADMIN")) {

            return new Admin.Builder()
                    .setRole("ADMIN");
                    
        }

        if (role.equalsIgnoreCase("STUDENT")) {

            return new Student.Builder()
                    .setRole("STUDENT");
        }

        throw new IllegalArgumentException("Invalid role: " + role);
    }
}
    