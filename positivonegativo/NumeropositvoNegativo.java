package positivonegativo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumeropositvoNegativo {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        if (a > 0) {
            a = a * 2;
        } else if (a < 0) {
            a = a + 1;
        }
        System.out.println(a);
    }
    
}