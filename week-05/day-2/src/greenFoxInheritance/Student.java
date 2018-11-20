package greenFoxInheritance;

public class Student extends Person {
    private String previousOrganization;
    private int skippedDays;

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void introduce() {
        System.out.println(String.format("Hi, I'm %s, a %d year old %s from %s who has skipped %d days from the course already", getName(), getAge(), getGender(), previousOrganization, skippedDays));
    }

    public void skipDays(int numOfDays) {
        skippedDays += numOfDays;
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        skippedDays = 0;
    }

    public Student() {
        super();
        previousOrganization = "The School of Life";
        skippedDays = 0;
    }
}
