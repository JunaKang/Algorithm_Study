import java.util.Scanner;

public class Boj2480 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max = num1;
        if (num2>max) max = num2;
        if (num3>max) max = num3;


        sc.close();
        if (num1 == num2 && num1 == num3) {
            System.out.println(10000 + num1 * 1000);
        }else if (num1 == num2 || num1 == num3 ) {
            System.out.println(1000 + num1 * 100);
        }else if (num2 == num3) {
            System.out.println(1000 + num2* 100);
        }else System.out.println((max*100));
    }

}