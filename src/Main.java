import java.util.Scanner;

//public class Main{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int d = sc.nextInt();
//        for(int i=1; i<=10; i++){
//            System.out.println(d*i);
//        }
//    }
//}

// print star in square
//public class Main{
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int D = 4;
//        int p = 4;
//      for(int i=1; i<=D; i++){
//          for(int j=1; j<=p; j++){
//              System.out.print("*");
//          }
//          System.out.println();
//      }
//    }}

//public class Main {
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int d = 12;
//        for(int i = 2; i<d; i++){
//            if(d%i==0){
//                System.out.print("no this is not prime no.");
//
//            }else{
//                System.out.println("yes this is a prime no.");
//            }
//        }
//    }
//}

// \n use for new line.....

// if you want that space that equal to text then use \t


//public class Main {
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5,8};
//        System.out.println(check(arr));
//    }
//
//    public static int check(int [] arr) {
//        int gcd = 0;
//        for(int i=0; i< arr.length-1; i++){
//
//            int min = arr[i];
//            int max = arr[i];
//            if(min>arr[i+1]){
//                min = arr[i+1];
//            }
//            if(max<arr[i+1]){
//               max = arr[i+1];
//            }
//            if(max>min){
//             gcd =  max-min;
//            }
//
//
//
//        }
//       return gcd;
//    }
//}



//class Main{
//    public static void main(String[] args) {
//        int n = 942;
//        int lastdigit = 0;
//        int res = 0;
//        int temp = n;
//        while(temp>0){
//            lastdigit = temp%10;
//            res = res + lastdigit;
//            temp = temp/10;
//        }
//        System.out.println(res);
//    }
////}

//
//public class Main{
//
//    public static void main(String[] args) {
//        int number = 1346;
//        int singleDigitSum = calculateSingleDigitSum(number);
//
//        System.out.println("Single-digit sum of digits of " + number + " is: " + singleDigitSum);
//    }
//
//    public static int calculateSingleDigitSum(int num) {
//        int sum = sumOfDigits(num);
//
//
//        if (sum >= 10) {
//            // If not, recursively calculate the single-digit sum
//            return calculateSingleDigitSum(sum);
//        } else {
//            // If the sum is a single digit, return it
//            return sum;
//        }
//    }
//
//    public static int sumOfDigits(int num) {
//        int sum = 0;
//
//        while (num != 0) {
//
//            int digit = num % 10;
//
//
//            sum += digit;
//
//
//            num /= 10;
//        }
//
//        return sum;
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int n = 637;
//        System.out.println(nowripitsum(n));
//
//    }
//    public static int nowripitsum(int n){
//        int sum = sumofdigits(n);
//        if(sum>=10){
//            return nowripitsum(sum);
//        }else{
//            return sum;
//        }
//    }
//    public static int sumofdigits(int n){
//        int sum = 0;
//        while(n!=0){
//            int Digit = n%10;
//            sum = sum + Digit;
//            n/=10;
//        }
//        return sum;
//    }
//}
//
//
//public class Main {
//
//    public static void rotate(int[] nums, int k) {
//        // Calculate the effective rotation steps, in case k is greater than the array length
//        k = k % nums.length;
//
//        // Reverse the entire array
//        reverse(nums, 0, nums.length - 1);
//
//        // Reverse the first k elements
//        reverse(nums, 0, k - 1);
//
//        // Reverse the remaining elements
//        reverse(nums, k, nums.length - 1);
//    }
//
//    private static void reverse(int[] nums, int start, int end) {
//        while (start < end) {
//            // Swap elements at start and end indices
//            int temp = nums[start];
//            nums[start] = nums[end];
//            nums[end] = temp;
//
//            // Move indices towards the center
//            start++;
//            end--;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
//        int k1 = 3;
//        rotate(nums1, k1);
//
//        printArray(nums1);
//
//
//    }
//
//    private static void printArray(int[] nums) {
//        for (int num:nums) {
//            System.out.print(num + " ");
//        }
//
//    }
//}
import java.util.*;
import java.util.jar.JarOutputStream;
//public class Main {
//
//    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5,7};
//        check(arr);
//
//    }
//    public static void check(int[] nums) {
//        int check[] = new int[nums.length];
//        for(int i=0; i< nums.length-1; i++){
//
//            check[i] = nums[nums.length-1-i];
//
//        }
//        for(int i:check){
//            System.out.print(i + " ");
//        }
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//       String str = "ftdwgjsxxxregsx";
//       check(str,0,0,"");
//    }
//
//    public static void check(String str,int count,int ind,String newstr) {
//        if(ind==str .length()){
//            if(ind == str.length()){
//                for(int i=1; i<=count; i++) {
//                   newstr+='x' ;
//                }
//                System.out.println(newstr);
//                return;
//            }
//
//        }
//        char common = str.charAt(ind);
//      if(common == 'x'){
//          count++;
//          check(str,count,ind+1,newstr);
//      }else{
//          newstr+= common;
//          check(str,count,ind+1,newstr);
//
//      }
//    }
//}

//public  class Main {
//    public static void main(String[] args) {
//        String str = "fgsndskkdsma";
//        check(str,0,'a');
//    }
//    public static int first = 1;
//    public  static int  last = -1;
//    public static void check(String str,int ind, char element) {
//      if(ind==str.length()){
//          System.out.println(first);
//          System.out.println(last);
//          return;
//      }
//        char common = str.charAt(ind);
//        if(common==element){
//            if(first==1){
//                first = ind;
//
//            }else{
//                last = ind;
//            }
//        }
//        check(str,ind+1,element);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        String str = "-1";
//        System.out.println(check(str));
//    }
//       int p =0;
//
//
//    public static int check(String str) {
//        int reverse = 0;
////      if(str.length()==1){
////          return str.charAt(0);
////      }
//        if(str==null){
//           return  0;
//        }
//        int d = Integer.parseInt(str);
//        while (d != 0) {
//
//            int reminder = d % 10;
//            reverse = reverse * 10 + reminder;
//            d /= 10;
//
//        }
//        return reverse;
//    }
////
////}
//
////public class Main {
////    public static void main(String[] args) {
////        int a =10;
////        int b = 20;
////        int f =40;
////        int hcf = hcf(hcf( a, b),f);
////        System.out.println(hcf);
////    }
////
////    public static int hcf(int a,int b) {
////        if (b == 0) {
////            return a;
////        } else {
////            return hcf(b, a % b);
////        }
////    }
////}
////
////public class Main {
////    public static void main(String[] args) {
////        int x = 5;
////        int p = 2;
////        System.out.println(check(x,p));
////    }
////
////    public static int check(int x,int n) {
////        if(n==0){
////            return 1;
////        }
////        if(x==0){
////            return 0;
////        }
////
////       int p =  check(x,n-1) * x;
////       return p;
////
////    }
////}
//
//import java.util.Arrays;
//
//class Main {
//    public static void main(String[] args) {
//        String str1 = "Race";
//        String str2 = "Care";
//
//        str1 = str1.toLowerCase();
//        str2 = str2.toLowerCase();
//
//        // check if length is same
//        if(str1.length() == str2.length()) {
//
//            // convert strings to char array
//            char[] charArray1 = str1.toCharArray();
//            char[] charArray2 = str2.toCharArray();
//
//            // sort the char array
//            Arrays.sort(charArray1);
//            Arrays.sort(charArray2);
//
//            // if sorted char arrays are same
//            // then the string is anagram
//            boolean result = Arrays.equals(charArray1, charArray2);
//
//            if(result) {
//                System.out.println(str1 + " and " + str2 + " are anagram.");
//            }
//            else {
//                System.out.println(str1 + " and " + str2 + " are not anagram.");
//            }
//        }
//        else {
//            System.out.println(str1 + " and " + str2 + " are not anagram.");
//        }
//    }
//}
//public class Main {
//    public static List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> res = new ArrayList<>();
//        HashMap<String, List<String>> map = new HashMap<>();
//        for(int i=0;i<strs.length;i++){
//            char str[] = strs[i].toCharArray();
//            // sort string
//            Arrays.sort(str);
//            String s = String.valueOf(str);
//            if(map.get(s)!=null){
//                List<String> a = map.get(s);
//                a.add(strs[i]);
//                map.put(s, a);
//            }
//            else{
//                List<String> a = new ArrayList<>();
//                a.add(strs[i]);
//                map.put(s, a);
//            }
//        }
//        for(Map.Entry<String, List<String>> en:map.entrySet()){
//            res.add(en.getValue());
//        }
//        return res;
//    }
//    public static void main (String[] args) throws java.lang.Exception
//    {
//        String[] words = {"pop","bat","tab","opp"};
//        List<List<String>> res = groupAnagrams(words);
//        System.out.println(res);
//    }
//
//}

//public class Main {
//    public static void main(String[] args) {
//    int arr[] = {1,2,3};
//        System.out.println(check1(arr));
//    }
//
//    public static int check1(int[] arr ) {
//        int check = 0;
//        for(int i=0; i<arr.length; i++){
//            int max = arr[i];
//            int max1 = arr[i+1];
//            int max2 = arr[i+2];
//            if(max<max1){
//                if(max1<max2){
//                   check =  max1;
//                }else{
//                    check =  max2;
//                }
//            }else{
//                if(max>max2){
//                  check =  max;
//                }else{
//                   check = max2;
//                }
//            }
//         }
//        return check;
//    }
//}
//import java.util.*;

//public class Main {
//    public static void main(String[] args) {
//        int arr[] = {12, 34, 45, 56, 3, 56, 2, 65, 32};
//        int min = Integer.MAX_VALUE;
//
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//
//        }
//        System.out.println(min);
//        }
//
//    }
//import java.util.LinkedList;
//public class Main {
//    public static void main(String[] args) {
//        LinkedList<Integer> ll = new LinkedList<>();
//        ll.addFirst(3);
//        System.out.println(ll);
//        ll.add(4);
//        System.out.println(ll);
//        int p=ll.getLast();
//        System.out.println(p);
//    }
//}

//
//public class Main {
//    public static void main(String[] args) {
//int[] arr = {16,3,45,2,4,6,9};
//check(arr);
//    }
//    public static void check(int [] arr){
//        for(int i=0; i<arr.length-1; i++){
//            for(int j=0; j<arr.length-1-i; j++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+ " ");
//        }
//    }
//}
//



//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {2, 4, 6, 7, 8, 9};
//        int target = 4;
//        System.out.println(check(arr, target, 0));
//    }
//
//    public static int check(int[] arr, int target, int index) {
//        if (index >= arr.length) {
//            // Base case: index is out of bounds
//            return -1;
//        }
//
//        if (arr[index] == target) {
//            // Element found, return the index
//            return index;
//        }
//
//        // Recursively check the rest of the array
//        return check(arr, target, index + 1);
//    }
//}

//
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {14, 6, 7, 8, 6, 5, 4};
//        int target = 1;
//        System.out.println(check(arr, target, 0,new ArrayList<>()));
//    }
//
//    public static ArrayList<Integer> check(int[] arr, int target, int index,ArrayList<Integer> list) {
//
//
//        if (index == arr.length) {
//            return list;
//        }
//
//        if (arr[index] == target) {
//            list.add(index);
//        }
//
//        // Recursively check the rest of the array
//        return check(arr, target, index + 1,list);
//
//
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {12,34,23,45,3,77};
//        check(arr);
//    }
//
//    public static void check(int[] arr) {
//        for(int i=0;i<arr.length-1; i++){
//            int smallest = i;
//            for(int j= i+1; j<arr.length; j++){
//                if(arr[smallest]>arr[j]){
//                    smallest = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[smallest];
//            arr[smallest] = temp;
//        }
//        for (int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//
//}




//
//public class Main {
//    public static void main(String[] args) {
//        int[][] arr = {{1, 10, 3}, {4, 5, 6}, {7, 8, 9}};
//        check(arr);
//    }
//
//    public static void check(int[][] arr) {
//         // Corrected array dimension
//         // Corrected array dimension
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < i; j++) {
//                int temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) { // Corrected loop condition
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println(); // Add a new line after each row
//        }
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        System.out.println(check(4));
//    }
//
//    public static int check(int n) {
//        if(n==0 || n==1){
//            return 1;
//        }
//        return check(n-1)*n;
//
//    }
//}
//import java.util.HashMap;
//import java.util.Map;
//
//public class Main {
//    public static void main(String[] args) {
//        String s = "Your input string here";
//        String[] words = s.split(" "); // Split string into words
//
//        Map<String, Integer> map = new HashMap<>();
//
//        for (String word : words) {
//            // Update word frequency in the map
//            map.put(word, map.getOrDefault(word, 0) + 1);
//        }
//
//        // Display word frequencies
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println("Word: " + entry.getKey() + ", Frequency: " + entry.getValue());
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        check(arr);
//    }
//
//    public static void check(int[][] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < i; j++) {
//                int temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++){
//                System.out.print(arr[i][j]+" ");
//
//        }
//            System.out.println();
//    }}
//}

//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(print(100));
//    }
//
//    public static boolean check(int n) {
//        if (n == 0 || n == 1) {
//            return false;
//        }
//        boolean test = true;
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                test = false;
//                break;
//            }
//        }
//        return test;
//    }
//
//   public static int print(int n) {
//        int count = 0;
//        for (int i = 2; i <= n; i++) {
//            if (check(i)==true) {
//               count++;
//            }
//        }
//        return count;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        String Str = "Hello guys what are Hello";
//
//        String[] Words = Str.split(" ");
//        HashMap<String,Integer> map = new HashMap<>();
//        for(String w : Words){
//            int count =0;
//            for(String w1 : Words){
//                if(w.equals(w1)){
//                    count++;
//                }
//            }
//            map.put(w,count);
//        }
//        for(String s: map.keySet()){
//            System.out.println(s+"="+map.get(s));
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int a =0;
//        int b =1;
//        System.out.println(a);
//        System.out.println(b);
//        fabni(a,b,10);
//    }
//
//    public static void fabni(int a,int b,int n) {
//        if(n==0){
//            return ;
//        }
//        int c=  a+b;
//        System.out.println(c);
//        fabni(b,c,n-1);
//
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//   int[][] s = {{1,2,3},{4,5,6},{7,8,9}};
//   check(s);
//    }
//
//    public static void check(int[][] s) {
//        for(int i=0; i<s.length; i++){
//            for(int j=0; j<i; j++){
//                int temp = s[i][j];
//                s[i][j] = s[j][i];
//                s[j][i] = temp;
//            }
//        }
//        for(int i=0; i<s.length; i++){
//            for(int j=0; j<s[i].length; j++) {
//                System.out.print(s[i][j]+" ");
//
//            }
//            System.out.println();
//            }
//
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        recursion(3,"src","helper","Des");
//    }
//
//    public static void recursion(int n,String src,String helper,String Destination) {
//        if(n==1){
//            System.out.println(n+" Disk transfer "+src+" to "+Destination);
//            return;
//        }
//        recursion(n-1,src,Destination,helper);
//        System.out.println();
//        recursion(n-1,helper,src,Destination);
//
//    }
//}

//
//public class Main {
//    public static void main(String[] args) {
//        String str = "hsenid";
//        check(str,str.length()-1);
//    }
//
//    public static void check(String str,int i) {
//        if(i==0){
//            System.out.print(str.charAt(i));
//            return ;
//        }
//        System.out.print(str.charAt(i));
//        check(str,i-1);
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        int target = 9;
//        int[] arr1 = check(arr,target);
//        System.out.println(arr1);
//    }
//
//    public static int[] check(int[][] arr,int target) {
//        int s = 0;
//        int e = arr.length-1;
//        while(s<arr.length && e>=0){
//            if(arr[s][e]==target){
//                return new int[]{s,e};
//            }
//            if(arr[s][e]>target){
//                e--;
//            }else{
//                s++;
//            }
//        }
//        return new int[]{-1,-1};
//
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,87};
//        int target = 8;
//        System.out.println(check(arr,target));
//    }
//
//    public static int check(int[] arr,int target) {
//        int s= 0;
//        int e = arr.length-1;
//        while(s<=e){
//            int mid = s+(e-s)/2;
//            if(target>arr[mid]){
//                s = mid +1;
//            }else if(target<arr[mid]){
//                e = mid -1 ;
//            }
//            else{
//                return arr[mid];
//            }
//        }
//        return arr[e];
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,54,6,7};
//        int target = 3;
//
//        System.out.println(searchrange(nums,target));
//    }
//    public static int[] searchrange(int[] nums,int target){
//        int[] result = {-1,-1};
//        result[0] = check(nums,target,true);
//        result[1] = check(nums,target,false);
//        return result;
//    }

//    public static int check(int[] nums,int target,boolean isFirst) {
//        int result = -1;
//        int start = 0;
//        int end = nums.length-1;
//        while(start<=end){
//            int mid = start +(end-start)/2;
//            if(target>nums[mid]){
//                start = mid +1 ;
//            }else if(target<nums[mid]){
//                end = mid -1;
//            }else{
//                result = mid;
//                if(isFirst){
//                    end = mid -1;
//                }else{
//                    start = mid +1;
//                }
//            }
//        }
//        return result;
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        System.out.println(check(arr,0));
//
//    }
//
//    public static boolean check(int[] arr,int index) {
//        if(index == arr.length-1){
//            return true;
//        }
//        return arr[index]<arr[index+1] && check(arr,index+1);
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//int[] arr = {1,2,3,4,788,9,10};
//int target = 4;
//        System.out.println(check(arr,target,0));
//    }
//
//    public static int check(int[] arr,int target,int index) {
//     if(index==arr.length){
//         return  -1;
//     }
//     if(arr[index]==target){
//         return index;
//     }
//     return check(arr,target,index+1);
//    }
//}

import java.util.ArrayList;
import java.util.List;

//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 90, 3 ,4 ,3};
//        int target = 3;
//
//        List<Integer> result = check(arr, target, 0);
//        System.out.println(result);
//    }
//    static ArrayList<Integer> arrayList =  new ArrayList<>();
//    public static List<Integer> check(int[] arr, int target, int index) {
//        if (index == arr.length) {
//            return arrayList;
//        }
//
//        if (target == arr[index]) {
//            arrayList.add(index);
//        }
//
//        return check(arr, target, index + 1);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        check(4,0);
//    }
//
//    public static void check(int r,int c) {
//        if(r==0){
//            System.out.println("*");
//            return ;
//        }
//        if(r>c){
//            System.out.print("*");
//            check(r,c+1);
//        }else{
//            System.out.println("*");
//            check(r-1,0);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {4,52,3,4,88,66};
//        check(arr);
//    }
//
//    public static void check(int[] arr) {
//
//        for(int i=0; i<arr.length-1; i++){
//            for(int j=0; j<arr.length-i-i; i++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//    for(int i=0; i<arr.length; i++){
//        System.out.println((arr[i]));
//    }
//
//
//    }
////}
//public class Main {
//    public static void main(String[] args) {
//        check1(1);
//        check(5);
//        System.out.println(factorilal(0));
//        System.out.println(sum(8));
//        System.out.println(sumdigit(1234,0));
//        System.out.println(muldigit(123));
//        reverse(1234);
//        System.out.println(sum);
//    }
//
//    public static void check1(int n1) {
//        if(n1==5){
//            return ;
//        }
//        System.out.println(n1);
//        check1(n1+1);
//
//    }
//
//    public static void check(int n) {
//        if(n==0){
//            return ;
//        }
//        System.out.println(n);
//       check(n-1);
//    }
//
//    public static int factorilal(int n) {
//        if(n==0 || n==1){
//            return 1;
//        }
//
//        return n*factorilal(n-1);
//
//    }
//    public static int sum(int n) {
//        if(n==0 || n==1){
//            return 0;
//        }
//
//        return n+sum(n-1);
//
//    }
//    public static int sumdigit(int n,int sum) {
//       if(n==0){
//           return n;
//       }
//     int digit = n%10;
//      sum = digit+sumdigit(n/10,sum) ;
//       return sum;
//    }
//    public static int muldigit(int n) {
//        if(n%10==n){
//            return n;
//        }
//        int digit = n%10;
//        return digit*muldigit(n/10);
//    }
//    static int sum = 0;
//    public static void reverse(int n) {
//        if(n==0){
//            return ;
//        }
//        int digit = n%10;
//        sum = sum*10+digit;
//        reverse(n/10);
//
//    }
//
//}

//public class Main {
//    public static void main(String[] args) {
//        System.out.println(check(1211));
//    }
//
//    public static boolean check(int n) {
//        String p = String.valueOf(n);
//        int i = 0;
//        int j = p.length() - 1;
//
//        while (i <= j) {
//            if (p.charAt(i) != p.charAt(j)) {
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;
//    }
//}
//
//   public class Main {
//       public static void main(String[] args) {
//           System.out.println(recur(1234108080,0));
//       }
//
//       public static int recur(int n,int count) {
//           if(n==0){
//               return count;
//           }
//           if(n%10==0){
//               return recur(n/10,count+1);
//           }
//           return recur(n/10,count);
//
//       }
//}


// check the array that array is sorted or not...
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,3};
//        System.out.println(check(arr,0));
//    }
//
//    public static boolean check(int[] arr,int index) {
//        if(index==arr.length-1){
//            return true;
//        }
//        return arr[index]<arr[index+1] && check(arr,index+1);
//
//    }
//}

// linear search Due recursion..


//public class Main {
//    public static void main(String[] args) {
//        int[] ar = {1,2,3,4,10,5,6,7,7,8};
//        int target = 7;
//ArrayList<Integer> arrr= check(ar,0,target,new ArrayList<>());
//        System.out.println(arrr);
//    }
//
//    public static ArrayList<Integer> check(int[] arr,int index,int target,ArrayList<Integer> list) {
//        if(index==arr.length)
//        {
//            return list;
//        }
//        if(arr[index]==target){
//            list.add(index);
//        }
//    return check(arr,index+1,target,list);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//         int [] arr = {4,5,6,7,1,2,3};
//
//        System.out.println(check(arr));
//    }
//
//    public static int check(int[] arr) {
//        int i =0;
//        int e = arr.length-1;
//        while(i<=e){
//            int mid = i + (e-i)/2;
//
//            if(arr[mid]>arr[mid+1]){
//                return mid;
//            }
//            if(arr[mid]<arr[mid-1]){
//                return mid-1;
//            }
//            if(arr[mid]<arr[i]){
//                e = mid -1;
//            }else{
//                i = mid +1;
//            }
//        }
//        return -1;
//    }
//}
import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9, 8};
//
//        bubblesortbyrecursion(arr, arr.length, 0);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void bubblesortbyrecursion(int[] arr, int r, int c) {
//        if (r == 0) {
//            return;
//        }
//        if (r - 1 > c) { // Corrected condition
//            if (arr[c] > arr[c + 1]) {
//                int temp = arr[c];
//                arr[c] = arr[c + 1];
//                arr[c + 1] = temp;
//            }
//            bubblesortbyrecursion(arr, r, c + 1);
//        } else {
//            bubblesortbyrecursion(arr, r - 1, 0);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,7,6};
//
//        check(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void check(int[] arr) {
//        for(int i=0; i<arr.length-1; i++){
//            int min = i;
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[min]>arr[j]){
//                    min =j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[min];
//            arr[min] = temp;
//        }
//
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        check(4,0);
//    }
//
//    public static void check(int r,int c) {
//        if(r==0){
//            return ;
//        }
//        if(r>c){
//            System.out.println("*");
//            check(r,c+1);
//        }else{
//            System.out.print("*");
//            check(r-1,0);
//        }
//
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {1,2,4,3,5,7,6};
//
//      check(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void check(int[] arr) {
//        for(int i=0; i< arr.length-1; i++){
//            for(int j=0; j<arr.length-1-i; j++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {1,3,2};
//        check(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void check(int[] arr) {
//        for(int i=0; i<arr.length-1; i++){
//            int min =i;
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[min]>arr[j]){
//                    min = j;
//                }
//
//            }
//            int temp = arr[i];
//            arr[i] = arr[min];
//            arr[min] = temp;
//
//        }
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
//
//    }
//}
// selection sorting//////

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,4,2,16,58,9};

        check(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void check(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            int min =0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min]>arr[j]){
                    min =j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;


        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

    }
}





















