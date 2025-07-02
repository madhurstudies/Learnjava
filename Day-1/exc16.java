import java.util.Scanner;

public class exc16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("---We assume your triangle is valid.--- \n Enter three Sides: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a == b && b == c && a == c) {
            System.out.println("Equilateral Triangle.");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isoceles Triangle.");
        } else {
            System.out.println("Scalene triangle.");
        }
        
    }
}