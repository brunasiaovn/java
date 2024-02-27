package inserirnome;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Nome {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        if (name1.equals(name2)) {
            System.out.println("Os nomes são idênticos");
        } else if (name1.length() == name2.length()) {
            System.out.println("Os nomes têm o mesmo comprimento");
        }
    }
}