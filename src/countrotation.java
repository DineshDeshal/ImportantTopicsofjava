public class countrotation {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,3};
        System.out.println(check(arr));
    }

    public static int check(int[] arr) {
        if(FindPivot(arr) == -1){
            return -1;
        }
        return FindPivot(arr) +1;
    }

    public static int FindPivot(int[] arr) {
        int i=0;
        int j = arr.length-1;
        while(i<j){
            int mid = i+(j-i)/2;
            if (mid< arr.length && arr[mid]>arr[mid+1]){
                return mid;
            } if(mid>=0 && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<arr[i]){
                i = mid +1;

            }else{
                j = mid -1;
            }
        }
        return -1;
    }
}