package HospitalManagementSystem_Project.HospitalDao;

import HospitalManagementSystem_Project.Model.Appointment;
import HospitalManagementSystem_Project.Model.Doctor;
import HospitalManagementSystem_Project.Model.Patient;

import java.util.ArrayList;
import java.util.List;

public class HospitalDaoImpl implements HospitalDao {

    Doctor doctor = new Doctor();
    List<Doctor> doctorList = new ArrayList<>();
    List<Patient> patientlist = new ArrayList<>();

    public HospitalDaoImpl() {
        doctorList.add(new Doctor("Arjun", "Cardiology", true));
        doctorList.add(new Doctor("Gopal", "Neurology", false));
        doctorList.add(new Doctor("Jhansi", "GeneralDoctor", true));
        doctorList.add(new Doctor("Meghana", "ENT", true));
        doctorList.add(new Doctor("Abhimanyu", "Orthopedic", true));
    }

    @Override
    public String addPatientDetails(Patient patient) {
        patientlist.add(patient);
        return "Patient Record added Successfully";
    }

    @Override
    public String check_doctor_availability(String specialization) {
        for (Doctor d : doctorList) {
            if (d.getdSpec().equalsIgnoreCase(specialization) && d.getIsavailable()) {
                return " Doctor Available: " + d.getDname();
            }

        }
        return "Doctor is not available with specialization :" +specialization;
    }

    @Override
    public String view_patient_details(Patient patient) {
        return patient.toString();
    }

    @Override
    public String view_doctor_details(Doctor doctor) {
        return doctor.toString();
    }

    @Override
    public String  illnessTospecialization(String illness){

        switch(illness.toLowerCase()){
            case "fever":
                return "GeneralDoctor";
            case "heartpain":
                return "Cardiology";
            case "headache":
                return "Neurology";
            case"earpain":
                return "ENT";
            case "fracture":
                return "Orthopedic";
            default:
                return "GeneralDoctor";
        }
    }
    public Doctor getDoctorBySpecialization(String specialization) {
        for (Doctor d : doctorList) {
            if (d.getdSpec().equalsIgnoreCase(specialization) && d.getIsavailable()) {
                return d;
            }
        }
        return null;
    }// Not found
        public Patient getPatientByName(String name) {

            for (Patient p : patientlist) {
                if (p.getPname().equalsIgnoreCase(name)) {
                    return p;
                }
            }
            return null;

        }
    List<Appointment> appointments = new ArrayList<>();

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public Appointment getAppointmentByPatientName(String name) {
        for (Appointment app : appointments) {
            if (app.getPatient().getPname().equalsIgnoreCase(name)) {
                return app;
            }
        }
        return null;
    }
}






