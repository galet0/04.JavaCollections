import java.util.Scanner;

/**
 * Created by galeto on 24.03.16.
 */
public class _12_CalculateNFactorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.println(calculateFactorial(number));

    }
    public static int calculateFactorial(int n){
        if(n == 0 || n == 1){
            return 1;
        } else {
            return n * calculateFactorial(n-1);
        }
    }
}
