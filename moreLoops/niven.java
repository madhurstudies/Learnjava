package moreLoops;

import java.util.Scanner;

public class niven {
    // 12 < sum of digit is 3 < 12 divisible by 3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter.");
        int num = sc.nextInt();
        int check = num;
        int rem = num;
        int sum = 0;
        while (num != 0) {
            rem = num % 10;
            num = num / 10;
            sum += rem;
        }
        if (check % sum == 0) {
            System.out.println(check + " is niven number.");
        } else {
            System.out.println(check + " is not a niven number.");
        }
    }
}
