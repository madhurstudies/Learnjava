import java.util.Scanner;
import java.util.ArrayList;
public class HALFex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        x = sc.nextLine();
        ArrayList<String> conso = new ArrayList<>();
        conso.add("a");
        conso.add("b");
        conso.add("c");
        conso.add("d");
        conso.add("e");
        conso.add("f");
        conso.add("g");
        conso.add("h");
        conso.add("i");
        conso.add("j");
        conso.add("k");
        conso.add("l");
        conso.add("m");
        conso.add("n");
        conso.add("o");
        conso.add("p");
        conso.add("q");
        conso.add("r");
        conso.add("s");
        conso.add("t");
        conso.add("u");
        conso.add("v");
        conso.add("w");
        conso.add("x");
        conso.add("y");
        conso.add("z");
        
        Boolean found = false;
        for (String check : conso) {
            if (check.equals(x)) {
                System.out.println("It is an alphabet.");
                found = true;
            }
        }
        if (found != true) {
            System.out.println("Given is not alphabet.");
        }
        


    }
}
