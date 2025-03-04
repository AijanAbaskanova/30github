public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) return false;

        // Step 1: Create a frequency counter for characters
        int[] count = new int[26]; // Since input contains lowercase letters only

        // Step 2: Count occurrences in s and decrement for t
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // Increment count for s
            count[t.charAt(i) - 'a']--; // Decrement count for t
        }

        // Step 3: If all counts are zero, it's an anagram
        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); // Output: true
        System.out.println(isAnagram("rat", "car")); // Output: false
    }
}

