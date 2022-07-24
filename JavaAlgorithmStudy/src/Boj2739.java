import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2739 {
    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        sc.close();
//
//        for (int i =1; i<=9; i++) {
//            System.out.println(num1+" * "+ i +" = "+(num1*i));
//        }
//    }
//}
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        br.close();

        for (int i=1; i<=9; i++){
            System.out.println(num1+" * "+ i +" = "+(num1*i));
        }
    }
}