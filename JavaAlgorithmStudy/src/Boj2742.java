import java.io.*;

public class Boj2742 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        br.close();

        for (int i = num; i >= 1 ; i-- ) {
            bw.write(i +"\n");
        }
        bw.flush();
        bw.close();
    }
}
