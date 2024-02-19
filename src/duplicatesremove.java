public class duplicatesremove {
    public static void main(String[] args) {
        String str = "abab";
        check(str,0,"");
    }
       public static boolean[] arr = new boolean[26];
    public static void check(String str,int ind,String newstr) {
        if(ind==str.length()){
            System.out.println(newstr);
            return;
        }
        char element = str.charAt(ind);
        if(arr[element-'a']){
            check(str,ind+1,newstr);
        }else{
            newstr+=element;
            arr[element-'a']=true;
            check(str,ind+1,newstr);
        }
    }
}

