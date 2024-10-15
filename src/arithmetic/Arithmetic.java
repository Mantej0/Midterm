package arithmetic;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        double result = r.calculate(m, n);
        System.out.println("result: " + result);
    }
}

