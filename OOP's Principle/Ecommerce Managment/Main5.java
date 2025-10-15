package object_modeling.Problem5_UniversityManagement;

public class Main5 {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Smith");
        Student2 s1 = new Student2("Alice");

        Course2 c1 = new Course2("Math");
        c1.assignProfessor(prof1);

        s1.enrollCourse(c1);
    }
}
