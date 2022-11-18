package 반복문;

import java.io.*;
import java.util.StringTokenizer;

public class Sum_Ver4 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int sum = A+B;

            if (sum == 0)
                break;
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}
