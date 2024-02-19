public class RotatedBinerySearch {
    public static void main(String[] args) {
int[] arr = {7,6,5,1,2,3,4};
        System.out.println(Findpivot(arr));
    }
    static int  Findpivot(int[] arr){
        int s =0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            // there are four case for pivot
            // pivot is element thats next elements is Ascending order and privious element in Descading

            if( mid<e && arr[mid]>arr[mid+1]){
                return  mid;
            } if( mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            } if(arr[mid]<=arr[s]){
                e = mid -1;
            } else{
                s = mid+1;
            }

        }
        return -1;
    }
}
