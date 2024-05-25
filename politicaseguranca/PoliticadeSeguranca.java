package politicaseguranca;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PoliticadeSeguranca {

    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        @SuppressWarnings("unused")
        String nome = bis.readLine();
        int idade = Integer.parseInt(bis.readLine());

        if (idade > 20) {
            System.out.println("18 é idade suficiente");
        }
    }
}