package previsoes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Previsao {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String money = reader.readLine();
        String years = reader.readLine();

        System.out.println(name + " will receive " + money + " in " + years + " years.");
    }
}
