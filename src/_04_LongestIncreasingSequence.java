import java.util.Scanner;

/**
 * Created by galeto on 24.03.16.
 */
public class _04_LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] inputLine = scn.nextLine().split(" ");
        int[] numbers = new int[inputLine.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputLine[i]);
        }
        int counter = 1;
        int maxCounter = 1;
        int index = 0;
        System.out.print(numbers[0]);
        for (int i = 1; i < inputLine.length; i++) {
            if(numbers[i] > numbers[i-1]){
                counter++;
                System.out.print(" " + numbers[i]);
            } else {
                counter = 1;
                System.out.println();
                System.out.print(numbers[i] + " ");
            }
            if(counter > maxCounter){
                maxCounter = counter;
                index = i;
            }

        }
        System.out.println();
        System.out.print("Longest: ");
        for (int i = 0; i < maxCounter; i++) {
            System.out.print(inputLine[index - maxCounter + 1 + i] + " ");
        }

    }
}
