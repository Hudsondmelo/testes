import java.util.Scanner;

public class testIf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("digite o primeiro numero num1: ");
        num1 = input.nextInt();
        System.out.println("digite o segundo nu1mero num2: ");
        num2 = input.nextInt();

        if (num1 > num2)
            System.out.print("num1 maior que num2");
        else if (num1 < num2)
            System.out.print("num2 maior que num1");
        else if (num1 == num2)
            System.out.print("num1 igual a num2");



    }
}
