//import java.util.Scanner;
//
//public class pyramid_type_Que {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number of rows: ");
//        int num = input.nextInt();
//
//        for (int i = 1; i <= num; i++) {
//            for (int j = 0; j < num-i ; j++) {
//                System.out.print("  ");
//            }
//            for (int k = 0; k < i; k++) {
//                System.out.print((i + k) + " ");
//            }
//            for (int l = i - 2; l >= 0; l--) {
//                System.out.print((i + l) + " ");
//            }
//
//            System.out.println();
//        }
//    }
//}


//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;

//public class pyramid_type_Que {
//    public static void main(String[] args) {
//       int arr[] = {2,6,4,5,7,9,8};
//       Arrays.sort(arr);
//       for(int i=0; i<arr.length; i++){
//           System.out.println(arr[i]);
//       }
//
//    }
//
//
//}

import java.util.*;
import java.util.Collections;
public class pyramid_type_Que {
    public static void main(String[] args) {
        Integer[] arr = {2,6,4,5,9,8};
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}


