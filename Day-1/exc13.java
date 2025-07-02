import java.util.Scanner;
public class exc13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number");
        int x = sc.nextInt();
        if (x < 8 && x > 0) {
            if (x % 2 == 0) 
                System.out.println(x + " month number has 30 days");
            else   
                System.out.println(x + " month number has 31 days");
        }
        else if (x == 8)
            System.out.println(x + " month number has 31 days");
        else if (x > 8 && x <= 12) {
            if (x % 2 == 0) {
                System.out.println(x + " month number has 31 days");
            }
            else
                System.out.println(x + " month number has 30 days");
        }
        else
            System.out.println("Wrong month number entered !! (enter number between 1 to 12 !!)");
    }
}
