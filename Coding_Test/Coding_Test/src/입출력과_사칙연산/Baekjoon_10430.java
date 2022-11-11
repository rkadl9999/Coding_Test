package 입출력과_사칙연산;

import java.util.Scanner;

public class Baekjoon_10430 {
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int[] res = new int[4];

        res[0] = (A+B) % C;
        res[1] = ((A%C) + (B%C)) % C;

        res[2] = (A*B) % C;
        res[3] = ((A%C) * (B%C)) % C;

        for (int i=0; i<res.length; i++)
            System.out.println(res[i]);
    }
}
