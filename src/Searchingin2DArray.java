//import javax.xml.stream.XMLInputFactory;
//
//public class Searchingin2DArray {
//    public static void main(String[] args) {
//        int array[][] = {{1, 2, 3}, {2, 3, 4}, {5, 6, 8}};
//        int target = 6;
//        int result[] = check(array, target);
//        System.out.println("Row: " + result[0] + ", Column: " + result[1]);
//    }
//
//    public static int[] check(int[][] array, int target) {
//        int arr[] = {-1, -1};
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return arr;
//    }
//}


import java.util.Arrays;

// 2D array in sorted form
public class Searchingin2DArray {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 4;

        System.out.println(Arrays.toString(check(array,target)));
    }

    public static int[]  check(int[][] array,int target) {
        int row = 0;
        int col = array.length-1;
        int arr[] = {-1,-1};
         while(row<array.length && col>=0){
        if(array[row][col]==target){
            return new int[]{row,col};
        }
        if(array[row][col]<target){
            row++;
        }else{
            col--;
        }

    }
        return arr;
}}