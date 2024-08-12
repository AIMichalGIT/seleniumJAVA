package JavaKurs;

public class PersonTest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 31, "SGH");
        teacher.name = "Tom";
        teacher.age = 31;
        teacher.walk();
        teacher.eat();
        teacher.sayHello();
        teacher.teachMath();

        System.out.println(" ");

        Footballer footballer = new Footballer("Cristiano", 39, "Sporting");
        footballer.sayHello();
        footballer.playFootball();
        footballer.walk();
        footballer.eat();
    }
}
