class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;  
            }
        }
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                if (nums[num - 1] > 0) {
                    nums[num - 1] = -nums[num - 1];  
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;  
            }
        }
        return n + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 0};
        System.out.println(solution.firstMissingPositive(nums1)); 
        int[] nums2 = {3, 4, -1, 1};
        System.out.println(solution.firstMissingPositive(nums2)); 
        int[] nums3 = {7, 8, 9, 11, 12};
        System.out.println(solution.firstMissingPositive(nums3)); 
    }
}