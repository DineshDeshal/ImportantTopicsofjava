public class matrixpathsstartingtoending {
    public static void main(String[] args) {
        int m=3;
        int n = 3;
        System.out.println(Matrixbacktracking(0,0,m,n));
    }

    public static int Matrixbacktracking(int i , int j, int m ,int n) {
        if(i==m || j==n){
            return 0;
        }
        if(i==m-1 || j==n-1){
            return 1;
        }
        //downwards ....
        int downwards = Matrixbacktracking(i+1,j,m,n);
        // right...
        int rightward = Matrixbacktracking(i,j+1,m,n);
        int both = downwards+rightward;
       return both;
    }
}
