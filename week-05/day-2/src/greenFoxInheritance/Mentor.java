package greenFoxInheritance;

public class Mentor extends Person {
    String level;

    public void getGoal() {
        System.out.println("Educate brilliant software developers.");
    }

    public void introduce() {
        System.out.println(String.format("Hi, I'm %s, a %d year old %s %s mentor.", getName(), getAge(), getGender(), level));
    }

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        super();
        this.level = "intermediate";

    }
}
