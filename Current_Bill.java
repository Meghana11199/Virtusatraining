package Nov12;

import java.util.Scanner;

public class Current_Bill {
    public static double calculate_bill(double units){
        double bill=0;
        double rate;
        if (units <= 90) {
            rate = 1.0;
            bill = units * rate;
        }

        if (units > 90) {
            rate = 1.0;
            bill = 90 * rate;
            if (units - 150 >= 0) {
                rate = 1.5;
                bill = bill + (60 * rate);
            } else {
                rate = 1.5;
                bill =bill + (units - 90) * rate;
            }
        }

        if (units > 150) {
            rate = 2.0;
            if (units - 200 >= 0) {
                bill = bill + (50 * rate);
            } else {
                bill = bill + (units - 150) * rate;
            }
        }

        if (units > 200) {
            rate = 2.5;
            if (units - 240 >= 0) {
                bill= bill + (40 * rate);
            } else {
                bill = bill + (units - 200) * rate;
            }
        }

        if (units > 240) {
            rate = 3.0;
            bill = bill+ (units - 240) * rate;
        }
        return bill;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter units : ");
        Double units=sc.nextDouble();
        System.out.println("The Current is Bill : "+calculate_bill(units));

    }
}
