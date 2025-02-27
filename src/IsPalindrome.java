public class IsPalindrome {
        public static boolean isPalindrome(int x) {
            // Negative numbers and numbers ending in 0 (except 0 itself) are not palindromes
            if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }

            int reversedHalf = 0;
            while (x > reversedHalf) {
                reversedHalf = reversedHalf * 10 + x % 10;
                x /= 10;
            }

            // Check if first half matches second half (odd-length numbers are handled by removing middle digit)
            return x == reversedHalf || x == reversedHalf / 10;
        }

        public static void main(String[] args) {
            System.out.println(isPalindrome(121));  // true
            System.out.println(isPalindrome(-121)); // false
            System.out.println(isPalindrome(10));   // false
            System.out.println(isPalindrome(1221)); // true
        }
}
