package maiordedezoito;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaiorIdade {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        String name = bis.readLine();
        int idade = Integer.parseInt(bis.readLine());

        if (idade < 18) {
            System.out.println("Crescer um pouco mais");
        }
    }
}
