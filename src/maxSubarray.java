public class maxSubarray {

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];  // Store the maximum sum found
        int currentSum = nums[0];  // Track the current subArray sum

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]); // Extend or start a new subArray
            maxSum = Math.max(maxSum, currentSum); // Update max sum
        }

        return maxSum;

    }

    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1};
        int[] nums3 = {5, 4, -1, 7, 8};

        System.out.println(maxSubArray(nums1)); // Output: 6  (subArray: [4, -1, 2, 1])
        System.out.println(maxSubArray(nums2)); // Output: 1  (subArray: [1])
        System.out.println(maxSubArray(nums3)); // Output: 23 (subArray: [5, 4, -1, 7, 8])
    }
}