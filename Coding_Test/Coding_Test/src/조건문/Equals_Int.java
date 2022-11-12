package 조건문;

import java.util.Scanner;

public class Equals_Int{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer A = sc.nextInt(); //int / Integer 차이 : int = 산술연산이 가능 , Integer 객체이므로 언패킹하지 않으면 산술연산 불가능ㄴㄴㄴ
        Integer B = sc.nextInt();

        switch (A.compareTo(B)) {
            case -1:
                System.out.println("<");
                break;
            case 0:
                System.out.println("==");
                break;
            case 1:
                System.out.println(">");
                break;
            default:
                break;
        }
    }
}