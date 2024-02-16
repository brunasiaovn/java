package inteirotresdigitos;

public class SomadetresDigitos {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int numero) {
        int soma = 0;
        soma = soma + numero % 10;
        numero = numero / 10;
        soma = soma + numero % 10;
        numero = numero / 10;
        soma = soma + numero % 10;
        return soma;
    }
}
