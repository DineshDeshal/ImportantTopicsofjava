//public class pallidronenum {
//    public static void main(String[] args) {
//        int n =6789;
//        System.out.println(check(n));
//    }
//
//    public static int check(int n) {
//
//        int reversed = 0;
//
//        while(n==0){
//           int  reminder = n%10;
//           reversed = reversed * 10 + reminder;
//           n/=10;
//        }
//     if(reversed == n){
//         System.out.println(n +" " + " is pallidrone" );
//     }else{
//         System.out.println(n+" "+"is not pallidrone");
//     }
//     return reversed;
//    }
//}


class pallidronenum {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase();
        str=str.replaceAll("[^a-z0-9]", "");
        for (int i =0;i<str.length()/2;i++){
            char start =str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if ( start != end){
                return false;
            }
        };
        return true;
    }
}
