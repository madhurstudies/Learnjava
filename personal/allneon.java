package personal;

import java.util.Scanner;

public class allneon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int check = num;
        int sum = 0;

        // seperating digits of square
        while (true) {
            int sq = num * num;
            int rem = sq;
            while (sq != 0) {
                rem = sq % 10;
                sq = sq / 10;
                sum += rem;
            }
            // condition
            if (num == sum) {
                System.out.println(num);
            }
            sum = 0;
            num++;
        }
    }
}
