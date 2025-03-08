import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true; // Duplicate found
            }
            seen.add(num);
        }
        return false; // No duplicates found
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 1};
        System.out.println(containsDuplicate(nums1)); // Output: true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums2)); // Output: false
    }
}

