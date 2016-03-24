import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by galeto on 24.03.16.
 */
public class _07_CombineListOfLetters {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] firstLine = scn.nextLine().split(" ");
        String[] secondLine = scn.nextLine().split(" ");
        ArrayList<Character> first = new ArrayList<>();
        ArrayList<Character> second = new ArrayList<>();

        for (String s : firstLine) {
            first.add(s.charAt(0));
        }
        for (String s : secondLine) {
            second.add(s.charAt(0));
        }
        second.removeAll(first);
        first.addAll(second);
        for (Character character : first) {
            System.out.print(character + " ");
        }
    }
}
