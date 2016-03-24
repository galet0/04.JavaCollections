import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by galeto on 24.03.16.
 */
public class _09_MostfrequentWord {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] text = scn.nextLine().toLowerCase().split("\\W+");
        TreeMap<String,Integer> mostFrequentWord = new TreeMap<>();
        int maxCounter = 0;

        for (String word : text) {
            Integer count = mostFrequentWord.get(word);
            if(count == null){
                count = 0;
            }
            if(count + 1 > maxCounter){
                maxCounter = count + 1;
            }
            mostFrequentWord.put(word,count + 1);
        }
        for (Map.Entry<String,Integer> max : mostFrequentWord.entrySet()) {
            if(max.getValue() == maxCounter){
                System.out.printf("%s -> %d times\n",max.getKey(),max.getValue());
            }

        }
    }
}
