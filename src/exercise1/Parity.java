package exercise1;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("your number: ");
            double Number = in.nextDouble();
            if (Number % 2 != 0) {
                System.out.println("число не четное");
            } else {
                System.out.println("число четное");
            }
        }
    }

}
