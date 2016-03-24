import java.util.Scanner;

public class _02_SequencesOfEqualStrings {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String[] input = scn.nextLine().split(" ");

        System.out.print(input[0]);
        for (int i = 1; i < input.length; i++) {
            if(input[i].equals(input[i-1])){
                System.out.print(" " + input[i]);
            } else {
                System.out.println();
                System.out.print(input[i] + " ");
            }
        }
    }
}
