//public class Main2{
//    public static void main(String args[]){
//        System.out.println("hello world ");
//    }
//}

//import java.util.*;
//public class Main2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        for(int i=2; i<num; i++){
//            if(CheckPrime(i)){
//                System.out.print(i+"   ");
//            }
//        }
//
//    }
//  public static boolean CheckPrime(int a){
//        for(int i=2; i<a; i++) {
//            if (a % i == 0) {
//                return false;
//
//            }
//        }
//      return true;
//    }
//}

//public class Main2{
//    public static void main(String args[]){
//        int num = 5;
//        int fac = 1;
//        for(int i =1; i<=num; i++){
//            fac = fac * i;
//        }
//        System.out.println(fac);
//    }
//}
//
//    This will produce the following output: Hello World!1.
//
//        Format specifiers include flags, width, precision, and conversion characters in this sequence: %[flags][width][.precision]conversion-character1. Some common conversion characters are:
//
//        s formats strings.
//        d formats decimal integers.
//        f formats floating-point numbers.
//        t formats date/time values1.
//        Internally, printf() uses the java.util.Formatter class to parse the format string and generate the output12.


// how to sort a array
//
//import org.w3c.dom.ls.LSOutput;
////
//import javax.sound.sampled.EnumControl;
//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//public class Main2 {
//  public static void main(String[] args) {
//
//        Integer[] array = {1,2,43,5,6,7};
//
//
//          Arrays.sort(array);
//
//      System.out.println("Elements of array sorted in ascending order: ");
//
//       // Printing the sorted array using a for loop
//      for (int i = 0; i < array.length; i++) {
//          System.out.println(array[i]);
//        }
//    }
//}

//public class Main2 {
//    public static void main (String args[]){
//       int[] array = new int[]{1,4,3,2,5,7,4} ;
//        Arrays.sort(array);
//        for(int i = 0; i< array.length; i++){
//            System.out.println(array[i]);
//        }
//    }
//}
//import java.util.*;
//public class Main2 {
//    public static void main(String args[]) {
//    int[] arr = new int[]{2,6,5,4,7,89};
//        Arrays.sort(arr);
//        for(int i = arr.length-1; i>=0; i--){
//            System.out.print(arr[i]+ " ");
//        }
//    }
//}


//import java.util.*;
//
//public class Main2 {
//    public static void main(String[] args) {
//        Integer[] arr = {1, 2, 3, 4, 6, 5};
//        Arrays.sort(arr,Collections.reverseOrder());
//
//        System.out.println(Arrays.toString(arr));
//    }
//}


//public class Main2 {
//    public static void printDescending(int n) {
//        for(int i = n; i > 0; i--) {
//            System.out.println(i);
//        }
//    }
//
//    public static void main(String[] args) {
//        printDescending(10);
//    }
//}

//
//public class Main2{
//    public static void main(String[] args) {
//        int a = 100;
//        for (int i = 2; i <= a; i++) {
//            if (isPrime(i)) {
//                System.out.println(i);
//            }
//        }
//    }
//        public static boolean isPrime(int a) {
//          for(int i=2; i<a; i++){
//              if(a%i==0){
//                  return false;
//              }
//
//        }
//          return true;
//    }
//}


//import java.util.Scanner;
//public class Main2 {
//    public static int add(int a , int b ) {
//        return(a+b);
//
//    }
//    public static void main(String args[]){
//        int a = add(3,5);
//        System.out.println("sum of given no.:"+a);
//
//    }
//}

//
//public class Main2 {
//    public static void  main(String args[]){
//        // format
//        System.out.println("my name is " + (2+6));
//        System.out.println("my name is " + "Dinesh sharma");
//        System.out.format("my name is %d and floating number is %.2f and %s",8-2,3.9-1.8,"hey sharad");
//    }
//}

// format satisfier like %s , %f , %d;

// s string ke liye , dis for number , f for decimal number, s is for String ;


//public class Main2 {
//    public static void  main(String args[]) {
//        System.out.println("please enter your numbers");
//      Scanner sc = new Scanner(System.in);
//// we want take String then nextline();
//
//      int d = sc.nextInt();
//
//        int p = sc.nextInt();
//        int sum = d+p;
//        System.out.println(sum);
//
//        int diff = p-d;
//        System.out.println(diff);
//        int mul = p*d;
//        System.out.println(mul);
//        float div = d/p;
//        System.out.println(div);
//
//
//    }
//    }


// how to print * like box;
//public class Main2 {
//    public static void main(String[] args){
//        int p =4;
//        int d = 5;
//
//        for(int i = 0; i<p; i++ ){
//            for(int j=0; j<d; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
//}


//public class Main2 {
//    public static void main(String[] args){
//        int p =4;
//        int d = 5;
//
//        for(int i = 1; i<=p; i++ ) {
//            for (int j = 1; j <= d; j++) {
//                if (i == 1 || j == 1 || i == p || j == d) {
//                    System.out.print("*");
//
//                }
//                else{
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }
//    }
//}

//public class Main2 {
//    public static void main(String[] args){
//        int p =4;
//       for(int i=1; i<=p; i++){
//           if(i==1){
//               System.out.println("*");
//           }else if(i==2){
//               System.out.println("* *");
//
//               }else if(i==3){
//               System.out.println("* * *");
//           }else{
//               System.out.println("* * * *");
//           }
//
//       }
//
//
//
//        }
//    }

//
//import java.util.Scanner;
//
//public class Main2 {
//    public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      int p = sc.nextInt();
//         for(int i=1; i<=p; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//
//    }}

//
//public class Main2 {
//    public static void main(String[] args) {
//        int p = 4;
//        for(int i=p; i>0; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }}




//
//public class Main2 {
//    public static void main(String[] args) {
//        int p = 5;
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }}

//
//public class Main2 {
//   public static void main(String[] args) {
//       int p = 5;
//   for(int i=1; i<=p; i++){
//       for(int j=1; j<=i; j++){
//          int sum = i+j;
//          if(sum%2==0){
//              System.out.print(1+" ");
//           }else{
//              System.out.print(0+" ");
//          }
//
//       }
//       System.out.println();
//
//   }
//
//   }}
//
//import java.util.Scanner;
//public class Main2 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        int b = sc.nextInt();
//
//        System.out.println();
//
//    }
//}
//`
//
//import java.util.Arrays;
//import java.util.Scanner;
//public class Main2 {
//    public static void main(String args[]){
//      int[]  array = new int[]{2,4,3,9,7,8,6};
//        Arrays.sort(array);
//        for(int i= array.length-1; i>0; i--){
//            System.out.println(array[i]);
//        }
//    }
//}


//public class Main2{
//    public static void main(String args[]){
//        int p =4;
//        int l =5;
//        for(int i=1; i<=p; i++){
//            for(int j=1; j<=l; j++){
//                if(i==1 || j==1 || i==p || j==l){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
//    }
//
//}

//public class Main2 {
//    public static void main(String args[]){
//        boolean d = true;
//        boolean p = false;
//        if(d && p){
//            System.out.println("Dinesh sharma");
//        }else{
//            System.out.println("kya likh raha hai bhai ");
//        }
//    }
//}


//import java.util.Scanner;
//public class Main2 {
//    public static int SumOf(int a,int b){
//        int sum = a+b;
//        return sum;
//
//    }
//    public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     int d = sc.nextInt();
//        int p = sc.nextInt();
//     int sum = SumOf(d,p);
//        System.out.println(sum);
//
//    }
//}


//import java.util.Scanner;
//public class Main2 {
//    public static int MutiplyOf(int a , int b){
//        int mul = a*b;
//        return mul;
//
//    }
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(MutiplyOf(a,b));
//
//    }
//}



//import java.util.Scanner;
//public class Main2 {
//public static void Factorial(int a) {
//    if (a == 0 || a == 1) {
//        System.out.println(1);
//    } else if (a < 0) {
//        System.out.println("undefined");
//    } else {
//        int fact = 1;
//        for (int i = 1; i <= a; i++) {
//
//            fact *= i;
//
//        }
//        System.out.println(fact);
//    }
//}
//    public static void main(String args[]){
//       Scanner sc = new Scanner(System.in);
//       int a = sc.nextInt();
//       Factorial(a);
//
//    }
//}
//import java.util.Scanner;
//public class Main2 {
//    public static void main(String args[]){
//      Scanner sc = new Scanner(System.in);
//      int d = sc.nextInt();
//      int p = sc.nextInt();
//      int k = sc.nextInt();
//      int avg = (d+p+k)/3;
//        System.out.println(avg);
//    }
//}
//
//import java.util.Scanner;
//public class Main2 {
//    public static int SumOfOdd(int p) {
//        int sum = 0;
//        for (int i = 1; i <= p; i = i + 2) {
//            sum += i;
//            System.out.println(sum);
//        }
//        return sum;
//    }
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int p = sc.nextInt();
//        SumOfOdd(p);
//
//
//    }
//}

//import java.util.Scanner;
//public class Main2 {
//    public static String check(int a, int b){
//        if(a>b){
//            return "a is greater";
//        }else{
//            return "b is greater";
//        }
//
//    }
//    public static void main(String args[]){
//
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(check(a,b));
//    }
//}


//import java.util.Scanner;
//import java.util.Stack;
//public class Main2 {
//    public static Double check(Double radius){
//
//
//      return 3.14*radius*2;
//
//    }
//    public static void main(String args[]){
//
//        Scanner sc = new Scanner(System.in);
//        Double radius = sc.nextDouble();
//        System.out.println(check(radius));
//
//
//    }
//}
//
//public class Main2 {
//    public static String check(int age){
//         if(age>18){
//             return "tu  hai eligible";
//
//         }else{
//             return "you are not eligible";
//         }
//
//
//
//    }
//    public static void main(String args[]){
//
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        System.out.println(check(19));
//
//
//    }
//}
//
//public class Main2 {
//    public static int check(int a , int b){
//    int res = 1;
//        for(int i=1; i<=b; i++){
//           res *= a;
//        }
//        return res;
//
//    }
//    public static void main(String args[]){
//
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(check(a,b));2
//
//    }
//}





//public class Main2{
//    public static void main(String[] args) {
//        int a = 100;
//        for (int i = 2; i <= a; i++) {
//            if (isPrime(i)) {
//                System.out.println(i);
//            }
//        }
//    }
//    public static boolean isPrime(int a) {
//        for(int i=2; i<a; i++){
//            if(a%i==0){
//                return false;
//            }
//
//        }
//        return true;

//    }
//}

//import java.util.Arrays;
//import java.util.Collections;
//public class Main2 {
//    public static void main(String args[]){
//        Integer[] arr = {2,65,9,8,3,45,6};
//        Arrays.sort(arr);
//        System.out.print(arr);
//    }
//}
//Write a function that calculates the Greatest Common Divisor of 2 numbers

//import java.util.*;
//public class Main2 {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        while(n1 != n2) {
//            if(n1>n2) {
//                n1 = n1 - n2;
//            } else {
//                n2 = n2 - n1; }
//        }
//        System.out.println("GCD is : "+ n1);
//    }
//}



//0 1 1 2 3 5 8 13 21 ..... write this type ....
//import java.util.*;
//public class Main2 {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//
//    int n = sc.nextInt();
//    int a = 0, b = 1;
//       System.out.print(a+" ");
//               if(n > 1) {
//               //find nth term
//               for(int i=2; i<=n; i++) {
//               System.out.print(b+" ");
//               //the concept below is called swapping
//               int temp = b;
//               b = a + b;
//               a = temp;
//               }
//               System.out.println();
//               }
//               } }


//import java.util.Scanner;
//public class Main2 {
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("please enter your num:");
//        String num = sc.nextLine();
//        StringBuilder reversed = new StringBuilder();
//
//        for (int i = num.length() - 1; i >= 0; i--) {
//            reversed.append(num.charAt(i));
//        }
//
//        String reversedString = reversed.toString();
//
//   if(num.equals(reversedString)){
//       System.out.println("palidrone num");
//
//        }else{
//       System.out.println("not palidrone num");
//   }
//    }
//}

//import java.util.Arrays;
//public class Main2 {
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int [] array = new int[size];
//        for(int i=0; i<size; i++){
//            array[i] = sc.nextInt();
//         }
//        int a = sc.nextInt();
//        for(int i=0; i< array.length; i++){
//            if(array[i] == a){
//                System.out.println("your num is on " + i +  "  index");
//            }
//        }
//
//
//    }
//}

//
//import java.util.Arrays;
//public class Main2 {
//    public static void main(String args[]) {
//   Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//   int [] array = new int[size];
//
//   for( int i=0; i<size; i++){
//       array[i] = sc.nextInt();
//   }
//   int d = sc.nextInt();
//   for(int i=0; i< array.length; i++){
//       if(array[i] == d){
//           System.out.println("this num is found on :" + i);
//       }
//   }
//
//    }
//    }


// import java.util.*;
// public class Main2 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//
//         int cols = sc.nextInt();
//         int [][] arrays = new int[rows][cols];
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//           arrays[i][j] = sc.nextInt();
//             }
//         }
//
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 System.out.print(arrays[i][j]+" ");
//             }
//             System.out.println();
//     }}
//}


//
// import java.util.*;
// public class Main2 {
//     public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int size = sc.nextInt();
//       int arrays[] = new int[size];
//       for(int i=0; i<size; i++){
//           arrays[i] = sc.nextInt();
//       }
//       int d = sc.nextInt();
//       for(int i=0; i< arrays.length; i++){
//           if(d==arrays[i]){
//               System.out.println(i);
//           }
//       }
//     }
// }
//
//
//public class Main2 {
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int rows = sc.nextInt();
//
//        int cols = sc.nextInt();
//        int [][] arrays = new int[rows][cols];
//        for(int i=0; i<rows; i++){
//            for(int j=0; j<cols; j++){
//                arrays[i][j] = sc.nextInt();
//            }
//        }
//       int d = sc.nextInt();
//
//        for(int i=0; i<rows; i++){
//            for(int j=0; j<cols; j++){
//              if(arrays[i][j] == d){
//                    System.out.println("this element`s position is"+ i + ","+ j);
//                }
//            }
//
//        }}
//}



//import java.util.*;
//public class Main2 {
//      public static int checkmax(int [] arr) {
//       for (int i = 0; i < arr.length; i++) {
//        if (arr[i] > arr[i + 1] && arr[i] < arr[i - 1]) {
//         return arr[i];
//        }
//        if (i == 0 && arr[i] > arr[i + 1]) {
//         return arr[i];
//        }
//        if (i == arr.length - 1 && arr[i] > arr[i - 1]) {
//         return arr[i];
//        }
//
//       }
//      }
//
// public static void main(String[] args){
//     int [] arr = {1,2,3,4,5,6};
//     int[] numbers = {1,3,5,7,6,3};
//  System.out.println(checkmax(numbers));
// }
//}
//
//public class Main2 {
// public static double[] calculateSumAndAverage(int[] array) {
//  double[] result = new double[2];
//  double sum = 0;
//  for (int i : array) {
//   sum = sum + i;
//  }
//  double average = sum / array.length;
//  result[0] = sum;
//  result[1] = average;
//  return result;
// }
//
// public static void main(String[] args) {
//  int[] number = {1, 2, 3, 4, 5};
//  double[] result = calculateSumAndAverage(number);
//  System.out.println("Sum: " + result[0]);
//  System.out.println("Average: " + result[1]);
// }
//}

//
//public class Main2 {
//public static int check(int [] array){
// int max =0;
// for(int x:array){
//    if( max<x){
//      max = x;
//    }
//
// }
// return max;
//
// }
// public static void main(String args[]){
//   int [] arr = {2,4,5,8,79,4};
//  System.out.println(check(arr));
//
// }
//}
//import java.util.*;
// public class Main2 {

//  public static boolean check(int[] array) {
//       boolean check = false;
//     for(int x: array){
//      if(x==14){
//              check = true;
//      }
//
//     }
//     return check;
//
//  }
//
//  public static void main(String args[]){
//
//
//   int[] array = {5,7,12,86,14};
//   System.out.println(check(array));
//
//  }
//}

// search the target element;
//public class Main2 {
// public static void main(String args[]){
//    int[] array = {2,5,3,7,5,9,7,14,243};
//  System.out.println(check(array));
// }
// public static int check(int[] array){
//  int target = 14;
//      if(array.length==0){
//        return -1;
//      }
//      for(int i=0; i<array.length; i++){
//         if(array[i]==target){
//           return i;
//         }
//      }
//      return -1;
// }
//}

//public class Main2 {
//    public static void main(String args[]){
//        int[] array = {2,5,3,7,5,9,7,14,243,4567};
//        System.out.println("max value is ");
//        System.out.println(check(array));
//
//    }
//    public static int check(int[] array){
//        int max = 0;
//        for(int x:array){
//            if(max<x){
//                max = x;
//            }
//        }
//        return max;
//    }
//
//}

//public class Main2 {
//    public static void main(String args[]){
//        int[] array = {2,5,3,7,5,9,7,14,243};
//        System.out.println(check(array));
//
//    }
//    public static int check(int[] array){
//      int sum =0;
//      for(int x=0; x< array.length; x++){
//          sum += array[x];
//
//      }
//      return sum;
//    }
//}




//
//public class Main2 {
// public static double[] calculateSumAndAverage(int[] array) {
//  double[] result = new double[2];
//  double sum = 0;
//  for (int i : array) {
//   sum = sum + i;
//  }
//  double average = sum / array.length;
//  result[0] = sum;
//  result[1] = average;
//  return result;
// }
//
// public static void main(String[] args) {
//  int[] number = {1, 2, 3, 4, 5};
//  double[] result = calculateSumAndAverage(number);
//  System.out.println("Sum: " + result[0]);
//  System.out.println("Average: " + result[1]);
// }
//}
//public class Main2 {
//    public static void main(String[] args) {
//        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        int index = 3;
//        array = removeElement(array, index);
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
//    }
//
//    public static int[] removeElement(int[] original, int index) {
//        if (original == null || index < 0 || index >= original.length) {
//            return original;
//        }
//        int[] copy = new int[original.length - 1];
//        System.arraycopy(original, 0, copy, 0, index);
//        System.arraycopy(original, index + 1, copy, index, original.length - index - 1);
//        return copy;
//    }
//}



//public class Main2 {
//    public static int checkmax(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
//                    return arr[i];
//
//            }  if (i == 0 && arr[i] > arr[i + 1]) {
//                return arr[i];
//            } if (i == arr.length - 1 && arr[i] > arr[i - 1]) {
//                return arr[i];
//            }
//        }
//
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int[] numbers = {1, 3, 5, 7, 6, 3 ,56 ,78 ,23};
//        System.out.println(checkmax(numbers));
//    }
//}
// create a Matrix;
//public class Main2{
// public static void main(String[] args) {
//   int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//   for(int i=0; i<arr.length; i++){
//    for(int j=0; j<arr[i].length; j++){
//     System.out.print(arr[i][j]+" ");
//    }
//    System.out.println();
//   }
// }
//}
// How to reverse a matrix;

//public class Main2 {
// public static void main(String[] args) {
//  // Declare and initialize a 2D array (3x3 matrix)
//  int[][] matrix = {
//          {1, 2, 3},
//          {4, 5, 6},
//          {7, 8, 9}
//  };
//
//  // Reverse the 2D array
//  for (int i = 0; i < matrix.length / 2; i++) {
//   for (int j = 0; j < matrix[i].length; j++) {
//    int temp = matrix[i][j];
//    matrix[i][j] = matrix[matrix.length - i - 1][j];
//    matrix[matrix.length - i - 1][j] = temp;
//   }
//  }
//
//  // Print the reversed 2D array
//  for (int i = 0; i < matrix.length; i++) {
//   for (int j = 0; j < matrix[i].length; j++) {
//    System.out.print(matrix[i][j] + " ");
//   }
//   System.out.println();
//  }
// }
//}

//public class Main2 {
// public static void main(String[] args) {
//    HashMap<String,Integer> map = new HashMap<String,Integer>();
//  map.put("Keshav",18);
//  map.put("kanhaiya",24);
//  System.out.println(map);
// }
//
//}
//
//import java.util.*;
//public class Main2 {
// public static void main(String[] args) {
//  Scanner sc = new Scanner(System.in);
//  String check = sc.next();
//  String username = "";
//  for(int i=0; i<check.length(); i++){
//     if(check.charAt(i) == '@'){
//
//       break;
//     }else{
//            username+=check.charAt(i);
//     }
//  }
//  System.out.println(username);
// }
//}


//public class Main2 {
// public static void main(String[] args) {
//  Scanner sc = new Scanner(System.in);
//  String Ai = sc.next();
//  String check = "";
//  for(int i=0; i<Ai.length(); i++){
//     if(Ai.charAt(i)== 'e'){
//        check+= 'i';
//  }else{
//      check += Ai.charAt(i);
//     }
//
//  }
//  System.out.println(check);
// }
//}
//
//public  class Main2 {
// public static void main(String[] args) {
//   String hii = "kondfhcjsk";
//   String tu = "";
//   for(int i=hii.length()-1; i>=0; i--){
//      tu+= hii.charAt(i);
//   }
//  System.out.println(tu);
// }
//}
//
//public class Main2 {
// public static void main(String[] args) {
//   Scanner sc = new Scanner(System.in);
//
//    String b= sc.next();
//  String c= sc.next();
//    for(int i=b.length()-1; i>=0; i--){
//      c += b.charAt(i);
//    }
//  System.out.println(c);
// }
//}


//public class Main2 {
// public static void main(String[] args) {
//  int[] arr = {2,5,8,9,88,45};
//  System.out.println(check(arr));
//
// }
// public static int check(int [] arr){
//     Arrays.sort(arr);
//     int diff = arr[arr.length-1] - arr[arr.length-2];
//     return diff;
// }
//
//}
//
//public class Main2 {
// public static void main(String[] args) {
//  int[] arr = {2,5,8,9,88,45};
//  System.out.println(check(arr));
//
// }
// public static int check(int [] arr){
//     Arrays.sort(arr);
//     int diff = arr[arr.length-1] - arr[arr.length-2];
//     return diff;
// }
//
//}
//
//public class Main2 {
//    public static void main(String[] args) {
//         int limit = 100;
//         for(int i=2; i<=limit; i++){
//             if(check(i)){
//                 System.out.println(i);
//             }
//         }
//    }
//    public static boolean check(int n){
//        if(n<=1){
//            return false;
//        }
//
//        for(int i=2; i<n; i++){
//            if(n%2==0){
//                return false;
//            }
//        }
//        return true;
//
//    }
//}
//import java.util.*;
//import java.util.*;
//public class Main2 {
// public static void main(String[] args) {
//    Integer [] array = {3,4,6,5,19,67,54,657};
//    Arrays.sort(array,Collections.reverseOrder());
//  System.out.println(Arrays.toString(array));
// }
//}

//

//
//import java.util.Scanner;
//
//public class Main2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int p = sc.nextInt();
//        check(p);
//
//    }
//    public static void check(int p){
//        for(int i=0; i<=p; i++){
//            System.out.println("*".repeat(i));
//        }
//    }
//}

//public class Main2 {
//    public static void main(String[] args) {
//        int p = 5;
//        for(int i=1; i<=p; i++){
//            for(int j=1; j<=i; j++){
//
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//
//    }
//}


//
//import java.util.Scanner;
//
//public class Main2 {
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

//import java.util.*;
//public class Main2 {
//    public static void main(String[] args) {
//
//        Integer array[] = {1,2,3,6,5,9,8,7};
//        Arrays.sort(array,Collections.reverseOrder());
//        Arrays.toString(array);
//        int diff = array[0] - array[1];
//        System.out.println(diff);
//
//
//  }
//    }


//public class Main2 {
//    public static void check(int n){
//        if(n==0){
//            return ;
//        }
//        System.out.println(n);
//        check(n-1);
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        check(n);
//    }
//}

//public class Main2 {
//    public static void check(int n){
//        if(n==5){
//            return ;
//        }
//        System.out.println(n);
//        check(n+1);
//    }
//    public static void main(String[] args) {
//        int n = 1;
//        check(n);
//
//    }
//}
//import java.util.*;
//public class Main2 {
//    public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          int n = sc.nextInt();
//        System.out.println(check(n));
//
//    }
//    public static int check(int n){
//        if(n==0 || n==1){
//            return 1;
//        }
//     int fact = check(n-1);
//        int factorial = fact*n;
//        return factorial;
//
//    }
//}

//public class Main2 {
//    public static void main(String[] args) {
//        check(1,5,0);
//    }
//    public static void check(int i,int n,int sum){
//        if(n==i){
//            sum +=i;
//            System.out.println(sum);
//            return ;
//        }
//        sum+=i;
//        check(i+1,n,sum);
//        System.out.println(sum);
//    }
//}
// Que is how to create a matrix....


//  public class Main2 {
//      public static void main(String[] args) {
//          int[][] array = {{2,3,4},{5,6,7}};
//
//          for(int i=0; i< array.length; i++){
//              for(int j=0; j< array[i].length; j++){
//                  System.out.print(array[i][j]+" ");
//              }
//              System.out.println();
//          }
//      }
//}
//
//
////public class Main2 {
////    public static void check(int i){
////        if(i==0){
////            return ;
////        }
////        check(i-1);
////        System.out.println(i);
////    }
////    public static void main(String[] args) {
////        int i =5;
////        check(i);
////    }
////}
//
//
//public class Main2 {
//    public static void check(int i, int n, int sum) {
//        if(i==n){
//            sum +=i;
//            System.out.println(sum);
//            return ;
//        }
//        sum +=i;
//
//        check(i+1,n,sum);
//
//    }
//    public static void main(String[] args) {
//         check(1,5,0);
//    }
//}

//import java.util.Scanner;
//
//public class Main2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(check(n));
//    }
//
//    public static int check(int n) {
//        if(n==0|| n==1){
//            return 1;
//        }
//        int fac_1 = check(n-1);
//        int fac = fac_1*n;
//        return(fac);
//
//    }
//}

//public class Main2 {
//    public static int FindFac(int n) {
//        if( n==0 || n==1){
//            return   1;
//        }
//        int fact_1 = FindFac( n-1);
//        int factorial = fact_1*n;
//     return   factorial;
//
//    };
//    public static void main(String[] args) {
//        System.out.println( FindFac(5));
//    }
//}
//
//import java.util.concurrent.ScheduledExecutorService;
//
//public class Main2 {
//    public static void main(String[] args) {
//        int n = 1;
//
//        Check(n);
//
//
//    }
//
//    public static void Check(int n) {
//        if(n==5){
//            return ;
//        }
//        System.out.println(n);
//        Check(n+1);
//
//
//
//    }
//}


//public class Main2 {
//    public static void main(String[] args) {
//        int arr[] = {2,5,3,47,68,9};
//        for(int i=0; i< arr.length-1; i++){
//            for(int j=0; j< arr.length-1-i; j++){
//                if(arr[j]>arr[j+1]){
//                  int temp = arr[j];
//                  arr[j] = arr[j+1];
//                    arr[j+1]= temp;
//                }
//            }
//        }
//     print(arr);
//    }
//
//    public static void print(int arr[]) {
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
//    }
//}


//
//public class Main2 {
//    public static void main(String[] args) {
//      int n=6;
//        print(n);
//    }
//
//    public static void print(int n) {
//        if(n==0){
//            return ;
//        }
//        System.out.print(n + " ");
//        print(n-1);
//
//    }
//}

//
//public class Main2 {
//    public static void main(String[] args) {
//        printfact(5,1);
//    }
//
//    public static void printfact(int n, int fact) {
//        if(n==0 ){
//            System.out.println(fact);
//            return ;
//        }
//        fact*=n;
//        printfact(n-1,fact);
//
//
//    }

//}

//public class Main2 {
//    public static void main(String[] args) {
//        int a = 0;
//        int b = 1;
// printfab(a,b,10);
//    }
//
//    public static void printfab(int a, int b, int n) {
//        if(n==0){
//            return ;
//        }
//        System.out.println(a);
//        printfab(b,a+b,n-1);
//
//    }
//}
//
//public class Main2 {
//    public static void main(String[] args) {
//        int n = 5;
//         harnoi(n,"s","H","D");
//
//    }
//
//    public static void harnoi(int n,String src,String helper,String des) {
//        if(n==1){
//            System.out.println("transfer Disk "+ n +" from "+ src +" to "+ des);
//            return ;
//        }
//        harnoi(n-1,src,des,helper);
//        System.out.println("transfer Disk "+n+"from"+src+"to"+des);
//        harnoi(n-1,helper,src,des);
//
//    }
//}


//public class Main2 {
//    public static void main(String[] args) {
//        String str = "Dinesh";
//        int i;
//        for (i = str.length() - 1; i>=0; i--){
//            System.out.print(str.charAt(i));
//        }
//    }
//}
//
//public class Main2 {
//    public static void main(String[] args) {
//        String str = "abcd";
//reverseString(str,str.length()-1);
//    }
//
//    public static void reverseString(String str,int ind) {
//
//        if(ind == 0){
//            System.out.println(str.charAt(ind));
//            return;
//        }
//        System.out.print(str.charAt(ind));
//        reverseString(str,ind-1);
//
//    }
//}

//public class Main2 {
//    public static void main(String[] args) {
//        String str = "agwhjdkndewc fweaaaakf,m lwejeffhfeirkj";
//        check(str,0,'a');
//
//    }
//       public static int first = -1;
//     public static int last = -1;
//    public static void check(String str, int ind, char element ) {
//        if(ind == str.length()-1){
//            System.out.println(first);
//            System.out.println(last);
//            return;
//        }
//        char target_element = str.charAt(ind);
//        if(target_element==element){
//            if(first==-1){
//                first = ind;
//            }else{
//                last = ind;
//            }
//        }
//        check(str,ind+1,element);
//    }
//}
//
//public class Main2 {
//    public static void main(String[] args) {
//        String str = "agdxxwwxwexdwdxdwx";
//        check(str,0,0,"");
//    }
//    public static void check(String str,int ind,int count,String str1){
//        if(ind == str.length()){
//            for(int i=0; i<=count; i++){
//                str1+='x';
//            }
//            System.out.println(str1);
//            return;
//
//        }
//        char current = str.charAt(ind);
//        if(current == 'x'){
//            count++;
//            check(str,ind+1,count,str1);
//        }else{
//            str1+=current;
//            check(str,ind+1,count,str1);
//        }
//    }
//}

//
//public class Main2 {
//    public static void main(String[] args) {
//        String str = "abcdabcd";
//        check(str,0,"");
//    }
//     public static boolean arr[] = new boolean[26];
//    public static void check(String str,int ind,String newString) {
//          if(ind==str.length()){
//              System.out.println(newString);
//              return;
//          }
//        char common = str.charAt(ind);
//        if(arr[common-'a']){
//            check(str,ind+1,newString);
//        }else{
//            newString+=common;
//            arr[common-'a'] = true;
//            check(str,ind+1,newString);
//        }
//    }
//}

//public  class Main2 {
//    public static void main(String[] args) {
//        int rows = 4;
//        int cols = 5;
//        for(int i=1; i<=rows; i++){
//            for(int j=1; j<=cols; j++){
//                System.out.print("*"+"♥︎");
//            }
//            System.out.println();
//        }
//    }
//}

//public class Main2 {
//    public static void main(String[] args) {
//        int rows = 4;
//        int cols = 5;
//
//        for(int i=1; i<=rows; i++){
//            for(int j=1; j<=cols; j++){
//                if(i==1|| j==1 ||  i==rows || j==cols){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//    }
//            System.out.println();
//}}}

//public class Main2 {
//    public static void main(String[] args) {
//        String str = "35";
//        check(str,0,"");
//        }
//       public static String keywords[] = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//    public static void check(String str,int ind,String commbinations) {
//        if(ind == str.length()){
//            System.out.println(commbinations);
//            return;
//        }
//        char common = str.charAt(ind);
//       String mapping = keywords[common-'0'];
//       for(int i=0; i<mapping.length(); i++){
//           check(str,ind+1,commbinations+mapping.charAt(i));
//       }
//    }
//    }
//
//public class Main2 {
//    public static void main(String[] args) {
//        int num = 234;
//        int sum = 0;
//        String p = Integer.toString(num);
//        for(int i=0; i<p.length(); i++){
//           sum+=Character.getNumericValue(p.charAt(i));
//
//        }
//        System.out.println(sum);
//    }
//}


//
// public class Main2 {
//
//     public static void main(String[] args) {
//         int m =3;
//         int n = 3;
//         System.out.println(check(0,0,m,n));
//
//     }
//     public static int check(int i,int j,int m,int n) {
//         if(i==m-1 || j==n-1){
//             return 1;
//         }
//         if(i==m || j==n){
//             return 0;
//         }
//         // for downward
//         int downward = check(i+1, j, m, n);
//         // for right....
//         int rightward = check(i,j+1,m,n);
//         int wayformatrixmapping = downward+rightward;
//         return wayformatrixmapping;
//     }
// }
//
//public class Main2 {
//    public static void main(String[] args) {
//        String str = "adbbbdbduhhdbd";
//        check(str,0,'b');
//    }
//   public static int first = -1;
//    public static int last = -1;
//    public static void check(String str,int ind,char element) {
//        if(ind==str.length()){
//            System.out.println(first);
//            System.out.println(last);
//            return;
//        }
//        char common = str.charAt(ind);
//        if(common == element){
//            if(first == -1){
//                first = ind;
//            }else{
//                last = ind;
//            }
//        }
//        check(str,ind+1,element);
//
//    }
//}

//
//public class Main2 {
//    public static void main(String[] args) {
//        int n = 5;
//        check(n,0);
//    }
//
//    public static void check(int n,int sum) {
//        if(n==0){
//            System.out.println(sum);
//            return;
//        }
//        sum+=n;
//        check(n-1,sum);
//
//    }
//}

//public  class Main2 {
//    public static void main(String[] args) {
//        String str = "abc";
//        check(str,"",0);
//    }
//
//    public static void check(String str,String newstr,int ind) {
//        if (str.length()==0){
//            System.out.println(newstr);
//            return;
//        }
//        for(int i=0; i<str.length(); i++){
//            char common = str.charAt(i);
//            String newstr1 = str.substring(0,i)+str.substring(i+1);
//            check(newstr1,newstr+common,ind+1);
//        }
//
//    }
//}

//
//public class Main2 {
//    public static void main(String[] args) {
//        String str = "ajsjnxxwjkejkfnxxwknd";
//        check(str,0,0,"");
//    }
//    public static void check(String str,int ind,int count,String str1){
//        if(ind == str.length()){
//            for(int i=0; i<=count; i++){
//                str1+='x';
//            }
//            System.out.println(str1);
//            return;
//        }
//        char common = str.charAt(ind);
//        if(common == 'x'){
//            count++;
//            check(str,ind+1,count,str1);
//        }else{
//            str1+=common;
//            check(str,ind+1,count,str1);
//        }
//    }
//}
//
//public  class Main2{
//    public static void main(String[] args) {
//        String str = "abcdesseddd";
//   check(str,"",0);
//    }
//    public static boolean arr[] = new boolean[26];
//
//    public static void check(String str,String newarr,int ind) {
//        if(ind == str.length()){
//            System.out.println(newarr);
//            return;
//        }
//        char common = str.charAt(ind);
//        if(arr[common-'a']){
//            check(str,newarr,ind+1);
//        }else{
//            newarr+=common;
//            arr[common-'a'] = true;
//            check(str,newarr,ind+1);
//        }
//
//    }
//
//}
//
//public class Main2 {
//    public static void main(String[] args) {
//        int n =3;
//        check(n,"s","H","D");
//    }
//
//    public static void check(int n,String src,String Helper,String Destination) {
//        if(n==1){
//            System.out.println("disk transfer of" + n + " from "+ src + " to " + Destination);
//            return;
//        }
//
//        check(n-1,src,Destination,Helper);
//        System.out.println("disk transfer of" + n + "from"+ src + "to" + Destination);
//        check(n-1,Helper,src,Destination);
//
//    }
//}

//
//public class Main2 {
//    public static void main(String[] args) {
//String str = "sknxdhbaszxxexhbe";
// check(str,0,0,"");
//    }
//
//    public static void check(String str,int ind,int count,String newstr) {
//        if(ind == str.length()){
//            for(int i=0; i<count; i++){
//                newstr+='x';
//            }
//            System.out.println(newstr);
//            return;
//        }
//        char common = str.charAt(ind);
//        if(common=='x'){
//            count++;
//            check(str,ind+1,count,newstr);
//        }else{
//            newstr+=common;
//            check(str,ind+1,count,newstr);
//
//        }
//    }
//}
//

//
//class Solution {
//    public boolean isPalindrome(int x) {
//        int rev = 0;
//        int temp = x;
//        while (temp > 0) {
//            int lastDigit = temp % 10;
//            rev = rev * 10 + lastDigit;
//            temp = temp / 10;
//        }
//        return rev == x;
//    }
//}
// if we want reverse the number ;;;;....
//public class Main2 {
//    public static void main(String[] args) {
//        int n = 3456;
//        check(n);
//    }
//
//    public static void check(int num) {
//        String check = String.valueOf(num);
//        for(int i=check.length()-1; i>=0; i--){
//            System.out.print(check.charAt(i));
//        }
//    }
//}

//public class Main2 {
//    public static void main(String[] args) {
//        String  str = "hsenid";
//        check(str);
//    }
//
//    public static void check(String str) {
//
//        for(int i=str.length()-1; i>=0; i--){
//            System.out.print(str.charAt(i));
//        }
//    }
//}

//public class Main2 {
//    public static void main(String[] args) {
//        int n = 8;
//        System.out.println(check(n));
//    }
//
//    public static int check(int n) {
//         int fact = 1;
//        if(n==0 || n==1){
//            return 1;
//        }else if(n<0){
//            return 0;
//        }
//        for(int i=2; i<=n; i++){
//            fact*=i;
//        }
//      return fact;
//
//    }
//}

//public class Main2 {
//    public static void main(String[] args) {
//        int num = -12345;
//        int reversedNum = reverse(num);
//        System.out.println("The reversed number is: " + reversedNum);
//    }
//
//    public static int reverse(int num) {
//        int reversedNum = 0;
//        while (num != 0) {
//            int digit = num % 10;
//            reversedNum = reversedNum * 10 + digit;
//            num /= 10;
//        }
//        return reversedNum;
//    }
//}

import javax.swing.*;
import java.util.*;

//public class Main2 {
//    public static void main(String[] args) {
//        int n = -743829;
//        check(n);
//    }
//
//    public static void check(int n) {
//        String str = String.valueOf(n);
//        String str1 = "";
//        for(int i=str.length()-1; i>=0; i--){
//            if(str.charAt(i)=='-'){
//                System.out.println("-"+str1);
//                return;
//            }else {
//                str1 += str.charAt(i);
//            }
//        }
//    }
//}
//
//public class Main2 {
//    public static void main(String[] args) {
//        int n =27;
//        System.out.println(check(n));
//    }
//
//    public static boolean check(int n) {
//        boolean check = false;
//        if(n==0 || n==-1){
//            return false;
//
//        }
//
//        for(int i =3; i<=n; i=i+3){
//           if(n == i){
//             check = true;
//           }
//        }
//        return check;
//    }
//}
//
//public class Main2 {
//    public static String getDayName(int day) {
//        switch (day) {
//            case 1:
//                return "Monday";
//            case 2:
//                return "Tuesday";
//            case 3:
//                return "Wednesday";
//            default:
//                return "Other";
//        }
//    }
//    public static void main(String[] args) {
//        int n = 3;
//        System.out.println(getDayName(n));
//    }
//}
//
//public class Main2{
//
//    public static void rotateByIndex(int[] nums, int index) {
//        int n = nums.length;
//
//        // Check if the index is within the valid range
//        if (index < 0 || index >= n) {
//            System.out.println("Invalid index for rotation.");
//            return;
//        }
//
//        // Create a temporary array to store the rotated elements
//        int[] rotatedArray = new int[n];
//
//        // Copy the elements from the index to the end of the array to the temporary array
//        System.arraycopy(nums, index, rotatedArray, 0, n - index);
//
//        // Copy the elements from the start of the array to the index to the temporary array
//        System.arraycopy(nums, 0, rotatedArray, n - index, index);
//
//        // Copy the rotated array back to the original array
//        System.arraycopy(rotatedArray, 0, nums, 0, n);
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5, 6, 7};
//        int index = 3;
//
//        System.out.print("Original Array: ");
//        printArray(nums);
//
//        rotateByIndex(nums, index);
//
//        System.out.print("Rotated Array by index " + index + ": ");
//        printArray(nums);
//    }
//
//    private static void printArray(int[] nums) {
//        for (int num : nums) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//    }
//}
//
//public class Main2 {
//
//    public static int[] rotateByIndex(int[] nums, int index) {
//        int n = nums.length;
//
//        // Check if the index is within the valid range
//        if (index < 0 || index >= n) {
//            System.out.println("Invalid index for rotation.");
//            return nums.clone(); // Return a copy of the original array
//        }
//
//        // Create a new array to store the rotated elements
//        int[] rotatedArray = new int[n];
//
//        // Copy the elements from the index to the end of the array to the rotated array
//        System.arraycopy(nums, index, rotatedArray, 0, n - index);
//
//        // Copy the elements from the start of the array to the index to the rotated array
//        System.arraycopy(nums, 0, rotatedArray, n - index, index);
//
//        return rotatedArray;
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5, 6, 7};
//        int index = 3;
//
//        System.out.print("Original Array: ");
//        printArray(nums);
//
//        int[] rotatedArray = rotateByIndex(nums, index);
//
//        System.out.print("Rotated Array by index " + index + ": ");
//        printArray(rotatedArray);
//    }
//
//    private static void printArray(int[] nums) {
//        for (int num : nums) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//    }
//}
//public class Main2 {
//    public static void main(String[] args) {
////        String str = "vikas chaudhary";
////        check(str);
////    }
////
////    public static void check(String str) {
////        for(int i=0; i<str.length(); i++){
////            char s = str.charAt(i);
////            System.out.print(s+"\uD83E\uDD73");
////        }
//        String str1 = "test1";
//        String str2 = "Test1";
//        System.out.println(str1.equalsIgnoreCase(str2));
//    }
//}

//public  class Main2 {
//    public static void main(String[] args) {
//        int[] arr = {56789,6789,67};
//        System.out.println(check(arr));
//    }
//
//    public static int  check(int[] arr) {
//        int check = arr[0];
//       for(int i=0; i<arr.length; i++){
//           check =  arr[i];
//       }
//       return check;
//    }
//}

//public class Main2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int ans = 1;
//        int reversed = 0;
//       while (num>0){
//           int check = num%10;
//           reversed = reversed + (check*ans);
//           num/=10;
//           ans*=2;
//
//        }
//        System.out.println(reversed);
//
//    }
//}

//public class Main2 {
//    public static void main(String[] args) {
//        String str = "acsgdhvsadxxxhabdwxxqid";
//        check(str,0,0,"");
//
//    }
//
//    public static void check(String str,int ind,int count,String newstr) {
//        if(ind==str.length()){
//            for(int i=0; i<=count; i++){
//                newstr+='x';
//
//            }
//            System.out.println(newstr);
//            return ;
//        }
//
//        char ch = str.charAt(ind);
//        if(ch == 'x'){
//           count++;
//            check(str,ind+1,count,newstr);
//        }else{
//            newstr+= ch;
//            check(str,ind+1,count,newstr);
//        }
//
//
//    }
//}
//public class Main2 {
//    public static void main(String[] args) {
//        int arr[][] = {{1,2,3},{2,3,4},{5,6,7}};
//        for(int i=0; i<arr.length; i++){
////            for(int j=0; j<arr[i].length; j++){
////                System.out.print(arr[i][j]+" ");
////            }
////            System.out.println();
////        }
////    }
////}
//
//public class Main2 {
//    public static void main(String[] args) {
//     int[] arr = {2,6,4,59,87,34,23};
//     int target = 59;
//        System.out.println(check(arr,target));
//    }
//
//    public static int check(int[] arr,int target) {
//        int i=0;
//        int end = arr.length-1;
//        while(i<=end){
//            boolean isAse = arr[i]<arr[end];
//        int mid = i+(end-i)/2;
//        if(target == arr[mid]){
//            return mid;
//        }
//        if(isAse) {
//            if (arr[mid] > target) {
//                end = mid - 1;
//            } else {
//                i = mid + 1;
//            }
//        }else{
//            if (arr[mid] < target) {
//                end = mid - 1;
//            } else  {
//                i = mid + 1;
//            }
//        }
//        }
//   return -1;
//    }
//}
//public class Main2 {
//    public static void main(String[] args) {
//        int[] arr ={7,5,6,3,2};
//        for(int i=1; i<arr.length; i++){
//            int elem = arr[i];
//            int check = i-1;
//            while(check>=0 && elem<arr[check]){
//                arr[check+1] = arr[check];
//                check--;
//            }
//            arr[check+1] = elem;
//
//        }
//    }
//}
//import java.util.ArrayList;
//
//public class Main2 {
//    public static void main(String[] args) {
//        int[] arr = {12, 3, 4, 5, 6};
//        ArrayList<Integer> arrr = reverse(arr, arr.length - 1, new ArrayList<>());
//        System.out.println(arrr);
//    }
//
//    public static ArrayList<Integer> reverse(int[] arr, int index, ArrayList<Integer> reversedList) {
//        if (index < 0) {
//            return reversedList;
//        }
//        reversedList.add(arr[index]);
//        return reverse(arr, index - 1, reversedList);
//    }
//}

//public class Main2 {
//    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(3);
//        arr.add(2);
//        arr.add(5);
//        arr.add(4);
//        for(int i=0; i<arr.size()-1; i++) {
//            for (int j = 0; j < arr.size() - 1 - i; j++) {
//                if (arr.get(j + 1) < arr.get(j)) {
//                    int temp = arr.get(j);
//                    arr.set(j, arr.get(j + 1));
//                    arr.set(j + 1, temp);
//                }
//            }
//        }
//            System.out.println(arr);
//    }
//
//
//}



//
//public class Main2 {
//    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(3);
//        arr.add(2);
//        arr.add(5);
//        arr.add(4);
//        for(int i=0; i<arr.size()-1; i++) {
//            int min =i;
//            for (int j = i+1; j < arr.size() ; j++) {
//                if(arr.get(i)>arr.get(j)){
//                    min = j;
//                }
//            }
//            int temp = arr.get(i);
//            arr.set(i,arr.get(min));
//            arr.set(min,temp);
//        }
//        System.out.println(arr);
//
//    }

//
//}


// HAshMap...
//public class Main2 {
//    public static void main(String[] args) {
//        HashMap<String,Integer> map = new HashMap<>();
//        map.put("class",12);
//        map.put("lamba",13);
//        System.out.println(map);
//        System.out.println(map.size());
//        System.out.println(map.get("class"));
//        System.out.println(map.containsValue(12));
//        map.replace("class",36);
//
//
//        System.out.println(map.getOrDefault("clas",0));
//        System.out.println(map);
//        for(String i: map.keySet()){
//            System.out.println(i+"-->"+map.get(i));
//        }
//        for(int i: map.values()){
//            System.out.println(i+"-->"+map.get(i));
//        }
//    }
//
//
//}
// for repeated elements.....
//import java.util.HashMap;
//
//public class Main2 {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,5,6,5,7,6,7,8};
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0; i<arr.length; i++){
//            if(map.containsKey(arr[i]) && map.get(arr[i]) != i){
//                System.out.println(arr[i]);
//            }
//            map.put(arr[i],i);
//        }
//    }
//}

//public class Main2 {
//    public static void main(String[] args) {
//        int arr[] = {1,3,4,8,5,6,7,9,10};
//        System.out.println(missingNumber(arr));
//    }
//    public static ArrayList<Integer> missingNumber(int[] nums) {
//        int i=0;
//        ArrayList<Integer> arrr = new ArrayList<>();
//        while(i<nums.length){
//            int correct = nums[i];
//            if(nums[i]<nums.length && nums[correct]!=nums[i]){
//                swap(nums,i,correct);
//            }else{
//                i++;
//            }
//        }
//        for(int index =0; index<nums.length; index++){
//            if(nums[index]!=index){
//                arrr.add(index);
//            }
//        }
//        return arrr;
//    }
//    public static void swap(int [] nums,int start,int end){
//        int temp = nums[start];
//        nums[start] = nums[end];
//        nums[end] = temp;
//
//    }
//}


//public class Main2 {
//    public static void main(String[] args) {
//        int a =0;
//        int b= 1;
//        System.out.println(a);
//        System.out.println(b);
//        Fabbinoic(a,b,10);
//
//    }public static void Fabbinoic(int a,int b,int n) {
//        if(n==0){
//            return ;
//        }
//        System.out.println(a+b);
//        Fabbinoic(b,a+b,n-1);
//
//    }
//
//}

//public class Main2 {
//    public static void main(String[] args) {
//        check(1,0);
//    }
//
//    public static int check(int n,int sum) {
//
//        if(n==10)
//        {
//            System.out.println(sum);
//            return 0;
//        }
//      return  sum+=check(n+1,0);
//    }
//}
//public class Main2 {
//    public static void main(String[] args) {
//
//        System.out.println(check(-12));
//    }
//
//    public static int check(int n) {
//        if(n<0){
//            System.out.println("factorial is not define");
//            return 0;
//        }
//        if(n==0 || n==1){
//            return 1;
//        }
//        return n*check(n-1);
//
//    }
//}
//
//public class Main2 {
//    public static void main(String[] args) {
//        int a =0;
//        int b = 1;
//        System.out.print(a+" ");
//        System.out.print(b+" ");
//        check(a,b,10);
//    }
//
//    public static void check(int a,int b,int n) {
//        if(n==0){
//            return ;
//        }
//        System.out.print(a+b+" ");
//        check(b,a+b,n-1);
//    }
//}
//
//import java.util.Scanner;
//public class Main2 {
//    public static void main(String[] args) {
//        // Ask the user for the first input.
//        System.out.print("Enter the first character:");
//        // Use the scanner class to get the user input.
//        Scanner s1 = new Scanner(System.in);
//        // Gets a single character.
//        char value1 = s1.nextLine().toCharArray()[0];
//        // Check whether the user input is in lower case or not.
//        boolean check1 = Character.isLowerCase(value1);
//        // Print the first result.
//        if(check1){
//            System.out.print("The first character \'"+value1+"\' is in lower case.\n");
//        }
//        else{
//            System.out.print("The first character \'"+value1+"\' is not in lower case.\n");
//        }
//        System.out.print("Enter the second character:");
//        Scanner s2 = new Scanner(System.in);
//        char value2 = s2.nextLine().toCharArray()[0];
//        boolean check2 = Character.isLowerCase(value2);
//        if(check2){
//            System.out.print("The second character \'"+value2+"\' is in lower case.\n");
//        }
//        else{
//            System.out.print("The second character \'"+value2+"\' is not in lower case.\n");
//        }
//    }
//}

//
//public class Main2 {
//    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>();
//        set.add(12);
//        set.add(13);
//        System.out.println(set);
//        System.out.println(set.contains(12));
//        set.remove(13);
//        set.remove(12);
//        System.out.println(set);
//        System.out.println(set.isEmpty());
//        set.add(1234);
//        set.add(1235);
//        set.add(1236);
//        System.out.println(set.iterator());
//        set.toArray();
//        System.out.println(set);
//    }
//}




