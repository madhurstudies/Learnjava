import java.util.Scanner;
public class exc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter a number: ");
        a = sc.nextInt();
        if (a % 2 == 0)
            System.out.println(a + " is even Number.");
        else    
            System.out.println(a + " is odd number.");
    }
}
