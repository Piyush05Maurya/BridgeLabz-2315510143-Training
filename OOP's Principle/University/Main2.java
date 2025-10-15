package object_modeling.Problem2_University;

public class Main2 {
    public static void main(String[] args) {
        University uni = new University("GLA University");

        Department d1 = new Department("CSE");
        Department d2 = new Department("ECE");

        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Brown");

        uni.addDepartment(d1);
        uni.addDepartment(d2);
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showFaculties();
        uni.deleteUniversity();
    }
}
