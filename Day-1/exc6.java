import java.util.Scanner;
public class exc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("----run----");
        a = sc.nextInt();
        if (a % 5 == 0 && a % 11 == 0)
            System.out.println(a + " is divisible by both 5 and 11.");
        else    
            System.out.println(a + " not divisble by both 5 and 11.");
    }
}
