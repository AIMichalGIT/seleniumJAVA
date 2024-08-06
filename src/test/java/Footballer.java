public class Footballer extends Person {

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        this.footballClub = footballClub;
    }

    public void playFootball(){
        System.out.println("I play footbal!");
    }
    public void sayHello () {
        System.out.println("Hello my name is: " + name);
        System.out.println("I am " + age);
    }
    public void eat() {
        System.out.println("I like healthy food");
    }
}
