package JavaKurs;

public class MathTeacher extends Person {

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public void teachMath() {
        System.out.println("I teach math!");
    }

    public void sayHello() {
        System.out.println("Hello my name is: " + name);
        System.out.println("I am " + age);
    }
}
