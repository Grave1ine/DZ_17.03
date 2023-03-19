package exercise6;


public class Consistency {
    public static void main(String[] args){
        int A = 1000;

        while(A < 10000) {
            System.out.printf("Number: %d\n", A);
            A += 3;
        }
    }
}
