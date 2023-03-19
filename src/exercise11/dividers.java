package exercise11;

import java.util.Scanner;

public class dividers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("число: ");
        int A = in.nextInt();
        int counter = 0;
        System.out.print("делится на:");
        for(int i = 1; i <= A; i++){
            if((A % i) == 0){
                counter++;
                System.out.print(i + " ");
            }
        }
        System.out.println(". кол во делителей " + counter);
    }
}
