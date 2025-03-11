import java.util.HashSet;

public class FirstRepeated {
    public static char repeatedCharacter(String s) {
        HashSet<Character> seen = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                return c; // First repeated character
            }
            seen.add(c);
        }

        return ' '; // This should never happen as per the problem statement
    }

    public static void main(String[] args) {
        System.out.println(repeatedCharacter("abccbaacz"));  // Output: 'c'
        System.out.println(repeatedCharacter("abcdd"));  // Output: 'd'
    }
}
