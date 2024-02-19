public class charcountandaddinlast {
    public static void main(String[] args) {
        String s = "bsshixhddxbxggwygxxbbxyxgx";
        check(s,0,"",0);
    }

    public static void check(String s ,int ind,String newstr,int count) {

        if(ind==s.length()){
            for(int i=0; i<=count; i++){
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }
        char common = s.charAt(ind);
        if(common == 'x'){
            count++;
            check(s,ind+1,newstr,count);
        }else{
            newstr += common;
            check(s,ind+1,newstr,count);
        }

    }
}