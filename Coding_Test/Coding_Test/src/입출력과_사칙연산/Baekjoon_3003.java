package 입출력과_사칙연산;

import java.util.Scanner;

public class Baekjoon_3003 {
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);
        int[] Chess = {1,1,2,2,2,8};

        String[] error_chess = sc.nextLine().split(" ");

        int[] result = new int[Chess.length];
        for (int i=0; i<Chess.length; i++){
            result[i] = Chess[i] - Integer.parseInt(error_chess[i]);
            System.out.print(result[i] + " ");
        }
    }
}
