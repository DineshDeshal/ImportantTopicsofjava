import java.util.Arrays;

public class findfirstandlastAoccuranceinarray {
    public static void main(String[] args) {
        int target = 12;
        int nums[] = {23, 45, 12, 457, 67, 79, 86, 12};
        int[] result = findFirstAndLast(nums, target);
        System.out.println("First occurrence: " + result[0]);
        System.out.println("Last occurrence: " + result[1]);
    }

    public static int[] findFirstAndLast(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = findFirst(nums, target);
        ans[1] = findLast(nums, target);
        return ans;
    }

    public static int findFirst(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int first = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                first = mid;
                end = mid - 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return first;
    }

    public static int findLast(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int last = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                last = mid;
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return last;
    }
}

