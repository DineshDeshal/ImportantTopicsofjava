import java.util.Scanner;

public class howtofindhcf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the Third number: ");
        int num3 = scanner.nextInt();
        System.out.println("The HCF of " + num1 + " , " + num2 + " and " +  num3  +" is " + hcf(hcf(num1,num2),num3));
    }

    public static int hcf(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return hcf(num2, num1 % num2);
        }
    }
}