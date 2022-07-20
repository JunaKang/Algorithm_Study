import java.util.Scanner;

public class Boj2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        int num2 = sc.nextInt();
        String[] strArr = num1.split(" ");
//        String ret1 = strArr[0];
//        String ret2 = strArr[1];
        int h = Integer.parseInt(strArr[0]);
        int m = Integer.parseInt(strArr[1]);
        int H = h + (m + num2) / 60;
        int M = (m + num2) % 60;

        if (H >= 24) {
            H -= 24;
        }

        System.out.println(H + " " + M);
    }
}
//        System.out.println(A + " " + (B + num2));
//    } else if (B + num2 >= 60 && B + num2 % 60 == 0) {
//            System.out.println((A + (num2 / 60)) + " " + 0);
//        }else if (A == 23 && (B+num2) >60) {
//            System.out.println(0 +" "+((B+num2)-60));
//        }else System.out.println((A+(num2/60)+" "+((B+num2)-60)));
//    }
//}