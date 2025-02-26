import es.ulpgc.dacd.WordCounter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordCounterTest {

    @Test
    void testPhraseWithRepeatedWords() {
        String phrase = "Hola mundo hola mundo";
        int result = WordCounter.countUniqueWords(phrase);
        assertEquals(2, result);
    }

    @Test
    void testEmptyPhrase() {
        String phrase = " ";
        int result = WordCounter.countUniqueWords(phrase);
        assertEquals(0, result);
    }

    @Test
    void testPhraseWithPunctuation() {
        String phrase = "¡Hola, mundo! Hola. Mundo?";
        int result = WordCounter.countUniqueWords(phrase);
        assertEquals(2, result);
    }
}

