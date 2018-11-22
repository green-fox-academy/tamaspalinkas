package anagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
  private String input1;
  private String input2;
  Anagram anagram;

  @BeforeEach
  void setUp() {
    anagram = new Anagram();
  }

  @Test
  void isAnagram() {
    input1 = "anagram";
    input2 = "margana";
    assertEquals(true, anagram.isAnagram(input1, input2));
  }

  @Test
  void sort() {
  }
}