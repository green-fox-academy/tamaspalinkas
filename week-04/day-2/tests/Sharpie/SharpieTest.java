package Sharpie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharpieTest {
  Sharpie sharpie;

  @BeforeEach
  void setUp() {
    sharpie = new Sharpie("black", 50);
  }

  @Test
  void useOnce() throws Exception {
    sharpie.use();
    assertEquals(99, sharpie.inkAmount);
  }

  @Test
  void useNone() {
    assertEquals(100, sharpie.inkAmount);
  }

  @Test
  void testUseMoreShouldThrowNoInk() {
    assertThrows(Exception.class, () -> {
      for (int i = 0; i < 200; i++) {
        sharpie.use();
      }
    });
  }
}