import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class _10_CardsFrequences {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] cards = scn.nextLine().split("\\W+");
        Map<String,Integer> frequences = new LinkedHashMap<>();
        for (String card : cards) {
            if(frequences.containsKey(card)){
                frequences.put(card,frequences.get(card) + 1);
            } else {
                frequences.put(card,1);
            }
        }
        DecimalFormat formatter = new DecimalFormat("#0.00");
        for (Map.Entry<String,Integer> face : frequences.entrySet()) {
            System.out.println(face.getKey() + " -> " + formatter.format((double)face.getValue() * 100 / cards.length) + "%");
        }

    }
}
