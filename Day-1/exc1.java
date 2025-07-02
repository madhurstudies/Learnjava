import java.util.Scanner;

public class exc1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        if (a > b)
            System.out.println("max : " + a);
        else
            System.out.println("max : " + b);
    }
    // Test complete, pass

}