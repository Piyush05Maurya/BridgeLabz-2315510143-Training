package object_modeling.Problem3_Hospital;

public class Main3 {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Dr. Smith");
        Doctor d2 = new Doctor("Dr. John");

        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        d1.consult(p1);
        d2.consult(p2);
        d1.consult(p2);
    }
}
