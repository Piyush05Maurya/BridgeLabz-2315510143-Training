package object_modeling.Problem5_UniversityManagement;

import java.util.*;

public class Student2 {
    private String name;
    private List<Course2> courses;

    public Student2(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course2 c) {
        courses.add(c);
        System.out.println(name + " enrolled in " + c.getName());
    }
}
