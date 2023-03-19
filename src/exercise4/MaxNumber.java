package exercise4;

import java.util.Random;

public class MaxNumber {
    public static void main(String[] args){

        Random randomizer = new Random();
        int randomNumber = randomizer.nextInt(900) + 100;
        System.out.printf("рандомное число: %d\n",randomNumber);

        int j = 0;
        int A = randomNumber;

        while (A > 0){
             A = A / 10;
            ++j;
        }

        int numberMax = 0;
        for(int i = j; i > 0; i--) {
            if(numberMax <= randomNumber % 10) {
                numberMax = randomNumber % 10;
            }
            randomNumber = randomNumber / 10;
        }
        System.out.printf("наибольшее число: %d",numberMax);
    }
}
