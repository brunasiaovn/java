package negativopositivo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class imparpar {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bis.readLine());
        if (a == 0) {
            System.out.println("Zero");
        } else if (a > 0 && a % 2 == 0) {
            System.out.println("Número positivo par");
        } else if (a > 0 && a % 2 != 0) {
            System.out.println("Número positivo ímpar");
        } else if (a < 0 && a % 2 == 0) {
            System.out.println("Número negativo par");
        } else if (a < 0 && a % 2 != 0) {
            System.out.println("Número negativo ímpar");
        }
    }
}