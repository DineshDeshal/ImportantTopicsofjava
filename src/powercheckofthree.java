//public class powercheckofthree {
//    Given an integer n, return true if it is a power of three. Otherwise, return false.
//
//    An integer n is a power of three, if there exists an integer x such that n == 3x.
//class Solution {
//    public boolean isPowerOfThree(int n) {
//        if(n<=0){
//            return false;
//        }
//        while(n%3==0){
//            n/=3;
//        }
//        return n==1;
//    }
//}
//}
class Solution {
    public String intToRoman(int num) {
        String roman = "";
        int check[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] check1 = {"I","iV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        for(int i=0; i<check.length; i++ ){
            while(num>=check[i]){
                roman = roman+check1[i];
                num =num - check[i];
            }
        }
        return roman;
    }
}