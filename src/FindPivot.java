public class FindPivot {
    public static void main(String[] args) {
int arr[] ={4,5,6,1,2,3};
        System.out.println(check(arr));
    }

    public static int check(int[] arr) {
        int s=0;
        int e = arr.length-1;
        while(s<=e){
          int mid = s+(e-s)/2;

           if( mid<e && arr[mid]>arr[mid+1]){
              return mid;// {11,13,16,1,2,3,8}
          }if ( mid>s && arr[mid]<arr[mid-1]){
               return mid-1;//{4,5,1,2,3} here mid is 1; and 1<6;

          }if(arr[s]>=arr[mid]){
               e = mid -1;
            }else{
               s = mid+1;
            }
        }
return -1;
    }
}
