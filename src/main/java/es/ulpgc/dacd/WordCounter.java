package es.ulpgc.dacd;
import java.util.HashSet;

public class WordCounter {
    public static int countUniqueWords(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return 0;
        }

        String[] words = phrase.toLowerCase().split("\\W+");
        HashSet<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                uniqueWords.add(word);
            }
        }

        return uniqueWords.size();
    }
}

