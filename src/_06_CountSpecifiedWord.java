import java.util.Scanner;


public class _06_CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] text = scn.nextLine().split("\\W+");
        String targetWord = scn.nextLine();
        int counter = 0;
        for (int i = 0; i < text.length; i++) {
            if(text[i].toLowerCase().equals(targetWord)){
                counter++;
            }

        }
        System.out.println(counter);
    }
}
