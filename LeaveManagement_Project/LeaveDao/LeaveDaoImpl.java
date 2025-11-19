package LeaveManagement_Project.LeaveDao;

import LeaveManagement_Project.Model.Leave;

import java.util.ArrayList;
import java.util.List;

public class LeaveDaoImpl implements LeaveDao {
    static List<Leave> leavelist;
    static{
        leavelist=new ArrayList<>();
    }
    public List<Leave> showleaveDao(){
        return leavelist;
    }

    @Override
    public String addleaveDao(Leave leave) {
        leavelist.add(leave);
        return "Leave record added successfully";

    }


    public String updateleaveDao(Leave leaveupd){
       Leave leavefound=searchleaveDao(leaveupd.getLeave_id());
       if(leavefound!=null){
           leavefound.setLeave_start_date(leaveupd.getLeave_start_date());
           leavefound.setLeave_end_date(leaveupd.getLeave_end_date());
           leavefound.setNo_of_days(leaveupd.getNo_of_days());
           leavefound.setEmp_id(leaveupd.getEmp_id());
           leavefound.setApplied_on(leaveupd.getApplied_on());
           leavefound.setReason(leaveupd.getReason());
           return "Leave record Updated Successfully... ";
       }
       return "Record Not Found";
    }

    @Override
    public String deleteleaveDao(int leave_id) {
        Leave leaveFound = searchleaveDao(leave_id);
        if(leaveFound != null) {
            leavelist.remove(leaveFound);
            return "Leave Deleted Successfully... ";
        }

        return "Leave Not Found... ";
    }




    @Override
    public Leave searchleaveDao(int leave_id) {
        Leave leaveFound = leavelist.stream().filter(x -> x.getLeave_id()== leave_id).findFirst().orElse(null);
        return leaveFound;
    }
}
