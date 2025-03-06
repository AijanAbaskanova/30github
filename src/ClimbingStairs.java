public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int first = 1, second = 2, result = 0;

        for (int i = 3; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2)); // Output: 2
        System.out.println(climbStairs(3)); // Output: 3
        System.out.println(climbStairs(5)); // Output: 8
        System.out.println(climbStairs(10)); // Output: 89
    }
}

