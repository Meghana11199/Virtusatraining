package Nov13.ocp;

public class Fee_main {
    public static void main(String[] args){
       Payment_process process=new Payment_process();
       Phonepay phonepay=new Phonepay();
       Paytm paytm=new Paytm();
       Googlepay googlepay=new Googlepay();
       process.fee_pay(10000,phonepay);
       process.fee_pay(20000,googlepay);
        process.fee_pay(20000,paytm);


    }
}
