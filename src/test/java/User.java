public class User {

    public String username;
    public String password;

    public User() {

    }

    public User (String user, String pass) {
        System.out.println("Hello z konsturktora");
        username = user;
        password = pass;
    }

    public void sayHello() {
        System.out.println("Hello my name is: " + username);
    }

}
