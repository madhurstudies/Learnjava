import java.util.Scanner;

public class exc12 {
    public static void main(String[] args) {
        System.out.println("---WEEK START FROM MONDAY---");
        System.out.println("----------");
        System.out.println("Enter week number.");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x == 1)
            System.out.println("Monday");
        if (x == 2)
            System.out.println("Tuesday");
        if (x == 3)
            System.out.println("wednesday");
        if (x == 4)
            System.out.println("Thursday");
        if (x == 5)
            System.out.println("Friday");
        if (x == 6)
            System.out.println("Saturday");
        if (x == 7)
            System.out.println("Sunday");

    }
}
