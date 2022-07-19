//import java.util.Scanner;
//
//public class Boj2753 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        if (num1 % 4 == 0 && num1 % 100 != 0 || num1 % 400 == 0) {
//            System.out.println(1);
//        } else
//            System.out.println(0);
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2753{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        if (num1 % 4 == 0 && num1 % 100 != 0 || num1 % 400 == 0) {
            System.out.println(1);
        } else
            System.out.println(0);
    }
}
