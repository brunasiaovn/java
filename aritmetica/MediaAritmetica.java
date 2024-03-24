package aritmetica;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MediaAritmetica {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        int count = 0;
        while (true) {
            int a = Integer.parseInt(bis.readLine());

            if (a == -1) {
                System.out.println(sum / count);
                return;
            }
            count++;
            sum += a;
        }
    }
}