import java.util.*;


public class _08_ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] text = scn.nextLine().toLowerCase().split("\\W+");
        TreeSet<String> words = new TreeSet<>();
        for (String word : text) {
            words.add(word);
        }
        TreeSet<String> outputList = new TreeSet<>(words);
        for (String s : outputList) {
            System.out.print(s + " ");
        }
    }
}
