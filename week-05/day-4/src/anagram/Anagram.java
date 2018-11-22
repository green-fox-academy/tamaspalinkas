package anagram;

import java.util.Arrays;

public class Anagram {

  public boolean isAnagram(String input1, String input2) {
    if (input1.length() != input2.length()) {
      return false;
    } else {
      char[] inputArray1 = sort(input1);
      char[] inputArray2 = sort(input2);
      if (Arrays.equals(inputArray1, inputArray2)) {
        return true;
      } else {
        return false;
      }

    }
  }

  public static char[] sort(String input) {
    char[] inputArr = input.toCharArray();
    int n = inputArr.length;
    char temp;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < n - i; j++) {
        if (inputArr[j - 1] > inputArr[j]) {
          temp = inputArr[j - 1];
          inputArr[j - 1] = inputArr[j];
          inputArr[j] = temp;
        }
      }
    }
    return inputArr;
  }
}
