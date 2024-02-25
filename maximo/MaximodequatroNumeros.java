package maximo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaximodequatroNumeros {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        int maximo1 = a > b ? a : b;
        int maximo2 = c > d ? c : d;
        int maximo = maximo1 > maximo2 ? maximo1 : maximo2;
        System.out.println(maximo);
    }
}