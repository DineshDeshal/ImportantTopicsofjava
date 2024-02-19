public class recursionlinearsearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 8, 9};
        int target = 9;
        System.out.println(check(arr, target, 0));
    }

    public static int check(int[] arr, int target, int index) {
        if (index >= arr.length) {
            // Base case: index is out of bounds
            return -1;
        }

        if (arr[index] == target) {
            // Element found, return the index
            return index;
        }

        // Recursively check the rest of the array
        return check(arr, target, index + 1);
    }
}
