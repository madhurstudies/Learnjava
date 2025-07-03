import java.util.ArrayList;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        int x = sc.nextInt();
        int y = 1;
        boolean noprime = false;
        ArrayList<Integer> factors = new ArrayList<>();
        factors.add(1);
        System.out.println();
        while (y <= x) {
            if (x % y == 0 && x == y) {
                System.out.println("It is a prime number.");
                factors.add(y);
                break;
            }
            if (x % y == 0 && x != y && y != 1) {
                noprime = true;
                factors.add(y);
            }
            y++;
        }
        if (noprime) {
            System.out.println("Given number is not a prime number.");
            System.out.println("Its factors are - " + factors);
        }
    }
}
