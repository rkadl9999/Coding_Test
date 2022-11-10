package 입출력과_사칙연산;

import java.util.Scanner;

public class Baekjoon_18108 {
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);

        int Thailand_year = sc.nextInt();

        int Korea_year = Thailand_year - 543;

        System.out.println(Korea_year);
    }
}
