package personal;

import java.util.Scanner;

public class allspy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start by type-n-enter");
        char start = sc.nextLine().charAt(0);
        int num = 1;
        int sum = 0;
        int product = 1;
        while (true) {
            int check = num;
            int rem = num;
            while (check != 0) {
                rem = check % 10;
                check = check / 10;
                sum += rem;
                product *= rem;
            }
            if (sum == product) {
                System.out.println(num);
            }
            num++;
            sum = 0;
            product = 1;

        }

    }
}
