package cowsAndBulls;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CABTest {
  CAB cab;
  int[] zeroArray;

  @BeforeEach
  void setUp() {
    cab = new CAB();
    zeroArray = new int[4];
  }

  @Test
  void guess() {
    //TODO implement test for guess
  }

  @Test
  void constructor() {
    assertEquals("finished", cab.gameState);
    assertNotEquals(zeroArray, cab.randomNums);
  }
}