//public class IntroductionofRecursion {
//    public static void main(String[] args) {
//
//        int ans = check(10);
//        System.out.println(ans);
//    }
//
//    public static int check(int n) {
//        if(n<2){
//            return n;
//        }
//        return check(n-1) + check(n-2);
//    }
//}

//public class IntroductionofRecursion {
//    public static void Printfab(int a,int b, int n){
//        if(n==0){
//            return ;
//        }
//        int c =a+b;
//        System.out.println(c);
//        Printfab(b,c,n-1);
//
//    }
//    public static void main(String[] args) {
//        int a = 0;
//
//        int b = 1;
//        System.out.println(a);
//        System.out.println(b);
//        int n = 7;
//        Printfab(a,b,n-2);
//    }
//}

import javax.swing.*;

//public  class IntroductionofRecursion   {
//    public static void main(String[] args) {
//        int n = 1;
//        int n1 = 5;
//        check(n);
//        check1(n1);
//    }
//
//    public static void check(int n) {
//        if(n==5){
//            return ;
//        }
//        System.out.print(n+" ");
//        check(n+1);
//    }
//    public static void check1(int n1) {
//        if(n1==0){
//            return ;
//        }
//        System.out.print(n1+" ");
//        check1(n1-1);
//    }
//}

//public class IntroductionofRecursion {
//    public static void main(String[] args) {
//        System.out.println(FACT(5));
//    }
//
//    public static int FACT(int n) {
//        if (n == 1 || n == 0) {  // Use || for logical OR
//            return 1;
//        }
//        int fact_1 = FACT(n - 1);
//        int res = fact_1 * n;
//        return res;
//    }
//}

//public class IntroductionofRecursion {
//    public static void main(String[] args) {
//        int n=1234;
//        System.out.println(check(n));
//    }
//
//    public static int check(int n) {
//        int reversed = 0;
//        if(n<10){
//            return n;
//        }
//        while(n>9){
//            while(n!=0){
//                int digit = n%10;
//                reversed = reversed + digit;
//                n/=10;
//
//            }
//            n=reversed;
//        }
//
//      return n;
//
//    }
//}

//public class IntroductionofRecursion {
//    public static void main(String[] args) {
//        int n = 1234;
//        System.out.println(check(n));
//    }
//
//    public static int check(int n) {
//        int reversed = 0;
//
//        // Check if n is already a single-digit number
//        if (n < 10) {
//            return n;
//        }
//
//        // Sum the digits of n
//        while (n != 0) {
//            int digit = n % 10;
//            reversed += digit;
//            n /= 10;
//        }
//
//        // Recursively call check with the sum of digits
//        return check(reversed);
//    }
//}

//
//public class IntroductionofRecursion {
//    public static void main(String[] args) {
//        int n =1234;
//        System.out.println(check(n));
//    }
//
//    public static int check(int n) {
//        if(n==0){
//            return 0;
//
//        }
//        int c = n%10;
//        int p = c+check(n%10);
//        return p;
//
//
//    }
//}
//public class IntroductionofRecursion {
//    public static void main(String[] args) {
//        int n = 1;
//        check(n);
//        int n1 = 5;
//        check1(n1);
//    }
//
//    public static void check(int n) {
//        if (n == 5) {
//            return;
//        }
//        System.out.println(n);
//        check(n + 1);
//
//    }
//
//    public static void check1(int n1) {
//        if (n1 == 0) {
//            return;
//        }
//        System.out.println(n1);
//        check(n1 - 1);
//    }
//}

//public class IntroductionofRecursion {
//    public static void main(String[] args) {
//        System.out.println(check(1234));
//    }
//
//    public static int check(int n) {
//        if(n==0){
//
//            return 0;
//        }
//        return check(n/10) + n%10;
//    }
//}


//public class IntroductionofRecursion {
//    public static void main(String[] args) {
//        System.out.println(check(1234));
//        System.out.println(check(4567));
//
//    }
//
//    public static int check(int n) {
//        if(n==0){
//            return 0;
//        }
//        return n%10+check(n/10);
//    }
//}

//public class IntroductionofRecursion {
//    public static void main(String[] args) {
//        System.out.println(productDigit(1234));
//    }
//
//    public static int productDigit(int n) {
//        if(n%10==n){
//            return n;
//        }
//        return n%10*productDigit(n/10);
//
//    }
//}

//public class IntroductionofRecursion {
//    public static void main(String[] args) {
//          check(1234);
//        System.out.println(sum);
//    }
//   static int sum =0;
//    public static void check(int n) {
//        if(n==0){
//            return ;
//        }
//        int digit = n%10;
//        sum = sum *10+digit;
//        check(n/10);
//    }
//}

//
//public class IntroductionofRecursion {
//    public static void main(String[] args) {
//        check(1212);
//    }
//
//    public static void check(int n) {
//        int sum =0;
//        int orginal = n;
//        while(n!=0){
//            int digit = n%10;
//            sum = sum *10+digit;
//            n/=10;
//        }
//        if(orginal==sum){
//            System.out.println("number is pallidrone");
//        }else{
//            System.out.println("bittbahancj=hd");
//        }
//
//    }
//}

//public class IntroductionofRecursion {
//    public static void main(String[] args) {
// checkpalli(121);
//    }
//   static int sum =0;
//
//    public static void checkpalli(int n) {
//        if(n==0){
//            return ;
//        }
//        int orginal =n;
//        int digit = n%10;
//        sum = sum *10+digit;
//        checkpalli(n/10);
//
//        if(sum==orginal){
//            System.out.println("pallidrome number");
//
//        }else{
//            System.out.println("paliindrome is not");
//        }
//
//    }
//}
// count zero in a perticular.......
//public class IntroductionofRecursion {
//    public static void main(String[] args) {
//        System.out.println(check(1202340));
//    }
//
//    public static int check(int n) {
//        if(n==0){
//            return 0;
//        }
//        int count =0;
//        if(n%10==0){
//            ++count;
//        }
//        check(n/10);
//        return count;
//    }
//}
public class IntroductionofRecursion {
    public static void main(String[] args) {
        System.out.println(check(1202340000));
    }

    public static int check(int n) {
        if (n == 0) {
            return 0;
        }
        int count = 0;
        if (n % 10 == 0) {
            ++count;
        }
        count += check(n / 10); // Fix: accumulate count from recursive call
        return count;
    }
}
