package object_modeling.Problem1_School;

public class Main1 {
    public static void main(String[] args) {
        School school = new School("GLA University");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);

        school.addStudent(s1);
        school.addStudent(s2);

        school.showStudents();
        s1.showCourses();
        c1.showStudents();
    }
}
