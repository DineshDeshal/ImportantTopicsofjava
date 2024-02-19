import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,6,5};
        check(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void check(int[] arr) {
      int i=0;
      while(i< arr.length){
        int correct = arr[i] -1;
//        when arr  start  with 1 and go to n.....
          if(arr[i] != arr[correct]){
              swap(arr,i,correct);
          }else{
              i++;
          }
     }

    }
    public static void swap(int [] nums,int start,int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;

    }
}

// Que : Mising number (leetcode)

//public class CyclicSort {
//
//    public int missingNumber(int[] nums) {
//        int i=0;
//        while(i<nums.length){
//            int correct = nums[i];
//            if(nums[i]<nums.length && nums[i] != nums[correct]){
//                swap(nums,i,correct);
//            }else{
//                i++;
//            }
//        }
//        for(int index=0; index<nums.length; index++){
//            if(index!=nums[index]){
//                return index;
//            }
//        }
//        return nums.length;
//    }
//
//    void swap(int[] nums,int first,int last){
//        int temp = nums[first];
//        nums[first] = nums[last];
//        nums[last] = temp;
//    }
//}