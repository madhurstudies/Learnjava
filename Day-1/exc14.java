import java.util.Scanner;
public class exc14 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three angles: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a + b + c == 180)
            System.out.println("Triangle with angles [" + a + " " + b + " " + c + "] is valid!.");
        else    
            System.out.println("Triangle with angles" + a + " " + b + " " + c + " is INVALID!!.");
            
    }
}
