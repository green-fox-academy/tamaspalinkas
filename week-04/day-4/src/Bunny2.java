public class Bunny2 {
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
    // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
    // have 3 ears, because they each have a raised foot. Recursively return the
    // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
    public static void main(String[] args) {
        System.out.println(totalEars(10));
    }
    public static int totalEars(int bunnies) {
        if (bunnies == 1) {
            return 2;
        }
        if (bunnies % 2 == 0) {
            return 3 + totalEars(bunnies - 1);
        } else {
            return 2 + totalEars(bunnies - 1);
        }
    }
}