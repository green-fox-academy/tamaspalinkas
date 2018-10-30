public class Colors {
    // - Create a two dimensional array
    //   which can contain the different shades of specified colors
    // - In `colors[0]` store the shades of green:
    //   `"lime", "forest green", "olive", "pale green", "spring green"`
    // - In `colors[1]` store the shades of red:
    //   `"orange red", "red", "tomato"`
    // - In `colors[2]` store the shades of pink:
    //   `"orchid", "violet", "pink", "hot pink"`
    public static void main(String[] args) {
        String[][] shades = new String[3][6];
        shades[0][0] = "green";
        shades[1][0] = "red";
        shades[2][0] = "pink";

        shades[0][1] = "lime";
        shades[0][2] = "forest green";
        shades[0][3] = "olive";
        shades[0][4] = "pale green";
        shades[0][5] = "spring green";

        shades[1][1] = "orange red";
        shades[1][2] = "red";
        shades[1][3] = "tomato";

        shades[2][1] = "orchid";
        shades[2][2] = "violet";
        shades[2][3] = "pink";
        shades[2][4] = "hot pink";

        for (int i=0; i<3; i++) {
            for (int j=0; j<6; j++) {
                System.out.print(shades[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
