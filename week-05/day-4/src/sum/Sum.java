package sum;

import java.util.ArrayList;

public class Sum {
  public int sumElements(ArrayList<Integer> arrayList) {
    if (arrayList.isEmpty()) {
      return 0;
    }
    if (arrayList.size() == 1) {
      return arrayList.get(0);
    }
    int sum = 0;
    for (int item : arrayList) {
      sum += item;
    }

    return sum;
  }
}

