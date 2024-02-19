//import java.util.Arrays;
//
//public class firstarraysortandsquareofalleleents {
//    public static void main(String[] args) {
//        int [] arr1 = {1,2,4,6,-7,8};
//        System.out.println(check1(arr1));
//    }
//
//    public static int[] check1(int[] arr1) {
//        int[] arr = new int[arr1.length];
//        int n = arr1.length;
//        int a = 0;
//        int b = arr1.length-1;
//
//        for(int k=n-1; k>=0; k--){
//            int comp1 = arr1[a]*arr1[a];
//            int comp2 = arr1[b]*arr1[b];
//            if(comp1>comp2){
//                arr[k] = comp1;
//                a++;
//            }else{
//                arr[k] = comp2;
//                b--;
//            }
//        }
//
//      return arr;
//
//    }
//}
