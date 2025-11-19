package LeaveManagement_Project.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Leave {
    int leave_id;
    int emp_id;
    Date leave_start_date;
    Date leave_end_date;
    int no_of_days;
    Date applied_on;
    String reason;

    public Leave(int leave_id, int emp_id, Date leave_start_date, Date leave_end_date, int no_of_days, Date applied_on, String reason) {
        this.leave_id = leave_id;
        this.emp_id = emp_id;
        this.leave_start_date = leave_start_date;
        this.leave_end_date = leave_end_date;
        this.no_of_days = no_of_days;
        this.applied_on = applied_on;
        this.reason = reason;
    }

    public Leave() {

    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return "Leave{" +
                "leave_id=" + leave_id +
                ", emp_id=" + emp_id +
                ", leave_start_date=" + sdf.format(leave_start_date) +
                ", leave_end_date=" + sdf.format(leave_end_date) +
                ", no_of_days=" + no_of_days +
                ", applied_on=" + sdf.format(applied_on) +
                ", reason='" + reason + '\'' +
                '}';
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public Date getLeave_start_date() {
        return leave_start_date;
    }

    public void setLeave_start_date(Date leave_start_date) {
        this.leave_start_date = leave_start_date;
    }

    public Date getLeave_end_date() {
        return leave_end_date;
    }

    public void setLeave_end_date(Date leave_end_date) {
        this.leave_end_date = leave_end_date;
    }

    public int getNo_of_days() {
        return no_of_days;
    }

    public void setNo_of_days(int no_of_days) {
        this.no_of_days = no_of_days;
    }

    public Date getApplied_on() {
        return applied_on;
    }

    public void setApplied_on(Date applied_on) {
        this.applied_on = applied_on;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getLeave_id() {
        return leave_id;
    }

    public void setLeave_id(int leave_id) {
        this.leave_id = leave_id;
    }
}
