package Nov13.ocp;

public class Phonepay implements Fee_payment{
    public void payment(double amount){
        System.out.println("Fee amount of "+amount+" is paid using Phonepay");
    }
}
