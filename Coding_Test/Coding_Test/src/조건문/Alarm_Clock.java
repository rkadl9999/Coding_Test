package 조건문;

import java.util.Scanner;

public class Alarm_Clock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();

        if(min >= 45){
            min = min - 45;
        }
        else if(min < 45){
            if(hour == 0)
                hour = 23;
            else
                hour--;
            min = min + 15;
        }

        System.out.println(hour + " " + min);
    }
}
