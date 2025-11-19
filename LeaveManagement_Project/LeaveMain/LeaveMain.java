package LeaveManagement_Project.LeaveMain;


import Employ_Project.Exception.EmployException;
import LeaveManagement_Project.Exception.LeaveException;
import LeaveManagement_Project.LeaveBal.LeaveBal;
import LeaveManagement_Project.Model.Leave;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class LeaveMain {
    static LeaveBal leavebal;
    static{
        leavebal=new LeaveBal();
    }
    public static void showLeaveMain(){
        List<Leave> leaveList= leavebal.showleaveBal();
        leaveList.forEach(x->System.out.println(x));
    }
    public static void addLeaveMain() throws LeaveException, ParseException {
        Scanner sc=new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Leave leave=new Leave();
        System.out.println("Enter LeaveId");
        leave.setLeave_id(sc.nextInt());
        System.out.println("Enter Emp_id:");
        leave.setEmp_id(sc.nextInt());
        System.out.println("Enter Leave Start date: ");
        Date startDate=sdf.parse(sc.next());
        leave.setLeave_start_date(startDate);
        System.out.println("Enter End date");
         Date endDate=sdf.parse(sc.next());
         leave.setLeave_end_date(endDate);
         sc.nextLine();
        System.out.println("Enter Reason");
        String reason = sc.nextLine();
        leave.setReason(reason);
        long diff=endDate.getTime()-startDate.getTime();
        long days=diff/(1000*60*60*24);
        leave.setNo_of_days((int)days);
        leave.setApplied_on(new Date(new java.util.Date().getTime()));
        System.out.println(leavebal.addleaveBal(leave));

    }
    public static void searchleaveMain(){
        int leave_id;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Leave Id");
        leave_id=sc.nextInt();
        Leave leavefound=leavebal.searchLeaveBal(leave_id);

        if(leavefound!=null){
            System.out.println(leavefound);

        }
        else{
            System.out.println("Leave not found");
        }
    }
    public static void updateLeaveMain() throws LeaveException, ParseException {
        Scanner sc=new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Leave leave=new Leave();
        System.out.println("Enter LeaveId");
        leave.setLeave_id(sc.nextInt());
        System.out.println("Enter Emp_id:");
        leave.setEmp_id(sc.nextInt());
        System.out.println("Enter Leave Start date: ");
        Date startDate=sdf.parse(sc.next());
        leave.setLeave_start_date(startDate);
        System.out.println("Enter End date");
        Date endDate=sdf.parse(sc.next());
        leave.setLeave_end_date(endDate);
        sc.nextLine();
        System.out.println("Enter Reason");
        String reason = sc.nextLine();
        leave.setReason(reason);

        leave.setNo_of_days(leave.getLeave_end_date().compareTo(leave.getLeave_start_date()));
        leave.setApplied_on(new Date(new java.util.Date().getTime()));
        System.out.println(leavebal.updateLeaveBal(leave));
    }

    public static void deleteLeaveMain(){
        int leave_id;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Leave_id");
        leave_id=sc.nextInt();
        leavebal.deleteLeaveBal(leave_id);
        System.out.println("Leave deleted Successfully");
    }
    public static void main(String[] args){
        int choice=0;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("O P T I O N S");
            System.out.println("1. Add Leave");
            System.out.println("2. Show Leave");
            System.out.println("3. Search Leave");
            System.out.println("4. Delete Leave");
            System.out.println("5. Update Leave");
            System.out.println("6. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    try {
                       addLeaveMain();
                    } catch (LeaveException |  ParseException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    showLeaveMain();
                    break;

                case 3:
                    searchleaveMain();
                    break;
                case 4:
                    deleteLeaveMain();
                    break;

                case 5:
                    try {
                        updateLeaveMain();
                    } catch (LeaveException | ParseException e) {
                        System.err.println(e.getMessage());
                    }
                    break;




            }
        }while(choice!=6);

    }
}
