package minimo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//mínimo de dois números
public class MinimodedoisNumero {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int min = a < b ? a : b;
        System.out.println(min);
    }
}
