public class occuranceofelementfrom1andlast {
    public static void main(String[] args) {
        String str = "abfdddfjsjdjskrkejsmdneejssddfkkk";
        check(str,0,'k');
    }
     public static int first = -1;
    public static int last = -1;
    public static void check(String str,int ind,char element) {
        if(ind==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char common = str.charAt(ind);
        if(common==element){
            if(first==-1){
                first = ind;
            }else{
                last = ind;
            }
        }
        check(str,ind+1,element);
    }
}
