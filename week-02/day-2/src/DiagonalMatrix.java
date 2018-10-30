import java.util.Arrays;

public class DiagonalMatrix {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output
    public static void main(String[] args) {
        int n = 4;
        int [][] arrayMatrix = new int[n][n];

        for (int i=0; i<n; i++) {
            arrayMatrix[i][i] = 1;
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(arrayMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
