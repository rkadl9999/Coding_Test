package 입출력과_사칙연산;

import java.util.Scanner;

public class Divide {
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);

        double A = sc.nextInt();
        double B = sc.nextInt();

        double result = A/B;

        System.out.println(result);
    }
}
