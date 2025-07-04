
import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int x = sc.nextInt();
        int y = 1;
        int sum = 0;
        while (y < x) {
            if (x % y == 0) {
                sum += y;
            }
            y++;
        }
        if (sum == x) {
            System.out.println(x +" is a perfect number.");
        } else {
            System.out.println(x + " is not a perfect number.");
        }

        
    }
}
