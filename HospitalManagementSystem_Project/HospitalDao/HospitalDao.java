package HospitalManagementSystem_Project.HospitalDao;

import HospitalManagementSystem_Project.Model.Appointment;
import HospitalManagementSystem_Project.Model.Doctor;
import HospitalManagementSystem_Project.Model.Patient;

public interface HospitalDao {
    public String addPatientDetails(Patient patient);
    public String check_doctor_availability(String specialization);
    public String view_patient_details(Patient patient);
    public String view_doctor_details(Doctor doctor);
    public String  illnessTospecialization(String illness);
    public Doctor getDoctorBySpecialization(String spec);
    public Patient getPatientByName(String name);
    public void addAppointment(Appointment appointment);
    public Appointment getAppointmentByPatientName(String name);
}
