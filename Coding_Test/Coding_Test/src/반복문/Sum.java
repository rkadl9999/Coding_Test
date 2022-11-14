package 반복문;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int result = 0;

        for (int i=1; i<=cnt; i++)
            result += i;

        System.out.println(result);
    }
}
