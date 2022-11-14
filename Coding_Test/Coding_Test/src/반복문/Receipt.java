package 반복문;

import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total_price = sc.nextInt();
        int total_cnt = sc.nextInt();
        int total_compare = 0;

        for(int i=0; i<total_cnt; i++){
            int price = sc.nextInt();
            int count = sc.nextInt();

            total_compare += price * count;
        }

        if (total_price == total_compare)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
