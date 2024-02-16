package ixibirfrase;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IxibindoumaFrase {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String salario = reader.readLine();

        String texto = String.format("I will earn $" + salario + " per hour", salario);
        System.out.println(texto);
    }
}