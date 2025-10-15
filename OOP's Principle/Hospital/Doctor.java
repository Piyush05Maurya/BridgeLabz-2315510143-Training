package object_modeling.Problem3_Hospital;

public class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void consult(Patient p) {
        System.out.println("Doctor " + name + " is consulting patient " + p.getName());
    }
}
