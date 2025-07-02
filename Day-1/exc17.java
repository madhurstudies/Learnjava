import java.util.Scanner;
public class exc17 {
    // ¹²³⁴⁵⁶⁷⁸⁹⁰
    public static void main(String[] args) {
        System.out.println("--Finding Roots--");
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("in ax² + bx + c = 0");
        System.out.println("Enter a, b, c respectively.");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println();
        System.out.println("Formed equation is -");
        System.out.println(a + "x²" + " + " + b + "x" + " + " + c + " = 0");
        double d = Math.sqrt(1.0*b*b - 4.0*a*c);
        System.out.println();
        if (1.0*b*b - 4.0*a*c < 0)
            System.out.println("Imaginary roots!!!");
            System.out.println();
        double x1 = (-b - d)/2.0*a;
        double x2 = (-b + d)/2.0*a;

        System.out.println("Roots are :-");
        System.out.println("[" + x1 + " " + x2 + "]");
    }
}
