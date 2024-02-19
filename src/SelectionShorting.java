public class SelectionShorting {
    public static void main(String[] args) {
        int arr[] = {12,43,32,54,3,5,344};
        int max = 0;

        for(int i=0; i< arr.length-1; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[max]>arr[j]){
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[max];
            arr[max]=temp;
        }
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
