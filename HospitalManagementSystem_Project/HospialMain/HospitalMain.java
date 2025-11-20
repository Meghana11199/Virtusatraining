package HospitalManagementSystem_Project.HospialMain;

import HospitalManagementSystem_Project.HospitalBal;
import HospitalManagementSystem_Project.HospitalDao.HospitalDaoImpl;
import HospitalManagementSystem_Project.Model.Doctor;
import HospitalManagementSystem_Project.Model.Patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalMain {
    static HospitalDaoImpl hospitaldao;
   static HospitalBal hospitalbal;
    private static Object dname;

    static{
        hospitaldao=new HospitalDaoImpl();
        hospitalbal=new HospitalBal();
    }
    public static void add_patient_details_main(){
        Scanner sc=new Scanner(System.in);
        Patient patient=new Patient();
        System.out.println("Enter Patient name: ");
        patient.setPname(sc.next());
        sc.nextLine();
        System.out.println("Enter Patient age : ");
        patient.setP_age(sc.nextInt());

        System.out.println("Enter Patient Illness:");
        patient.setIllness(sc.next());
        sc.nextLine();
        System.out.println(hospitaldao.addPatientDetails(patient));
    }
    public static void doctor_availability(){
        System.out.println("Checking doctor availability :");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Doctor Specialization:");
        String doc_spec=sc.next();

        System.out.println(hospitaldao.check_doctor_availability(doc_spec));


    }
    public static void book_appointment_main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Patient Name");
        String pname=sc.next();
        Patient p = hospitaldao.getPatientByName(pname); // NEW METHOD USED

        if (p != null) {
            System.out.println(hospitalbal.bookAppointment(p));
        } else {
            System.out.println("Patient not found! Enter valid name.");
        }

    }
    public static void view_appointment_details_main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Patient Name: ");
        String name = sc.next();

        System.out.println(hospitalbal.view_appoinment_details(name));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println(" O P T I O N S ");
            System.out.println("1. Add Patient Details ");
            System.out.println("2. Check Doctor Availability ");
            System.out.println("3. Book The Appointmnet ");
            System.out.println("4. View the Appoinment Details ");
            System.out.println("5. Exit ");
            System.out.println("Enter your choice :");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    add_patient_details_main();
                    break;
                case 2:
                    doctor_availability();
                    break;
                case 3:
                    book_appointment_main();
                    break;
                case 4:
                    view_appointment_details_main();
                    break;
                case 5:
                    System.exit(0);
            }
        }while(choice<=5);

    }
}
