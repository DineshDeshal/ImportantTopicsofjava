public class bubbleSorting {
    public static void main(String[] args) {
        int[] arr = {12,34,5,67,8,9};
        check(arr);
    }

    public static void check(int[] arr)  {
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
