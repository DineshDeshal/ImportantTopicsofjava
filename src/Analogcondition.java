import java.util.Arrays;

public class Analogcondition {
    public static void main(String[] args) {
        String s = "Dinesh";
        String p = "shynDi";
        System.out.println(check(s,p));
    }

    public static boolean check(String a,String p) {
        boolean anagram = false;
        if(a.length() == p.length()){
            char[] arr = a.toCharArray();
            char[] arr1 = p.toCharArray();
            Arrays.sort(arr);
            Arrays.sort(arr1);
            if(Arrays.equals(arr,arr1)){
                anagram = true;
            }
        }

        return anagram;
    }
}