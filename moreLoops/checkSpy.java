package moreLoops;

import java.util.Scanner;

public class checkSpy {
    // 1124 > sum of digit is 8, product of digit is 8.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter.");
        int num = sc.nextInt();
        int rem = num;
        int sum = 0;
        int product = 1;
        while (num != 0) {
            rem = num % 10;
            num = num / 10;
            sum += rem;
            product *= rem;
        }
        if (sum == product) {
            System.out.println("It is spy number.");
        } else  
            System.out.println("It is not a Spy number.");
    }
}
