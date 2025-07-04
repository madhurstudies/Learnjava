import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter.");
        int x = sc.nextInt();
        System.out.println("-----");
        while (x >= 1) {
            System.out.println(x);
            x--;
        }   
        System.out.println("-----");
    }
}