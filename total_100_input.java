import java.util.Scanner;

public class total_100_input {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int i, sum=0, x;
        double AVG;
        for(i=1; i<=100; i++){
            System.err.printf("\nEnter Number %d",i);
            x = input.nextInt();
            sum += x
        }
        AVG = sum / 100;
        System.err.printf("sum=%d, AVG=%5.2f", sum, AVG);
    }
}