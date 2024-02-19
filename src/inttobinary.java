import javax.print.attribute.standard.PagesPerMinute;
import java.util.Scanner;

public class inttobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = 1;
        int reversed = 0;
        while(num>0){
         int rem = num%2;
         reversed += rem*power;
         power*=10;
         num/=2;

        }
        System.out.println(reversed);
    }
}
