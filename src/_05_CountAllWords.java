import java.util.Scanner;


public class _05_CountAllWords {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] input = scn.nextLine().split("\\W+");
        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            counter++;
        }
        System.out.println(counter);

        //or
        //System.out.println(input.length);
    }
}
