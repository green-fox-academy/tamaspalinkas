package countLetters;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {

  public Map<Character, Integer> returnDictionary(String inputString) {
    Map<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < inputString.length() ; i++) {
      char key = inputString.charAt(i);
      if (map.containsKey(key)) {
        int freq = map.get(key);
        freq++;
        map.put(key, freq);
      } else {
        map.put(key, 1);
      }
    }
    return map;
  }

}
