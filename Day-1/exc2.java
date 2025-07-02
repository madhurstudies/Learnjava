import java.util.Scanner;
public class exc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        System.out.println("Enter third number");
        c = sc.nextInt();

        if (a > b && a > c)
            System.out.println("Max: " + a);
        else if (b > a && b > c)
            System.out.println("Max: " + b);
        else
            System.out.println("Max: " + c);

        
    }
}
