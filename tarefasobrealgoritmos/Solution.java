package tarefasobrealgoritmos;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE; // Inicialize com o menor valor possível

        String input;
        while ((input = reader.readLine()) != null && !input.isEmpty()) {
            int number = Integer.parseInt(input);
            if (number > maximum) {
                maximum = number;
            }
        }

        System.out.println("O máximo é: " + maximum);
    }
}

