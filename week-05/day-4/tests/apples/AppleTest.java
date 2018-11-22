package apples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {
  private Apple apple;

  @BeforeEach
  void setUp() {
    apple = new Apple();
  }

  @Test
  void getApple() {
    assertEquals("apple", apple.getApple());
  }
}