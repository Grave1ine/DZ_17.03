package exercise3;

import java.util.Random;

public class RandomHit {

    public static void main(String[] args) {

            Random randomizer = new Random();
            int randomNumber = randomizer.nextInt(151) + 5;

            if (100 >= randomNumber && randomNumber >= 25) {
                System.out.printf("число %d входит в диапазон [25;100]\n", randomNumber);
            } else {
                System.out.printf("число %d не входит в диапазон [25;100]\n", randomNumber);
            }
            }
    }

