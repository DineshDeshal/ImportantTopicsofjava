

import java.util.Scanner;

public class Functionmethod {

    public static int Sum(int a , int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String arg[]){
      Scanner sc  = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int sumof = Sum(a,b);
        System.out.println(sumof);

    }
}






