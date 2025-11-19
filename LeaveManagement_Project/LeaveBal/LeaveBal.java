package LeaveManagement_Project.LeaveBal;

import Employ_Project.Exception.EmployException;
import LeaveManagement_Project.Exception.LeaveException;
import LeaveManagement_Project.LeaveDao.LeaveDaoImpl;
import LeaveManagement_Project.Model.Leave;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class LeaveBal {
    static LeaveDaoImpl leaveDao;
   static  StringBuilder sb;
    static {
        leaveDao=new LeaveDaoImpl();
        sb=new StringBuilder();
    }
    public List<Leave> showleaveBal(){
        return leaveDao.showleaveDao();
    }
    public String addleaveBal(Leave leave) throws LeaveException {
        leave.setApplied_on(new Date());
        if(validate_leave(leave)==true){
            leaveDao.addleaveDao(leave);
            return "Leave applied Successfully";
        }
        throw new LeaveException(sb.toString());
    }
    public Leave searchLeaveBal(int leave_id) {
        return leaveDao.searchleaveDao(leave_id);
    }

    public String updateLeaveBal(Leave leave) throws LeaveException {
        if(validate_leave(leave)== true) {
             leaveDao.updateleaveDao(leave);
             return "Leave updated Successfully";
        }
        throw new LeaveException(sb.toString());
    }

    public String deleteLeaveBal(int leave_id) {
        return leaveDao.deleteleaveDao(leave_id);
    }
    public boolean validate_leave(Leave leave){
        boolean isValid=true;
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date today = cal.getTime();

       // java.sql.Date now = new java.sql.Date(System.currentTimeMillis());

        if(leave.getLeave_start_date().before(today)){
            sb.append("Leave Startdate cannot be Yesterday Or past");
            isValid=false;

        }
        if(leave.getLeave_end_date().before(today)){
            sb.append("Leave Enddate cannot be Yesterday Or past");
            isValid=false;

        }
        if(leave.getLeave_start_date().after(leave.getLeave_end_date())){
            sb.append("leaveStartDate cannot be greater than leaveEndDate!");
            isValid=false;
        }
        return isValid;


    }
}
