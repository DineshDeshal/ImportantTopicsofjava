//public class binarysearch {
//    public static void main(String[] args) {
//        int arr[] = {12,34,65,646787,2,43452,98,1215};
//        int target = 2;
//
//        System.out.println(check(arr,target));
//    }
//    public static int check(int[] arr,int target){
//        int start = 0;
//        int last = arr.length-1;
//        while(start<=last){
//           int mid = start+(last-start)/2;
//           if(arr[mid]>target){
//              last = mid -1;
//           }else if(arr[mid]<target){
//                start = mid+1;
//           }else{
//               return mid;
//           }
//        }
//        return -1;
//    }
//}


class Solution {
    public int missingInteger(int[] nums) {
        int prefix =0;
        int sum =0;
        int result =0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]+1){

                prefix = i-1;
                for(int j=0; j<=i-1; j++){
                    sum += nums[j];
                }
            }
        }
        for(int p=0; p<nums.length; p++){
            if(nums[p] != sum){
                result = sum;
            }
        }
        return result;
    }
}