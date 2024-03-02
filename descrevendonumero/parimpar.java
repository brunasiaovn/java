package descrevendonumero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class parimpar {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bis.readLine());
        if (a > 0 && a < 10 && a % 2 == 0) {
            System.out.println("even single-digit number");
        } else if (a > 0 && a < 10 && a % 2 != 0) {
            System.out.println("odd single-digit number");
        } else if (a > 9 && a < 100 && a % 2 == 0) {
            System.out.println("even two-digit number");
        } else if (a > 9 && a < 100 && a % 2 != 0) {
            System.out.println("odd two-digit number");
        } else if (a > 99 && a < 1000 && a % 2 == 0) {
            System.out.println("even three-digit number");
        } else if (a > 99 && a < 1000 && a % 2 != 0) {
            System.out.println("odd three-digit number");
        }
    }
}