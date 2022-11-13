package 조건문;

import java.util.Scanner;

public class Oven_Clock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();
        int time = sc.nextInt();

        if(min + time >= 60){
            hour += (min + time) / 60;
            if(hour >= 24)
                hour -= 24;
            min = (min + time) % 60;
            if(min >= 60)
                min -= 60;
        }
        else if(min + time < 60)
            min += time;

        System.out.println(hour + " " + min);
    }
}
