package 조건문;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int quadrant = 0;

        if(x > 0 && y > 0)
            quadrant = 1;
        else if(x > 0 && y < 0)
            quadrant = 4;
        else if(x < 0 && y > 0)
            quadrant = 2;
        else if(x < 0 && y < 0)
            quadrant = 3;

        System.out.println(quadrant);
    }
}
