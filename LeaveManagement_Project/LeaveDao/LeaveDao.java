package LeaveManagement_Project.LeaveDao;

import LeaveManagement_Project.Model.Leave;

import java.util.List;

public interface LeaveDao {
    public List<Leave> showleaveDao();
    public String addleaveDao(Leave leave);
    public String updateleaveDao(Leave leaveupd);
    public String deleteleaveDao(int leave_id);
    public Leave searchleaveDao(int leave_id);

}
