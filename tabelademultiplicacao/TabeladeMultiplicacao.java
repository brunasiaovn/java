package tabelademultiplicacao;

public class TabeladeMultiplicacao {
    public static void main(String[] args) {
        for (int b = 1; b <= 10; b++) {
            for (int p = 1; p <= 10; p++) {
                System.out.print(b * p);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
