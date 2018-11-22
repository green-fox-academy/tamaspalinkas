package sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
  Sum sum;
  ArrayList<Integer> arrayList;

  @BeforeEach
  void setUp() {
    sum = new Sum();
    arrayList = new ArrayList<>();

  }


  @Test
  void sumElements() {
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);
    assertEquals(6, sum.sumElements(arrayList));
  }

  @Test
  void sumElementsEmpty() {
    assertEquals(0, sum.sumElements(arrayList));
  }

  @Test
  void sumElementsOneElement() {
    arrayList.add(2);
    assertEquals(2, sum.sumElements(arrayList));
  }

  @Test
  void sumElementsNull() {
    assertThrows(NullPointerException.class,
            () -> {
              sum.sumElements(null);
            });
  }


}