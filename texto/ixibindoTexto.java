package texto;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ixibindoTexto {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String years = reader.readLine();
        String name = reader.readLine();
        
        System.out.println(name + " will take over the world in" + years + "years. Mwa-ha-ha!");
    }
}