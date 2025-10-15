package object_modeling.Problem1_School;

import java.util.*;

public class Course {
    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showStudents() {
        System.out.println("Course " + name + " has students:");
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}
