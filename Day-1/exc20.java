import java.util.Scanner;
public class exc20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input basic salary: ");
        double x = sc.nextInt();
        if (x >= 10000 && x < 20000) {
            //hra 20, DA 80
            double hra = x*(20.0/100);
            double da = x*(80.0/100);
            System.out.println("hra: " + hra);
            System.out.println("da: " + da);
            double fin = x + hra + da;
            System.out.println("Final income: " + fin);
        } else if (x >= 20000 && x < 30000) {
            double hra = x*(25.0/100);
            double da = x*(90.0/100);
            System.out.println("hra: " + hra);
            System.out.println("da: " + da);

            double fin = x + hra + da; 
            System.out.println("Final income: " + fin);
        } else if (x >= 30000) {
            double hra = x*(30.0/100);
            double da = x*(95.0/100);
            System.out.println("hra: " + hra);
            System.out.println("da: " + da);
            double fin = x+hra+da;
            System.out.println("Final income: " + fin);
        } else 
            System.out.println("Invalid input detected \n Your input was: " + x + "\n enter number > 10000");
    }
}
