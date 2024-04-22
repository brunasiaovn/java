package consolebased;

import java.io.BufferedReader;
import java.io.InputStreamReader;

 public class Cofrinho {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        while (true) {
            String command = reader.readLine();
            if (command.equals("sum")) {
                System.out.println(sum);
                return;
            }
            int a = Integer.parseInt(command);
            sum += a;
        }
    }
}