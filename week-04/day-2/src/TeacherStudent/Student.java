package TeacherStudent;

public class Student {

    public void learn() {
        System.out.println("Student is learning");
    }

    public void question(Teacher teacher) {
        teacher.answer();
    }
}
