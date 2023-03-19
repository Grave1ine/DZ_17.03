package exercise10;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("your number: ");
        double A = in.nextDouble();
        double B = 1;
        for(int i = 1; i <= A ; i++){
            B = B * i;
        }
        System.out.printf("factorial = %.2f ", B);
    }
}
