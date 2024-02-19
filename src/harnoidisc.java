public class harnoidisc {
    public static void main(String[] args) {
        int n =3;
        check(n,"s","h"  ,"D");
    }

    public static void check(int n,String src,String helper,String Destination) {
        if(n==1){
            System.out.println("transfer disk"+n+"from"+src+"to"+Destination);
            return;
        }
        check(n-1,src,Destination,helper);
        System.out.println("transfer disk"+  n +" from "+ src +" to "+ Destination);
        check(n-1,helper,src,Destination);
    }
}
