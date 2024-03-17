package adicionando;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * InserirNumeros
 */
public class InserirNumeros {
        public static void main(String[] args) throws Exception {
            BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
    
            int sum = 0;
            while (true) {
                int a = Integer.parseInt(bis.readLine());
                sum += a;
    
                if (a == -1) {
                    System.out.println(sum);
                    return;
                }
            }
        }
    }
