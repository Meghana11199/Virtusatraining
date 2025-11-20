package HospitalManagementSystem_Project.Model;

public class Patient {
    String pname;
    int p_age;
    String illness;

    public Patient(String pname, int p_age, String illness) {
        this.pname = pname;
        this.p_age = p_age;
        this.illness = illness;
    }

    public Patient() {

    }

    @Override
    public String toString() {
        return "Patient{" +
                "pname='" + pname + '\'' +
                ", p_age=" + p_age +
                ", illness='" + illness + '\'' +
                '}';
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getP_age() {
        return p_age;
    }

    public void setP_age(int p_age) {
        this.p_age = p_age;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }
}
