package moreLoops;

import java.util.Scanner;

public class neon {
    // 9 square 9 is 81 and 8+1 is 9, so 9 is neon
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int check = num;
        int sq = num*num;
        int rem = sq;
        int sum = 0;

        // seperating digits of square
        while (sq != 0) {
            rem = sq % 10;
            sq = sq / 10;
            sum += rem;
        }
        if (sum == check) {
            System.out.println(check + " is neon");
        } else
            System.out.println(check + " is not neon.");

    }
}
