public class String3 {
    // Given a string, compute recursively a new string where all the
    // adjacent chars are now separated by a "*".
    public static void main(String[] args) {
        System.out.println(separate("Pleaseseparatethis"));
    }

    public static String separate(String s) {
        if (s.length() == 0) {
            return "";
        }
        return s.charAt(0) + "*" + separate(s.substring(1));
    }
}
