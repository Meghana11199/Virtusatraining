package Nov13;

import java.util.Scanner;

public class Num_to_Roman {
    public static String toRoman(int num){
        if(num<1 || num>9999){
            System.out.println("Number should be in range of 1-9999");
        }
        String[] roman_symbols={"M","CM","D","CD","C","XC","L",
                                 "XL","X","IX","V","IV","I"};
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};

        StringBuilder roman_number=new StringBuilder();

        for(int i=0;i<values.length;i++){
            while(num>=values[i]){
                num-=values[i];
                roman_number.append(roman_symbols[i]);

            }
        }
        return roman_number.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        String result=toRoman(num);
        System.out.println("Roman Number is : "+result);

    }
}
