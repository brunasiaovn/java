package retangulo;
/**
 * ForRetangulo
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ForRetangulo {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(bis.readLine());
        int n = Integer.parseInt(bis.readLine());

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print('8');
            }

            System.out.println();
        }
    }
}