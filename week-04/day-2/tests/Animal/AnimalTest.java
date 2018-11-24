package Animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
  Animal animal;

  @BeforeEach
  void setUp() {
    animal = new Animal();
  }

  @Test
  void eatShoudThrowException() {
    assertThrows(Exception.class,
            () -> {
              for (int i = 0; i < 100; i++) {
                animal.eat();
              }
            });
  }

  @Test
  void drinkShouldThrowException() {
    assertThrows(Exception.class,
            () -> {
              for (int i = 0; i < 100; i++) {
                animal.drink();
              }
            });
  }
}