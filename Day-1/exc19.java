import java.util.Scanner;
// p,ch,m,b,com
public class exc19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,ch,m,b,com;
        System.out.println("Enter marks below in order of physics, chemistry, maths,  bio & computer respectively.");
        System.out.println("(entry confirmation shown by dotted line.)");
        System.out.println("---physics---");
        p = sc.nextInt();
        System.out.println("---chem---");
        ch = sc.nextInt();
        System.out.println("---maths---");
        m = sc.nextInt();
        System.out.println("---bio---");
        b = sc.nextInt();
        System.out.println("---computer---");
        com = sc.nextInt();
        System.out.println("---------");
        
        int tot = p+ch+m+b+com;
        double per = (tot/500.0)*100;

        System.out.println("Total marks: " + tot);
        System.out.println("Percentage: " + per + "%");

        if (per > 90)
            System.out.println("Grade A");
        else if (per > 80)
            System.out.println("Grade B");
        else if (per > 70)
            System.out.println("Grade C");
        else if (per > 60)
            System.out.println("Grade D");
        else if (per > 40)
            System.out.println("Grade E");
        else if (per <= 40)
            System.out.println("Grade F");
        
        System.out.println("----end----");

    }
}
