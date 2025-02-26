import es.ulpgc.dacd.WordCounter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class WordCounterTest {
    @Test
    public void testUniqueWords() {
        WordCounter counter = new WordCounter();
        assertEquals(3, WordCounter.countUniqueWords("hello world hello"));
    }
}
