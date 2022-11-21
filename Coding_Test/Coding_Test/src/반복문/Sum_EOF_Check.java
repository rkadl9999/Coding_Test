package 반복문;

import java.io.*;
import java.util.StringTokenizer;

public class Sum_EOF_Check {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String EOF_check = "";

        while((EOF_check = br.readLine()) != null && !EOF_check.isEmpty()) {
            st = new StringTokenizer(EOF_check," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int sum = A+B;

            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}
