package tabelamultiplicacao;

/**
 * TabeladeMultiplicacao
 */
public class TabeladeMultiplicacao {
    public static void main(String[] args) throws Exception  {
        int i = 1;

        while (i < 11) {
            int j = 1;
            while (j < 11) {
                System.out.print(i * j);
                System.out.print(" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}