package Nov13.SRP;

public class Stu_main {
    public static void main(String[] args){
        Student std=new Student(123,"Sueresh",'A',23,76,94);
        Calculate_marks marks=new Calculate_marks();
        Std_details info=new Std_details();
        info.show_details(std,marks);
    }
}
