public class ceilinginbinary {
    public static void main(String[] args) {
        int[] arr = {21,34,51,6667,8987};
        int target = 35;
        int ans = check(arr,target);
        System.out.println(ans);
    }

    public static int check(int [] arr,int target) {
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<target){
                start = mid +1;
            }else if(arr[mid]>target){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return arr[end];

    }
}
