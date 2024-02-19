public class gcdinleetcode {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8};
        System.out.println(checkGCD(arr));
    }

    public static int checkGCD(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > arr[max]){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        int gcd = -1;
        for(int i=1; i<=min; i++){
            if(max%i==0 && max%i==0){
                gcd = i;
            }
        }

      return gcd;


    }
}
