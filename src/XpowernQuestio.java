//public class XpowernQuestio {
//
//    public static int printPower(int x, int n) {
//        if (n == 0) {
//            return 1;
//        }
//        if(x==0){
//            return 0;
//        }
//        if (n % 2 == 0) {
//            return printPower(x, n / 2) * printPower(x, n / 2);
//        } else {
//            return x * printPower(x, n / 2) * printPower(x, n / 2);
//        }
//    }
//
//    public static void main(String args[]) {
//        int x = 2, n = 5;
//        int output = printPower(x, n);
//        System.out.println(output);
//    }
//}


public class XpowernQuestio {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        System.out.println(check(x,n));
    }

    public static int check(int x,int n) {
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int  pow1 = check(x,n-1);
        int power = pow1*x;
        return power;

    }
}