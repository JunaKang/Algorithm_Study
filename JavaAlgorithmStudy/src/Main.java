import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int Testnumber = Integer.parseInt(br.readLine());
        br.close();
        for (int i=1; i<=Testnumber; i++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write((Integer.parseInt(st.nextToken())));
        }
    }
}
