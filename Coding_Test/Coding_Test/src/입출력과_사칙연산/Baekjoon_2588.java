package 입출력과_사칙연산;

import java.util.Scanner;

public class Baekjoon_2588 {
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int B_1 = B%10;
        int B_2 = B%100 - B_1;
        int B_3 = B%1000 - (B_1 + B_2);

        int step1 = B_1 * A;
        int step2 = B_2 * A / 10;
        int step3 = B_3 * A / 100;
        int sum = step1 + (step2*10) + (step3*100);

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(sum);
    }
}
