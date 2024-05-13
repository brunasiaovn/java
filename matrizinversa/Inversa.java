package matrizinversa;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Inversa {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        String[] array = new String[10];
        for (int i = 0; i < 8; i++) {
            array[i] = bis.readLine();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}