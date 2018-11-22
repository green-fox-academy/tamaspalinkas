package fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
  Fibonacci fibonacci;

  @BeforeEach
  void setUp() {
    fibonacci = new Fibonacci();
  }

  @Test
  void fibonacci() {
    assertEquals(3, fibonacci.fibonacci(4));
  }

  @Test
  void fibonacciNegativeInput() {
    assertEquals(-1, fibonacci.fibonacci(-5));
  }

  @Test
  void fibonacciZeroInput() {
    assertEquals(0, fibonacci.fibonacci(0));
  }

}