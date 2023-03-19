package exercise7;

public class Continuity {
    public static void main(String[] args){
        int A = 1;
        int i;
        for( i = 0; i < 50; i ++){
            System.out.printf("Number: %d\n", A);
            A += 2;
        }
        System.out.printf("iteration: %d\n", i);
    }
}
