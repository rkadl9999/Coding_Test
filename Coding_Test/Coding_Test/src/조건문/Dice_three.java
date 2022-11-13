package 조건문;

import java.util.Scanner;

public class Dice_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = 0;
        int[] num = new int[3];
        for(int i=0; i<num.length; i++)
            num[i] = sc.nextInt();
        
        if(num[0] == num[1] && num[0] == num[2]) //3개의 눈이 모두 같은 값일 때
            money = 10000 + num[0] * 1000;
        else if(num[0] != num[1] && num[0] != num[2] && num[1] != num[2]){ //3개의 눈이 모두 다른 값일 때
            int tmp = 0;
            for(int i=0; i<num.length; i++)
                if(num[i] >= tmp)
                    tmp = num[i];
            money = tmp * 100;
        }
        else{ //같은 눈이 2개만 나오는 경우
            if(num[0] == num[1] || num[0] == num[2])
                money = 1000 + num[0] * 100;
            else if(num[1] == num[2])
                money = 1000 + num[1] * 100;
        }
        System.out.println(money);
    }
}
