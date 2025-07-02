import java.util.Scanner;
import java.util.ArrayList;
public class HALFexc9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        x = sc.nextLine();
        ArrayList<String> conso = new ArrayList<>();
        conso.add("b");
        conso.add("c");
        conso.add("d");
        conso.add("f");
        conso.add("g");
        conso.add("h");
        conso.add("j");
        conso.add("k");
        conso.add("l");
        conso.add("m");
        conso.add("n");
        conso.add("p");
        conso.add("q");
        conso.add("r");
        conso.add("s");
        conso.add("t");
        conso.add("v");
        conso.add("w");
        conso.add("x");
        conso.add("y");
        conso.add("z");
        ArrayList<String> vow = new ArrayList<>();
        vow.add("a");
        vow.add("e");
        vow.add("i");
        vow.add("o");
        vow.add("u");

        Boolean consof = false;
        Boolean vowf = false;

        for (String check : vow) {
            if (check.equals(x)) {
                vowf = true;
            }
        }
        for (String check : conso) {
            if (check.equals(x)) {
                consof = true;
            }
        }
        if (consof) {
            System.out.println(x + " is a consonant");
        }
        if (vowf) {
            System.out.println(x + " is a vowel");
        }

    }
}
