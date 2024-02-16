package textotres;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Texto {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        System.out.println(name + " makes $120,000 a year. Ha-ha-ha!");
    }
}