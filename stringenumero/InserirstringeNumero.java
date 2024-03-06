package stringenumero;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InserirstringeNumero {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        String name = bis.readLine();
        int i = Integer.parseInt(bis.readLine());

        while (i > 0) {
            System.out.println(name);
            i--;
        }
    }
}
