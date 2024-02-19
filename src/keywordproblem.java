
public class keywordproblem {

public static void main(String[] args) {
        String str = "2";

        check(str,0,"");
        }
    public static String arr[] = {".","abc","def","ghi","jkl","mno","pqrs","tu","vw","xyz"};

   public static void check(String str, int ind, String newstr) {
        if(ind==str.length()){
                System.out.println(newstr);
                return ;

        }
        char common = str.charAt(ind);
        String mapping = arr[common-'0'];
        for(int i=0; i<mapping.length(); i++){
        check(str,ind+1,newstr+mapping.charAt(i));
        }

    }
}



