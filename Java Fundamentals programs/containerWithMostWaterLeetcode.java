public class containerWithMostWaterLeetcode {
    public int maxArea(int[] height) {
        int n = height.length;

        if (n == 0 || n == 1)
            return -1;

        int i = 0;
        int j = n - 1;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        while (i < j) {
            int diff = j - i;
            sum = height[i] < height[j] ? height[i++] : height[j--];

            sum *= diff;

            max = Math.max(max, sum);
        }

        return max;
    }
}
