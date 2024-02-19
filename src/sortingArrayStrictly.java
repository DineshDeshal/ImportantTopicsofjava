public class sortingArrayStrictly {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,7};
        System.out.println(check(arr,0));
    }

    public static boolean check(int arr[], int ind) {
        if(ind== arr.length-1){
            return true;
        }
        if(arr[ind]>=arr[ind+1]){
            return false;
        }
        return check(arr,ind+1);
    }
}
