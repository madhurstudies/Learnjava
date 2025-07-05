package moreLoops;

import java.util.Scanner;

public class biggest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int big = 1;
        int rem = num;
        while (num != 0) {
            rem = num % 10;
            num = num / 10;
            if (rem > big) {
                big = rem;
            }
        }
        System.out.println("Biggest number: " + big);
    }
}
