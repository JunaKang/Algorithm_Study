//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int sum = 0;
//        int i;
//        for (i = 1; i <= N; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int i;
        for (i = 1; i <= N; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}