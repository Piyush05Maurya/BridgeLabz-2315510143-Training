package object_modeling.Problem5_UniversityManagement;

public class Course2 {
    private String name;
    private Professor professor;

    public Course2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println("Professor " + p.getName() + " assigned to course " + name);
    }
}
