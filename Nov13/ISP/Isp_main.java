package Nov13.ISP;

public class Isp_main {
    public static void main(String[] args){
        Work hum_work=new Human();
        Work rob_work=new Robot();
        Eat hum_eat=new Human();
        hum_work.working();
        hum_eat.eating();
        rob_work.working();
    }
}
