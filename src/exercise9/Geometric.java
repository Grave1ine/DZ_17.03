package exercise9;

public class Geometric {
    public static void main(String[] args){
        int A = 2;
        int i;
        for (i = 0; i < 20; i++){
            System.out.printf("Number: %d\n", A);
            A *= 2;
        }
        System.out.printf("iteration: %d\n", i);
    }
}
