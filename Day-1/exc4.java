import java.util.Scanner;
public class exc4 {
    // Condition for leap year
    // A leap year is a year that is divisible by 4. 
    // However, if the year is also divisible by 100, it is not a leap year unless it is also divisible by 400. 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter a year.");
        x = sc.nextInt();

        String t = " is a leap year.";
        String f = " is not a leap year.";
        
        if (x % 100 == 0 && x % 400 == 0)
            System.out.println(x + t);
        else if (x % 100 == 0 && x % 400 != 0)
            System.out.println(x + f);
        else if (x % 4 == 0)
            System.out.println(x + t);
        else
            System.out.println(x + f);
    }
}
