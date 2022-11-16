package 반복문;

import java.io.*;

public class Print_Star_Ver2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for (int i=cnt-1; i>=0; i--){
            for (int j=0; j<i; j++)
                bw.write(" ");
            for (int k=0; k<cnt-i; k++)
                bw.write("*");
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
