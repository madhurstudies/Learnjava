import java.util.Scanner;
public class exc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if (a > 0)
            System.out.println("positive.");
        else if (a < 0)
            System.out.println("negative.");
        else 
            System.out.println("zero");
    }
}
