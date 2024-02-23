package corsemaforo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Semaforo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());
        t = t % 5;
        if (t >= 0 && t < 3) {
            System.out.println("verde");
        } else if (t >= 3 && t < 4) {
            System.out.println("amarelo");
        } else if (t >= 4 && t < 5) {
            System.out.println("vermelho");
        }
    }
}