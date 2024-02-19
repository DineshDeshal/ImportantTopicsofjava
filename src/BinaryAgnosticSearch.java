public class BinaryAgnosticSearch {
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,6,7,8};
         int target = 8;
        System.out.println(check(arr,target));
    }

    public static int check(int[] arr,int target) {
        int s =0;
        int e = arr.length-1;
        boolean isascending = arr[s]<arr[e];
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isascending){
                if(arr[mid]>target){
                    e = mid - 1;
                }else{
                    s = mid +1;
                }
            }
            else{
                if(arr[mid]<target){
                    e = mid - 1;
                }else{
                    s = mid +1;
                }
            }

        }

      return -1;
    }
}


