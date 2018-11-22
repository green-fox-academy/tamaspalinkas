package countLetters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {
  CountLetters countLetters;

  @BeforeEach
  void setUp() {
    countLetters = new CountLetters();
  }

  @Test
  void returnDictionary() {
    HashMap<Character, Integer> testMap = new HashMap<>();
    testMap.put('a', 2);
    testMap.put('b', 2);
    testMap.put('c', 2);
    String s = "aabbcc";
    assertEquals(testMap, countLetters.returnDictionary(s));
  }
}