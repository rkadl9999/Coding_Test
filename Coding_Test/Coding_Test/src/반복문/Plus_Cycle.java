package 반복문;

import java.io.*;

public class Plus_Cycle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int cnt = 0;
        int compare = num;

        do {
            num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
            cnt++;
        } while (compare != num);

        System.out.println(cnt);
    }
}
