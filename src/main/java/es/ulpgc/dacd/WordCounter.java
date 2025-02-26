package es.ulpgc.dacd;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordCounter {
    public static int countUniqueWords(String phrase) {
        if (phrase == null || phrase.isBlank()) {
            return 0;
        }

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(phrase.toLowerCase().split("\\W+")));
        uniqueWords.removeIf(String::isBlank);  // Elimina cadenas vacías si las hay

        return uniqueWords.size();
    }
}

