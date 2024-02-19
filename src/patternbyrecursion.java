public class patternbyrecursion {
    public static void main(String[] args) {
        check(4,0);
    }

    public static void check(int r,int c) {
        if(r==0){
            return;
        }
        if(r>c){
            System.out.print("*");
            check(r,c+1);
        }else{
            System.out.println();
            check(r-1,0);

        }

    }
}
