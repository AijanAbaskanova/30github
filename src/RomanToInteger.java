import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        // Step 1: Create a map to store Roman numeral values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0; // Final result
        int prevValue = 0; // Store the previous numeral value

        // Step 2: Iterate through the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanMap.get(s.charAt(i));

            // Step 3: Apply subtraction rule
            if (currValue < prevValue) {
                total -= currValue; // Subtract if smaller value comes before a larger one
            } else {
                total += currValue; // Otherwise, just add the value
            }

            prevValue = currValue; // Update the previous value
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));     // Output: 3
        System.out.println(romanToInt("IV"));      // Output: 4
        System.out.println(romanToInt("IX"));      // Output: 9
        System.out.println(romanToInt("LVIII"));   // Output: 58
        System.out.println(romanToInt("MCMXCIV"));// Output: 1994
    }
}

