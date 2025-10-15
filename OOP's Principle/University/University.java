package object_modeling.Problem2_University;

import java.util.*;

public class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void addFaculty(Faculty f) {
        faculties.add(f);
    }

    public void deleteUniversity() {
        System.out.println("Deleting University: " + name);
        departments.clear(); // Composition: departments deleted
    }

    public void showFaculties() {
        System.out.println("Faculties at " + name + ":");
        for (Faculty f : faculties) {
            System.out.println(" - " + f.getName());
        }
    }
}
