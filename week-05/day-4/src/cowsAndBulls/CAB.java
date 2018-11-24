package cowsAndBulls;

public class CAB {
  int[] guessedNums;
  int[] randomNums;
  String gameState;
  int counter;


  private void generateNumbers() {
    int[] numbers = new int[4];

    for (int i = 0; i < 4; i++) {
      numbers[i] = (int) (Math.random() * 10);
    }

    randomNums = numbers;
  }

  public String guess(int a, int b, int c, int d) {
    counter++;
    gameState = "playing";
    String cows = "";
    String bulls = "";
    guessedNums = new int[]{a, b, c, d};

    for (int i = 0; i < randomNums.length; i++) {
      for (int j = 0; j < guessedNums.length; j++) {
        if (guessedNums[j] == randomNums[i]) {
          if (j == i) {
            cows += "cow ";
          } else {
            bulls += "bull ";
          }
        }
      }
    }
    return cows + bulls;
  }

  public CAB() {
    generateNumbers();
    gameState = "finished";
  }

}
