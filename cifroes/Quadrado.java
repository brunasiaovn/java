package cifroes;
 
 public class Quadrado {
    public static void main(String[] args) {

        int i = 0;

        while (i < 10) {
            int j = 0;
            while (j < 10) {
                System.out.print("$");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}