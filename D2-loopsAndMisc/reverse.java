import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter.");
        int num = sc.nextInt();
        int rem = num;
        while (num != 0) {
            rem = num % 10;
            num = num / 10;
            System.out.print(rem);
        }
        
    }
}