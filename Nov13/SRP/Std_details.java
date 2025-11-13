package Nov13.SRP;

public class Std_details {
    public void show_details(Student student,Calculate_marks total_marks){
        int total=total_marks.calc_marks(student);
       System.out.println("Student Id:"+student.std_id);
        System.out.println("Student Name: "+student.std_name);
        System.out.println("Student Section: "+student.section);
        System.out.println("Student total marks"+total);
    }
}
