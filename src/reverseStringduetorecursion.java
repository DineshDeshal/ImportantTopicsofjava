public class reverseStringduetorecursion {
    public static void main(String[] args) {
        String str = "hsenid";
        check(str,str.length()-1);
    }

    public static void check(String str,int ind) {
        if(ind==0){
            System.out.print(str.charAt(ind));
            return;
        }
        System.out.print(str.charAt(ind));
        check(str,ind-1);
    }
}
