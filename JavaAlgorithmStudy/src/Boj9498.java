import java.util.Scanner;

public class Boj9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if (90 <= num1 && num1 <=100 ) {
            System.out.println("A");
        } else if (80 <= num1 && num1 <= 89) {
            System.out.println("B");
        } else if (70 <= num1 && num1 <= 79) {
            System.out.println("C");
        } else if (60 <= num1 && num1 <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }

}
