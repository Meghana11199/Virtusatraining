package Nov13;

import java.util.*;

public class Multiplcation {
    public static String mul(String number1,String number2){
        if(number1.length()==0 && number2.length()==0){
            return "0";
        }
        int len1=number1.length();
        int len2=number2.length();
        int[] res=new int[len1+len2];
        for(int i=len1-1;i>=0;i--){
            int num1=number1.charAt(i)-'0';
            for(int j=len2-1;j>=0;j--){
                int num2=number2.charAt(j)-'0';
                int sum=num1*num2+res[i+j+1];
                res[i+j+1]=sum%10;
                res[i+j]+=sum/10;
            }
        }
        StringBuilder output=new StringBuilder();
       for(int op:res){
           if(op!=0){
               output.append(op);
           }
       }
        return output.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1 : ");
        String number1=sc.next();
        System.out.println("Enter number2 : ");
        String number2=sc.next();
        String multiplication=mul(number1,number2);
        System.out.println("Multiplcation of 2 numbers is : "+ multiplication);



    }
}
