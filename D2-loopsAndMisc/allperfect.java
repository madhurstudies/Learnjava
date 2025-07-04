
import java.util.Scanner;

public class allperfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press a number and then enter to start.");
        int start = sc.nextInt();

        int x = 1;
        int y = 1;
        int sum = 0;
        while (true) {
            System.out.println("Current number " + x);
            while (y < x) {
                if (x % y == 0) {
                    // System.out.println(y + " isfactof " + x);
                    sum += y;
                }
                y++;
            }
            if (sum == x) {
                System.out.println("--------");
                System.out.println(x + " -----PERFECT NUMBER-----");
                System.out.println("--------");
            } 
            // else {
            //     System.out.println("Sum : " + sum);
            //     System.out.println(sum + " != " + x );
            // }
            x++;
            y = 1;
            sum = 0;
        }

    }
}
