package Nov13.ocp;

public class Googlepay implements Fee_payment{
    public void payment(double amount){
        System.out.println("Fee amount of "+amount+" is paid using Googlepay");
    }
}
