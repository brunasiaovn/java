package diasdoano;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumerodiasdoAno {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int dias = Integer.parseInt(reader.readLine());

        if (dias % 4 == 0) {
            if ((dias % 100 == 0) && (dias % 400 != 0)) {
                dias = 365;
            } else {
                dias = 366;
            }
        } else {
            dias = 365;
        }

        System.out.println("Número de dias no ano: x " + dias);
    }
}
