import java.util.Scanner;
public class exc15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three sides of a triangle.");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a < b + c && b < a+c && c < a+b) 
            System.out.println("Given triangle with sides [" + a + " " + b + " " + c + "] is a valid triangle!!");
        else
            System.out.println("-----INVALIDITY!!!---- \n Given triangle is not a valid triangle.");
    }
}
