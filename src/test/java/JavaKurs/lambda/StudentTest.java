package JavaKurs.lambda;

public class StudentTest {
    public static void main(String[] args) {
        Student it = new ITStudent();
        sayHello("Andrzej", it);

        // LAMBDA: (parametr) -> System.out.println("I am not a student, My name is " + name);
        Student noStudent = (name) -> System.out.println("I am not a student, My name is " + name);

        // jesli tylko 1 parametr to mozna bez nawiasu (name), jesli np 2 parametry to musi byc z przecinkiem
    }
    public static void sayHello(String name, Student student){
        student.sayHello(name);
    }
}
