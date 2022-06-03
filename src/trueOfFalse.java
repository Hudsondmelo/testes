import javax.swing.*;
import java.sql.SQLOutput;

public class trueOfFalse {

    public static void main(String[] args) {

        boolean a1;
        boolean a2;
        boolean a3;
        boolean a4;

        a1 = true;
        a2 = false;
        a3 = true;
        a4 = false;

        System.out.println("a1 && a2: " + (a1 && a2));
        System.out.println("a1 || a2: " + (a1 || a2));
        System.out.println("a3 && a4: " + (a3 && a4));
        System.out.println("a3 && a4: " + (a3 || a4));
        System.out.println("a1 && (a2 && a3): " + (a1 && (a2 && a3)));
        System.out.println("a1 && (a2 || a3): " + (a1 && (a2 || a3)));


    }
}
