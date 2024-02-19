
public class reverseaarray {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        rotate(nums1, k1);
        printArray(nums1);

        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        rotate(nums2, k2);
        printArray(nums2);
    }

    public static void rotate(int[] nums, int k) {
        // Handle cases where k is greater than the array length
        k = k % nums.length;

        // Reverse the entire array
        reverse(nums, 0, nums.length - 1);

        // Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining elements
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
