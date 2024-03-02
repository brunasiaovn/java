package numeropositivo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Positivo {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bis.readLine());
        int b = Integer.parseInt(bis.readLine());
        int c = Integer.parseInt(bis.readLine());
        int cont = 0;
        if (a > 0) {
            cont++;
        }
        if (b > 0) {
            cont++;
        }
        if (c > 0) {
            cont++;
        }
        System.out.println(cont);
    }
}
