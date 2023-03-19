package exercise13;

public class Fibonacci {

        public static void main(String[] args)
        {
            int maxNumber = 11;
            int previousNumber = 0;
            int nextNumber = 1;

            System.out.print("Fibonacci series of " + maxNumber +" numbers:");

            for (int i = 1; i <= maxNumber; ++i)
            {
                System.out.print(previousNumber+" ");
                int sum = previousNumber + nextNumber;
                previousNumber = nextNumber;
                nextNumber = sum;
            }
        }
    }

