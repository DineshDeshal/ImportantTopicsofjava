class Trial {

    public static void main(String [] args){
        int n=20;
        int count=0;
        long fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
        while(fact>0){  //120 // true // true
            if(fact%10==0){ //true  // false // false
                count++;  // count=1
            }
            fact/=10;  // fact=12, 1 ,0
        }
        System.out.println(count);
    }
}
