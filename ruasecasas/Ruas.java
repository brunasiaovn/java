package ruasecasas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ruas {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[15];
        for (int i = 0; i < 15; i++) {
            array[i] = Integer.parseInt(bis.readLine());
        }

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                sum1 += array[i];
            } else {
                sum2 += array[i];
            }
        }

        if (sum1 > sum2) {
            System.out.println("Even-numbered houses have more residents.");
        } else if (sum2 > sum1) {
            System.out.println("Odd-numbered houses have more residents.");
        }
    }
}