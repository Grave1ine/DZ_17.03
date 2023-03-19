package exercise2;

import java.util.Scanner;

public class Nearest {
     public static void main(String[] args) {

         Scanner in = new Scanner(System.in);
         int Number = 10;
         while (true) {
             System.out.print("Number A: ");
             double A = in.nextDouble();
             System.out.print("Number B: ");
             double B = in.nextDouble();

             if (Math.abs(Number - A) < Math.abs(Number - B)) {
                 System.out.printf("Число: %.2f ближе к 10 \n", A);
             } else {
                 System.out.printf("Число: %.2f ближе к 10 \n", B);
             }

         }
     }
}
