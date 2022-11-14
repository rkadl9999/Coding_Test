package 반복문;

import java.util.Scanner;

public class Plus_Repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        for (int i = 0; i < cnt; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a + b;

            System.out.println(result);
        }
    }
}
