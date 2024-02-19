//public class recursion {
//    public static void printnum(int n){
//        if(n==6){
//            return;
//        }
//        System.out.println(n);
//        printnum(n+1);
//    }
//    public static void main(String[] args) {
//        // print the num 1 to 5
//        int n =1;
//        printnum(n);
//
//    }
//}

//   print the num 5 to 1
//public class recursion {
//    public static void printnum(int n){
//        if(n==0){
//            return ;
//        }
//        System.out.println(n);
//        printnum(n-1);
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        printnum(n);
//    }
//}

// print sum of first n netural num;
public class recursion {
    public static void printsum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return ;
        }
        sum+=i;
        printsum(i+1,n,sum);
    }
    public static void main(String[] args) {
        printsum(1,5,0);
    }
}

//public class recursion {
//    public static int calculatefact(int n){
//        if(n==0 || n==1){
//            return 1;
//        }
//      int fact_1 = calculatefact(n-1);
//        int total = fact_1*n;
//        return total;
//
//    }
//    public static void main(String[] args) {
//    int n = 4;
//    int ans = calculatefact(n);
//        System.out.println(ans);
//    }
//}
//
//public class recursion {
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