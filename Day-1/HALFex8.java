import java.util.Scanner;
import java.util.ArrayList;
public class HALFex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        x = sc.nextLine();
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");
        list.add("k");
        list.add("l");
        list.add("m");
        list.add("n");
        list.add("o");
        list.add("p");
        list.add("q");
        list.add("r");
        list.add("s");
        list.add("t");
        list.add("u");
        list.add("v");
        list.add("w");
        list.add("x");
        list.add("y");
        list.add("z");
        
        Boolean found = false;
        for (String check : list) {
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
