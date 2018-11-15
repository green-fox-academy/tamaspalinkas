public class Bunny1 {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    public static void main(String[] args) {
        System.out.println(totalEars(6));
    }

    public static int totalEars(int bunnies) {
        if (bunnies == 1) {
            return 2;
        }
        return 2 + totalEars(bunnies - 1);
    }
}
