package greenFoxInheritance;

public class Sponsor extends Person {
    private String company;
    private int hiredStudents;

    public void introduce() {
        System.out.println(String.format("Hi, I'm %s, a %d year old %s who represents %s and hired %d students so far", getName(), getAge(), getGender(), company, hiredStudents));
    }

    public void hire() {
        hiredStudents++;
    }

    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        hiredStudents = 0;
    }

    public Sponsor() {
        super();
        company = "Google";
        hiredStudents = 0;
    }
}
