package HospitalManagementSystem_Project.Model;

import java.util.Date;

public class Doctor {

    String dname;
    String dSpec;
    boolean isavailable;

    public Doctor(String dname, String dSpec, boolean isavailable) {
        this.dname = dname;
        this.dSpec = dSpec;
        this.isavailable=isavailable;
    }

    public Doctor() {

    }

    @Override
    public String toString() {
        return "Doctor{" +
                "dname='" + dname + '\'' +
                ", dSpec='" + dSpec + '\'' +
                ", available=" + isavailable +
                '}';
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getdSpec() {
        return dSpec;
    }

    public void setdSpec(String dSpec) {
        this.dSpec = dSpec;
    }

    public boolean getIsavailable() {
        return isavailable;
    }

    public void setIsavailable(boolean isavailable) {
        this.isavailable = isavailable;
    }


}
