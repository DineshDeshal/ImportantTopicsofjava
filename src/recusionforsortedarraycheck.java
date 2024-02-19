public class recusionforsortedarraycheck {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,74,8};

        System.out.println(check(arr,0));
    }

    public static boolean check(int[] arr,int index) {
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && check(arr,index+1);

    }
}
