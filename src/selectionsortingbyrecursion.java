import java.util.Arrays;

public class selectionsortingbyrecursion {
    public static void main(String[] args) {
        int[] arr = {12,3,44,55,66,76,8,4,34};

        check(arr, arr.length, 0,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void check(int[] arr,int r,int c,int max) {
        if(r==0){
            return ;
        }
      if(r>c){
          if(arr[c]>arr[max]){
              check(arr,r,c+1,c);
          }else{
              check(arr,r,c+1,max);
          }
      }else{
          int temp = arr[max];
          arr[max] = arr[r-1];
          arr[r-1] = temp;
          check(arr,r-1,0,max);
      }
    }
}
