package HospitalManagementSystem_Project;

import HospitalManagementSystem_Project.HospitalDao.HospitalDaoImpl;
import HospitalManagementSystem_Project.Model.Appointment;
import HospitalManagementSystem_Project.Model.Doctor;
import HospitalManagementSystem_Project.Model.Patient;

public class HospitalBal {
    static HospitalDaoImpl app;
    static{
        app=new HospitalDaoImpl();
    }
    Doctor doctor=new Doctor();
    Patient patient=new Patient();


    public String bookAppointment(Patient patient) {

        String specialization = app.illnessTospecialization(patient.getIllness());
        Doctor doctor = app.getDoctorBySpecialization(specialization);
        if (doctor != null && doctor.getIsavailable()) {
            Appointment appointment = new Appointment(patient, doctor);
            app.addAppointment(appointment);
            doctor.setIsavailable(false); // Doctor booked
            return " Appointment booked with Dr. " + doctor.getDname();
        }
        return " No available doctor for specialization: " + specialization;
    }

    public String view_appoinment_details(String name) {

            Appointment appointment = app.getAppointmentByPatientName(name);
            if (appointment != null) {
                return appointment.toString();
            }
        return " No appointment found!";
    }

}
