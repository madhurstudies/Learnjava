import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X = ");
        int x = sc.nextInt();
        int rem = x;
        int check = x;
        int sum = 0;
        int debug = 1;
        System.out.println();
        System.out.println("iterate wise status");
        System.out.println("no     x    rem     sum");
        while (x != 0) {
            rem = x % 10;
            x = x / 10;
            sum = sum + rem*rem*rem;
            System.out.println(debug+"     "+x + "     " + rem + "      " + sum);
            debug++;
        }
        if (sum == check) {
            System.out.println("Armstrong number.");
        } else {
            System.out.println("not armstrong.");
        }
    }
}
