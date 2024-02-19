import java.util.Scanner;

public class logicofbinarytointeger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int check =0;
        int power = 1;
        while(p>0){
            int rem = p%10;
            check+=rem*power;
            p/=10;
            power*=2;
        }
        System.out.println(check);
    }
}
