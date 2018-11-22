package extension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(a);
    numbers.add(b);
    numbers.add(c);

    return Collections.max(numbers);

  }

  double median(List<Integer> pool) {
    Collections.sort(pool);
    if (pool.size() % 2 == 0) {
      int index1 = pool.size() / 2;
      int index2 = (pool.size() - 1) / 2;
      return (double) (pool.get(index1) + pool.get(index2)) / 2;
    } else {
      return pool.get((pool.size()) / 2);
    }
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(Character.toLowerCase(c));
  }

  String translate(String hungarian) {
    String translated = "";
    int length = hungarian.length();
    for (int i = 0; i < length; i++) {
      char c = hungarian.charAt(i);
      if (isVowel(c)) {
        translated += c + "v" + c;
      } else {
        translated += c;
      }
    }
    return translated;
  }
}