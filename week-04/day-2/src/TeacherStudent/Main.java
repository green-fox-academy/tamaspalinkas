package TeacherStudent;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();

        student.learn();
        student.question(teacher);

        teacher.answer();
        teacher.teach(student);
    }


}
