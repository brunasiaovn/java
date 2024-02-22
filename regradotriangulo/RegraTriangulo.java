package regradotriangulo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegraTriangulo {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if ((a < b + c) && (b < c + a) && (c < a + b)) {
            System.out.println("O triângulo é possível.");
        } else {
            System.out.println("O triângulo não é possível.");
        }
    }
}
