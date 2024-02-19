import java.util.HashSet;
import java.util.Scanner;
public class subsequence2unique {

        public static void main(String[] args) {
            String str = "aaa";
            HashSet <String> set = new HashSet<>();
            check(str,0,"",set);
        }

        public static void check(String str,int ind,String newstr,HashSet<String> set) {
            if(ind == str.length()){
                if(set.contains(newstr)){
                    return;
                }else{
                    System.out.println(newstr);
                    set.add(newstr);
                    return;
                }
            }
            char common = str.charAt(ind);
            // to be...
            check(str,ind+1,newstr+common,set);
            // not to be...
            check(str,ind+1,newstr,set);
        }


    }


