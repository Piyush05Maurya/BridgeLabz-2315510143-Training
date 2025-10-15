package object_modeling.Problem1_School;

import java.util.*;

public class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showStudents() {
        System.out.println("School: " + name + " has students:");
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}
