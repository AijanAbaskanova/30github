public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        s = s.trim(); // Remove trailing spaces
        int lastSpaceIndex = s.lastIndexOf(' ');
        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        String s = "Hello World  ";
        System.out.println(lengthOfLastWord(s)); // Output: 5
    }
}

