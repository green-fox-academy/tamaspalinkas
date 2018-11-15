public class String2 {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.
    public static void main(String[] args) {
        System.out.println(removeX("xxxxxyyyywadwawzyyy"));
    }

    public static String removeX(String s) {
        if (s.length() == 0) {
            return "";
        }
        if (s.charAt(0) == 'x') {
            return removeX(s.substring(1));
        } else {
            return s.charAt(0) + removeX(s.substring(1));
        }
    }
}
