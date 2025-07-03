import java.util.Scanner;
public class exc18 {
    public static void main(String[] args) {
        int c,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price");
        c = sc.nextInt();
        System.out.println("Enter selling price");
        s = sc.nextInt();

        Boolean p = false;
        Boolean l = false;

        if (c > s){
            System.out.println("It is a loss");
            l = true;
        }
        else if (c < s){
            System.out.println("It is a profit.");
            p = true;
        }
        else
            System.out.println("Neither profit nor loss.");
        
        if(p){
            int calc = s - c;
            System.out.println("Profit by: " + calc);
        } else if (l) {
            int calc = c - s;
            System.out.println("Loss by: " + calc);
        }

    }
}
