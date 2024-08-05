public class UserTest {
    public static void main(String[] args) {
        User user = new User("Michal", "pass123" );
        user.username = "Michal";
        user.password = "qwerty123";

        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();
    }
}
