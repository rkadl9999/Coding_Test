package 입출력과_사칙연산;

import java.util.Scanner;

public class arithmetic_operation {
    public static void main(String[] argc) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int Plus = A + B;
        int Minus = A - B;
        int Multiply = A * B;
        int Divide = A / B;
        int Remainder = A % B;

        System.out.println(Plus);
        System.out.println(Minus);
        System.out.println(Multiply);
        System.out.println(Divide);
        System.out.println(Remainder);
    }
}
