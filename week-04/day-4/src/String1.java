public class String1 {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.
    public static void main(String[] args) {
        System.out.println(xToY("xxxyyysaxayxxxx"));

    }

    public static String xToY(String s) {
        if (s.length() == 0) {
            return "";
        }
        if (s.charAt(0) == 'x') {
            return "y" + xToY(s.substring(1));
        } else {
            return s.charAt(0) + xToY(s.substring(1));
        }
    }
}
