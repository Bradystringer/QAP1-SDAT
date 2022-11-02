package WordCompare;

import org.example.WordCompare;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCompareTest {
    @Test
    public void WordCompareTest() {
        WordCompare wordCompare = new WordCompare();

        Assertions.assertTrue(wordCompare.findWordCompare("find", "is_find_in_this_sentence"));

        Assertions.assertTrue(wordCompare.findWordCompare("hello", "Oh_hello_there!"));

        Assertions.assertTrue(wordCompare.findWordCompare("moose", "Am_I_going_to_get_my_moose_this_weekend?"));
    }
    @Test
    public void WordCompareTest2() {
        WordCompare wordCompare = new WordCompare();

        Assertions.assertTrue(wordCompare.findWordCompare("Brady", "Hello_my_name_is_Brady!"));

        Assertions.assertTrue(wordCompare.findWordCompare("java", "This_is_write_in_java!"));

        Assertions.assertTrue(wordCompare.findWordCompare("rabbit", "Am_I_going_to_get_any_rabbit_this_weekend?"));
    }
    @Test
    public void WordCompareTest3() {
        WordCompare wordCompare = new WordCompare();

        Assertions.assertTrue(wordCompare.findWordCompare("cabin", "Long_weekend_at_the_cabin!"));

        Assertions.assertTrue(wordCompare.findWordCompare("cya", "Okay_cya_later!"));

        Assertions.assertTrue(wordCompare.findWordCompare("grouse", "Will_I_see_any_grouse_this_weekend?"));
    }
}

