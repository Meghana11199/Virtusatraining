package HospitalManagementSystem_Project.Model;


public class Appointment {

    private Patient patient;
    private Doctor doctor;

    public Appointment(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    @Override
    public String toString() {
        return "\n===== Appointment Details =====" +
                "\nPatient Name: " + patient.getPname() +
                "\nDoctor Name: " + doctor.getDname() +
                "\nSpecialization: " + doctor.getdSpec();
    }
}
