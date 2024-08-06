public class PersonTest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 31, "SGH");
        teacher.name = "Tom";
        teacher.age = 31;
        teacher.walk();
        teacher.eat();
        teacher.sayHello();
        teacher.teachMath();
    }
}
