package exercise5;

import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("А = ");
        int A = in.nextInt();
        System.out.print("B = ");
        int B = in.nextInt();
        System.out.print("C = ");
        int C = in.nextInt();
        int Temp = 0;
        if(A > B) {
            Temp = A;
            A = B;
            B = Temp;
        }
            if (A > C){
                Temp = A;
                A = C;
                C = Temp;
            }

        if (C < B) {
            Temp = B;
            B = C;
            C = Temp;
        }


        System.out.printf("A:%d\n", A);
        System.out.printf("B:%d\n", B);
        System.out.printf("C:%d\n", C);
    }

    }

