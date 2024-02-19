public class subsequenceimp {
    public static void main(String[] args) {
        String str = "abc";
        check(str,0,"");
    }

    public static void check(String str,int ind,String newstr) {
        if(ind == str.length()){
            System.out.println(newstr);
            return;
        }
         char common = str.charAt(ind);
        // to be...
         check(str,ind+1,newstr+common);
        // not to be...
        check(str,ind+1,newstr);
    }


}
