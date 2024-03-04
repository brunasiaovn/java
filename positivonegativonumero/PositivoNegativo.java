package positivonegativonumero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositivoNegativo {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bis.readLine());
        int b = Integer.parseInt(bis.readLine());
        int c = Integer.parseInt(bis.readLine());
        int contPositive = 0;
        int contNegative = 0;
        if (a > 0) {
            contPositive++;
        } else if (a < 0) {
            contNegative++;
        }
        if (b > 0) {
            contPositive++;
        } else if (b < 0) {
            contNegative++;
        }
        if (c > 0) {
            contPositive++;
        } else if (c < 0) {
            contNegative++;
        }
        System.out.println("Number of negative numbers: " + contNegative);
        System.out.println("Number of positive numbers: " + contPositive);
    }
}